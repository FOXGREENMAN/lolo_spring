CREATE TABLE `user_record` (
    `id` int NOT NULL AUTO_INCREMENT,
    `u_name` varchar(255) NOT NULL DEFAULT '' COMMENT '用户名',
    `u_age` int NOT NULL DEFAULT '0' COMMENT '用户年龄',
    `u_password` varchar(255) NOT NULL DEFAULT '' COMMENT '用户密码',
    `ctime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `mtime` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
    `expired_time` int NOT NULL DEFAULT '14' COMMENT '用户过期时间, 单位:天',
    PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8mb3 COMMENT='用户表';
-- test data
INSERT INTO `demo`.`user_record` (`id`, `u_name`, `u_age`, `u_password`, `ctime`, `mtime`, `expired_time`) VALUES (1, 'fox', 100, 'abc123', now(), NULL, 14);