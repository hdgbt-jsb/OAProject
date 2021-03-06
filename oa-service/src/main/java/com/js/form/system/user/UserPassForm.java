package com.js.form.system.user;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

import javax.validation.constraints.NotNull;

/**
 * @Author: jiangshuang
 * @Description: 系统用户修改密码的参数
 **/
@Data
@ToString
public class UserPassForm {
    @ApiModelProperty("学号")
    @NotNull(message = "学号不可以为空")
    private String studentNumber;

    @ApiModelProperty("密码")
    /** @NotBlank(message = "密码不可以为空") **/
    private String password;

    @ApiModelProperty("验证密码")
    private String repassword;

    @ApiModelProperty("忘记密码验证方式 1:邮箱 0：验证码")
    private String methodCode;
}