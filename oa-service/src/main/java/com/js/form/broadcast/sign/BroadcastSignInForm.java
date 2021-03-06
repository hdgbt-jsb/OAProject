package com.js.form.broadcast.sign;

import com.js.form.system.BasePageForm;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * @Author: jiangshuang
 * @Description: 节目相关签到日期数据
 **/
@Data
@ToString
@EqualsAndHashCode(callSuper=true)
public class BroadcastSignInForm extends BasePageForm {
    @ApiModelProperty("主键")
    private String uuid;

    @ApiModelProperty("节目id")
    private String programId;

    @ApiModelProperty("签到人")
    private String userId;

    @ApiModelProperty("当前所处教学周")
    private Integer teachingWeek;

    @ApiModelProperty("当前所处年度")
    private String academicYear;

    @ApiModelProperty("当前年度第几学期")
    private String academicTerm;
}