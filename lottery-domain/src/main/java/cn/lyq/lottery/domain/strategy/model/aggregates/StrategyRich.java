package cn.lyq.lottery.domain.strategy.model.aggregates;

import cn.lyq.lottery.infrastructure.po.Strategy;
import cn.lyq.lottery.infrastructure.po.StrategyDetail;

import java.util.List;

public class StrategyRich {

    //策略id
    private Long strategyId;

    //配置
    private Strategy strategy;

    private List<StrategyDetail> strategyDetailsList;

    private StrategyRich(){
    }

    public StrategyRich(Long strategyId, Strategy strategy, List<StrategyDetail> strategyDetailsList) {
        this.strategyId = strategyId;
        this.strategy = strategy;
        this.strategyDetailsList = strategyDetailsList;
    }

    public Long getStrategyId() {
        return strategyId;
    }

    public void setStrategyId(Long strategyId) {
        this.strategyId = strategyId;
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public List<StrategyDetail> getStrategyDetailsList() {
        return strategyDetailsList;
    }

    public void setStrategyDetailsList(List<StrategyDetail> strategyDetailsList) {
        this.strategyDetailsList = strategyDetailsList;
    }
}
