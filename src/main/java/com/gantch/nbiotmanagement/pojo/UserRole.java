package com.gantch.nbiotmanagement.pojo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author lcw332
 * Date 2019-12-18-15:11
 * Description:  nbiot-devies-management , com.gantch.nbiotdevicesmanagement.model
 * 角色 user_role
 **/
@Data
public class UserRole implements Serializable {

    private Long id;

    @ApiModelProperty(value = "名称")
    private String name;

    @ApiModelProperty(value = "描述")
    private String description;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "：0->禁用;1->启用")
    private Integer status;

    private static final long serialVersionUID = 1L;

}
