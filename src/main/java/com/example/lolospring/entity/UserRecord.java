package com.example.lolospring.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author gfc
 * @since 2021-12-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class UserRecord implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 用户名
     */
    private String uName;

    /**
     * 用户年龄
     */
    private Integer uAge;

    /**
     * 用户密码
     */
    private String uPassword;

    /**
     * 创建时间
     */
    private LocalDateTime ctime;

    /**
     * 修改时间
     */
    private LocalDateTime mtime;

    /**
     * 用户过期时间, 单位:天
     */
    private Integer expiredTime;


}
