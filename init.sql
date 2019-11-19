CREATE TABLE `daily_work_report` (
	`daily_work_report_id` VARCHAR ( 255 ) NOT NULL COMMENT '工作日报ID',
	`daily_work_report_content` MEDIUMTEXT NOT NULL COMMENT '工作日报内容',
	`user_id` VARCHAR ( 255 ) NOT NULL COMMENT '用户ID',
	`user_name` VARCHAR ( 255 ) NOT NULL COMMENT '用户名称',
	`daily_work_report_created_time` datetime DEFAULT NULL COMMENT '创建时间',
	`daily_work_report_updated_time` datetime DEFAULT NULL COMMENT '修改时间',
PRIMARY KEY ( `daily_work_report_id` ) USING BTREE
) ENGINE = INNODB DEFAULT CHARSET = utf8 ROW_FORMAT = COMPACT COMMENT = '工作日报';