package cn.lyq.lottery.domain.strategy.service.draw;

import cn.lyq.lottery.common.Constants;
import cn.lyq.lottery.domain.strategy.service.algorithm.IDrawAlgorithm;
import io.netty.util.Constant;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class DrawConfig {

    @Resource
    private IDrawAlgorithm entiretyRateRandomDrawAlgorithm;

    @Resource
    private IDrawAlgorithm singleRateRandomDrawAlgorithm;

    @Resource
    protected static Map<Integer,IDrawAlgorithm> drawAlgorithmGroup  = new ConcurrentHashMap<>();

    @PostConstruct
    public  void init(){
        drawAlgorithmGroup.put(Constants.StrategyMode.ENTIRETY.getCode(),entiretyRateRandomDrawAlgorithm);
        drawAlgorithmGroup.put(Constants.StrategyMode.SINGLE.getCode(),singleRateRandomDrawAlgorithm);

    }
}
