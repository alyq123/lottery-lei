package cn.lyq.lottery.domain.strategy.repository.impl;

import cn.lyq.lottery.domain.strategy.model.aggregates.StrategyRich;
import cn.lyq.lottery.domain.strategy.repository.IStrategyRepository;
import cn.lyq.lottery.infrastructure.dao.IAwardDao;
import cn.lyq.lottery.infrastructure.dao.IStrategyDao;
import cn.lyq.lottery.infrastructure.dao.IStrategyDetailDao;
import cn.lyq.lottery.infrastructure.po.Award;
import cn.lyq.lottery.infrastructure.po.Strategy;
import cn.lyq.lottery.infrastructure.po.StrategyDetail;
import org.apache.ibatis.annotations.Mapper;

import javax.annotation.Resource;
import java.util.List;

public class StrategyRepositor implements IStrategyRepository {

    @Resource
    private IStrategyDao strategyDao;

    @Resource
    private IStrategyDetailDao strategyDetailDao;

    @Resource
    private IAwardDao awardDao;

    @Override
    public StrategyRich queryStrategyRich(Long strategyId) {
        Strategy strategy = strategyDao.queryStrategy(strategyId);
        List<StrategyDetail> strategyDetailsList =
                strategyDetailDao.queryStrategyDetailList(strategyId);
        return
                new StrategyRich(strategyId,strategy,strategyDetailsList);
    }

    @Override
    public Award queryAwardInfo(String awardId) {
        return null;
    }
}
