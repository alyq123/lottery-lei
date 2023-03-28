package cn.lyq.lottery.domain.strategy.repository;

import cn.lyq.lottery.domain.strategy.model.aggregates.StrategyRich;
import cn.lyq.lottery.infrastructure.po.Award;

import java.util.List;

public interface IStrategyRepository {

    StrategyRich queryStrategyRich(Long strategyId);

    Award queryAwardInfo(String awardId);

    List<String> queryNOStockStrategyAwardList(Long strategyId);

    /**
     * 扣减库存
     * @param strategyId 策略ID
     * @param awardId    奖品ID
     * @return           扣减结果
     */
    boolean deductStock(Long strategyId, String awardId);
}
