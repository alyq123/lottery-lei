package cn.lyq.lottery.domain.strategy.repository;

import cn.lyq.lottery.domain.strategy.model.aggregates.StrategyRich;
import cn.lyq.lottery.infrastructure.po.Award;

public interface IStrategyRepository {

    StrategyRich queryStrategyRich(Long strategyId);

    Award queryAwardInfo(String awardId);
}
