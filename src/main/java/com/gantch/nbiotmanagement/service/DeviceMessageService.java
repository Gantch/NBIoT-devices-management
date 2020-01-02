package com.gantch.nbiotmanagement.service;

import com.gantch.nbiotmanagement.dto.DeviceMessageParam;

/**
 * @author lcw332
 * Date 2019-12-28-13:40
 * Description:  nbiot-management , com.gantch.nbiotmanagement.service
 **/
public interface DeviceMessageService {

    /**
     * 添加报警手机
     * @param param
     * @return
     */
    Integer insertDeviceMessage(DeviceMessageParam param);

    /**
     * 更新推送状态
     */
    Integer updateDevicePushStatus(String deviceId,Integer status);
}
