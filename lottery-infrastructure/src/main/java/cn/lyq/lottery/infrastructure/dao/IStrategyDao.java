package cn.lyq.lottery.infrastructure.dao;

import cn.lyq.lottery.infrastructure.po.Strategy;

public interface IStrategyDao {
    Strategy queryStrategy(Long strategyId);
}
