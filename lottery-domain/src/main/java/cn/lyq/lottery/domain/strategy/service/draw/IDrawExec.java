package cn.lyq.lottery.domain.strategy.service.draw;

import cn.lyq.lottery.domain.strategy.model.req.DrawReq;
import cn.lyq.lottery.domain.strategy.model.res.DrawResult;

public interface IDrawExec {

    DrawResult doDrawExec(DrawReq req);
}
