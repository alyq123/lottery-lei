package cn.lyq.lottery.interfaces;

//import cn.lyq.lottery.common.Constants;
//import cn.lyq.lottery.common.Result;
//import cn.lyq.lottery.infrastructure.dao.IActivityDao;
//import cn.lyq.lottery.infrastructure.po.Activity;
//import cn.lyq.lottery.rpc.IActivityBooth;
//import cn.lyq.lottery.rpc.dto.ActivityDto;
//import cn.lyq.lottery.rpc.req.ActivityReq;
//import cn.lyq.lottery.rpc.res.ActivityRes;
//import org.apache.dubbo.config.annotation.Service;
//
//import javax.annotation.Resource;
//
//@Service
//public class ActivityBooth implements IActivityBooth {
//
//    @Resource
//    private IActivityDao activityDao;
//
//    @Override
//    public ActivityRes queryActivityById(ActivityReq req) {
//        Activity activity = activityDao.queryActivityById(req.getActivityId());
//
//        ActivityDto activityDto = new ActivityDto();
//        activityDto.setActivityId(activity.getActivityId());
//        activityDto.setActivityName(activity.getActivityName());
//        activityDto.setActivityDesc(activity.getActivityDesc());
//        activityDto.setBeginDateTime(activity.getBeginDateTime());
//        activityDto.setEndDateTime(activity.getEndDateTime());
//        activityDto.setStockCount(activity.getStockCount());
//        activityDto.setTakeCount(activity.getTakeCount());
//
//        return new ActivityRes(new Result(Constants.ResponseCode.SUCCESS.getCode(),Constants.ResponseCode.SUCCESS.getInfo()));
//    }
//}

import cn.lyq.lottery.common.Constants;
import cn.lyq.lottery.common.Result;
import cn.lyq.lottery.infrastructure.dao.IActivityDao;
import cn.lyq.lottery.infrastructure.po.Activity;
import cn.lyq.lottery.rpc.IActivityBooth;
import cn.lyq.lottery.rpc.dto.ActivityDto;
import cn.lyq.lottery.rpc.req.ActivityReq;
import cn.lyq.lottery.rpc.res.ActivityRes;
import org.apache.dubbo.config.annotation.Service;

import javax.annotation.Resource;

@Service
public class ActivityBooth implements IActivityBooth {

    @Resource
    private IActivityDao activityDao;

    @Override
    public ActivityRes queryActivityById(ActivityReq req) {

        Activity activity = activityDao.queryActivityById(req.getActivityId());

        ActivityDto activityDto = new ActivityDto();
        activityDto.setActivityId(activity.getActivityId());
        activityDto.setActivityName(activity.getActivityName());
        activityDto.setActivityDesc(activity.getActivityDesc());
        activityDto.setBeginDateTime(activity.getBeginDateTime());
        activityDto.setEndDateTime(activity.getEndDateTime());
        activityDto.setStockCount(activity.getStockCount());
        activityDto.setTakeCount(activity.getTakeCount());

        return new ActivityRes(new Result(Constants.ResponseCode.SUCCESS.getCode(), Constants.ResponseCode.SUCCESS.getInfo()), activityDto);
    }

}