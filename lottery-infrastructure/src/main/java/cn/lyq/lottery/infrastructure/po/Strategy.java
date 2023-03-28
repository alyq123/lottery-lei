package cn.lyq.lottery.infrastructure.po;

import java.util.Date;

public class Strategy {

    private Long id;

    private Long stratrgyId;

    private String strategyDesc;

    private  Integer strategyMode; //策略方式[1.单体概率，2总体概率]

    private Integer grantType; //奖品发放方式[1:即时，2:定时[含活动结束]，3:人工]

    private Date grantDate;

    private String extInfo; //拓展信息

    private Date createTime;

    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getStratrgyId() {
        return stratrgyId;
    }

    public void setStratrgyId(Long stratrgyId) {
        this.stratrgyId = stratrgyId;
    }

    public String getStrategyDesc() {
        return strategyDesc;
    }

    public void setStrategyDesc(String strategyDesc) {
        this.strategyDesc = strategyDesc;
    }

    public Integer getStrategyMode() {
        return strategyMode;
    }

    public void setStrategyMode(Integer strategyMode) {
        this.strategyMode = strategyMode;
    }

    public Integer getGrantType() {
        return grantType;
    }

    public void setGrantType(Integer grantType) {
        this.grantType = grantType;
    }

    public Date getGrantDate() {
        return grantDate;
    }

    public void setGrantDate(Date grantDate) {
        this.grantDate = grantDate;
    }

    public String getExtInfo() {
        return extInfo;
    }

    public void setExtInfo(String extInfo) {
        this.extInfo = extInfo;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
