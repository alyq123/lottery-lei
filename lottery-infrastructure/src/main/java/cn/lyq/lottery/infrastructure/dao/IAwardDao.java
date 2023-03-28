package cn.lyq.lottery.infrastructure.dao;

import cn.lyq.lottery.infrastructure.po.Award;

public interface IAwardDao {

    Award queryAwardInfo(String awaedId);
}
