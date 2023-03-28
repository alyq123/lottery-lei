package cn.lyq.lottery.domain.strategy.service.algorithm.impl;

import cn.lyq.lottery.domain.strategy.model.vo.AwardRateInfo;
import cn.lyq.lottery.domain.strategy.service.algorithm.BaseAlgorithm;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

@Component("defaultRateRandomDrawAlgorighm")
public class DefaultRateRandomDrawAlgorithm extends BaseAlgorithm {

    @Override
    public String randomDraw(Long strategyId, List<String> excludeAwardIds) {
        BigDecimal differenceDenominator = BigDecimal.ZERO;

        //排除不在抽奖范围的奖品Id集合
        List<AwardRateInfo> differenceAwardRateList = new ArrayList<>();
        List<AwardRateInfo> awardRateIntervalValList = awardRateInfoMap.get(strategyId);
        for (AwardRateInfo awardRateInfo : awardRateIntervalValList){
            String awardId = awardRateInfo.getAwardId();
            if (excludeAwardIds.contains(awardId)){
                continue;
            }
            differenceAwardRateList.add(awardRateInfo);
            differenceDenominator = differenceDenominator.add(awardRateInfo.getAwardRate());

        }

        //前置判断
        if (differenceAwardRateList.size() == 0) return "";
        if (differenceAwardRateList.size() == 1) return differenceAwardRateList.get(0).getAwardId();

        //获取随机概率值
        SecureRandom secureRandom = new SecureRandom();
        int randomVal = secureRandom.nextInt(100);


        // 循环获取奖品
        String awardId = "";
        int cursorVal  = 0;
        for (AwardRateInfo awardRateInfo : differenceAwardRateList){
            int rateVal = awardRateInfo.getAwardRate().divide(differenceDenominator,2,BigDecimal.ROUND_UP).multiply(new BigDecimal(100)).intValue();
            if (randomVal <= (cursorVal + rateVal)){
                awardId = awardRateInfo.getAwardId();
                break;
            }
            cursorVal += rateVal;
        }

        //返回中奖结果
        return awardId;

    }
}
