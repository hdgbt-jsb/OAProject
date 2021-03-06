package com.js.dto.broadcast;

import com.js.dto.system.BasePageDto;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.Date;

/**
 * @Author: jiangshuang
 * @Description: 节目错误相关实体类
 **/
@Data
@ToString
@EqualsAndHashCode(callSuper=true)
public class BroadcastMistakeDto extends BasePageDto {
    /** 主键 **/
    private String uuid;

    /** 节目id **/
    private String programId;

    /** 节目所属组别 **/
    private String groupId;

    /** 日期 **/
    private String broadcastDate;

    /** 错误描述 **/
    private String detail;

    /** 所处年度 **/
    private String academicYear;

    /** 所处学期 1：第一学期2：第二学期 **/
    private String academicTerm;

    /** 所处教学周 **/
    private Integer teachingWeek;

    /** 错误提交时间 **/
    private Date createData;

    /** 错误审核状态0:未审核1:已审核 **/
    private String status;
}