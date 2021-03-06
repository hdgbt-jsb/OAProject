package com.js.form.purview;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

import javax.validation.constraints.NotNull;

/**
 * @Author: jiangshuang
 * @Description: 用户对应权限实体类
 **/
@Data
@ToString
public class EditPurviewForm {
    @ApiModelProperty("主键uuid")
    @NotNull(message = "主键id不可以为空")
    private String uuid;

    @ApiModelProperty("用户名")
    private String userId;

    @ApiModelProperty("签到权限0：无权限1：有权限")
    private String manageSign;

    @ApiModelProperty("提交错误0：无权限1：有权限")
    private String submitBroadcastMistake;

    @ApiModelProperty("错误管理0：无权限1：有权限")
    private String manageBroadcastMistake;

    @ApiModelProperty("节目评估0：无权限1：有权限")
    private String evaluateProgram;

    @ApiModelProperty("评估管理0：无权限1：有权限")
    private String manageProgramEvaluation;

    @ApiModelProperty("系统管理0：无权限1：有权限")
    private String manageSystemConfig;
}