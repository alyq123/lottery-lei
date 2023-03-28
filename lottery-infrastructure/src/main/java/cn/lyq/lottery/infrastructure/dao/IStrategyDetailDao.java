package cn.lyq.lottery.infrastructure.dao;

import cn.lyq.lottery.infrastructure.po.StrategyDetail;

import java.util.List;

public interface IStrategyDetailDao {
    List<StrategyDetail> queryStrategyDetailList(Long strategyId);
}
