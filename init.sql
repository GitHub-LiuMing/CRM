--省
CREATE TABLE `province` (
	`PROVINCE_ID` INT ( 11 ) NOT NULL AUTO_INCREMENT COMMENT '自增列',
	`PROVINCE_CODE` VARCHAR ( 40 ) NOT NULL COMMENT '省份代码',
	`PROVINCE_NAME` VARCHAR ( 50 ) NOT NULL COMMENT '省份名称',
	`SHORT_NAME` VARCHAR ( 20 ) NOT NULL COMMENT '简称',
	`LNG` VARCHAR ( 20 ) DEFAULT NULL COMMENT '经度',
	`LAT` VARCHAR ( 20 ) DEFAULT NULL COMMENT '纬度',
	`SORT` INT ( 6 ) DEFAULT NULL COMMENT '排序',
	`GMT_CREATE` datetime DEFAULT NULL COMMENT '创建时间',
	`GMT_MODIFIED` datetime DEFAULT NULL COMMENT '修改时间',
	`MEMO` VARCHAR ( 250 ) DEFAULT NULL COMMENT '备注',
	`DATA_STATE` INT ( 1 ) DEFAULT NULL COMMENT '状态 0-不可用 1-可用',
	PRIMARY KEY ( `PROVINCE_ID` ) USING BTREE,
KEY `Index_1` ( `PROVINCE_CODE` ) USING BTREE
) ENGINE = INNODB AUTO_INCREMENT = 35 DEFAULT CHARSET = utf8 ROW_FORMAT = COMPACT COMMENT = '省份';

--市
CREATE TABLE `city` (
	`CITY_ID` INT ( 11 ) NOT NULL AUTO_INCREMENT COMMENT '自增列',
	`PROVINCE_CODE` VARCHAR ( 40 ) DEFAULT NULL COMMENT '省代码',
	`CITY_CODE` VARCHAR ( 40 ) NOT NULL COMMENT '城市代码',
	`CITY_NAME` VARCHAR ( 40 ) NOT NULL COMMENT '城市名称',
	`SHORT_NAME` VARCHAR ( 20 ) NOT NULL COMMENT '简称',
	`LNG` VARCHAR ( 20 ) DEFAULT NULL COMMENT '经度',
	`LAT` VARCHAR ( 20 ) DEFAULT NULL COMMENT '纬度',
	`SORT` INT ( 6 ) DEFAULT NULL COMMENT '排序',
	`GMT_CREATE` datetime DEFAULT NULL COMMENT '创建时间',
	`GMT_MODIFIED` datetime DEFAULT NULL COMMENT '修改时间',
	`MEMO` VARCHAR ( 250 ) DEFAULT NULL COMMENT '备注',
	`DATA_STATE` INT ( 1 ) DEFAULT NULL COMMENT '状态 0-不可用 1-可用',
	PRIMARY KEY ( `CITY_ID` ) USING BTREE,
KEY `Index_1` ( `CITY_CODE` ) USING BTREE
) ENGINE = INNODB AUTO_INCREMENT = 391 DEFAULT CHARSET = utf8 ROW_FORMAT = COMPACT COMMENT = '城市';

--区
CREATE TABLE `district` (
	`DISTRICT_ID` INT ( 11 ) NOT NULL AUTO_INCREMENT COMMENT '自增列',
	`CITY_CODE` VARCHAR ( 40 ) DEFAULT NULL COMMENT '城市代码',
	`DISTRICT_CODE` VARCHAR ( 40 ) NOT NULL COMMENT '地区代码',
	`DISTRICT_NAME` VARCHAR ( 40 ) NOT NULL COMMENT '地区名称',
	`SHORT_NAME` VARCHAR ( 20 ) NOT NULL COMMENT '简称',
	`LNG` VARCHAR ( 20 ) DEFAULT NULL COMMENT '经度',
	`LAT` VARCHAR ( 20 ) DEFAULT NULL COMMENT '纬度',
	`SORT` INT ( 6 ) DEFAULT NULL COMMENT '排序',
	`GMT_CREATE` datetime DEFAULT NULL COMMENT '创建时间',
	`GMT_MODIFIED` datetime DEFAULT NULL COMMENT '修改时间',
	`MEMO` VARCHAR ( 250 ) DEFAULT NULL COMMENT '备注',
	`DATA_STATE` INT ( 1 ) DEFAULT NULL COMMENT '状态 0-不可用 1-可用',
	PRIMARY KEY ( `DISTRICT_ID` ) USING BTREE,
KEY `Index_1` ( `DISTRICT_CODE` ) USING BTREE
) ENGINE = INNODB AUTO_INCREMENT = 3679 DEFAULT CHARSET = utf8 ROW_FORMAT = COMPACT COMMENT = '地区';

--用户
CREATE TABLE `user` (
	`user_id` VARCHAR ( 32 ) NOT NULL COMMENT '用户ID',
	`user_name` VARCHAR ( 255 ) NOT NULL COMMENT '姓名',
	`user_password` VARCHAR ( 255 ) NOT NULL COMMENT '密码',
	`user_head_img_url` VARCHAR ( 255 ) DEFAULT NULL COMMENT '头像路径',
	`user_type` INT ( 1 ) DEFAULT NULL COMMENT '用户类型 0-超级管理员 1-管理员 2-普通用户',
	`user_status` INT ( 1 ) NOT NULL DEFAULT '1' COMMENT '状态 0-禁用 1-正常',
	`user_create_date` datetime NOT NULL COMMENT '创建时间',
	`user_update_date` datetime NOT NULL COMMENT '更新时间',
PRIMARY KEY ( `user_id` ) USING BTREE
) ENGINE = INNODB DEFAULT CHARSET = utf8 ROW_FORMAT = COMPACT COMMENT = '用户';

--客户
CREATE TABLE `customer` (
	`customer_id` VARCHAR ( 32 ) NOT NULL COMMENT '客户ID',
	`customer_name` VARCHAR ( 255 ) NOT NULL COMMENT '客户名称',
	`customer_phone` VARCHAR ( 11 ) DEFAULT NULL COMMENT '客户电话',
	`customer_wechat` VARCHAR ( 32 ) DEFAULT NULL COMMENT '微信号',
	`customer_wangwang` VARCHAR ( 32 ) DEFAULT NULL COMMENT '阿里旺旺号',
	`customer_status_id` VARCHAR ( 32 ) NOT NULL COMMENT '客户状态ID',
	`customer_status_name` VARCHAR ( 255 ) NOT NULL COMMENT '客户状态名称',
	`user_id` VARCHAR ( 32 ) NOT NULL COMMENT '用户ID',
	`user_name` VARCHAR ( 255 ) NOT NULL COMMENT '用户名称',
	`last_follow_up_date` date DEFAULT NULL COMMENT '上次跟进时间',
	`province_code` VARCHAR ( 40 ) DEFAULT NULL COMMENT '省份ID',
	`province_short_name` VARCHAR ( 20 ) DEFAULT NULL COMMENT '省份简称',
	`city_code` VARCHAR ( 40 ) DEFAULT NULL COMMENT '城市ID',
	`city_short_name` VARCHAR ( 20 ) DEFAULT NULL COMMENT '城市简称',
	`district_code` VARCHAR ( 40 ) DEFAULT NULL COMMENT '地区ID',
	`district_short_name` VARCHAR ( 20 ) DEFAULT NULL COMMENT '地区简称',
	`customer_public_area_status` INT ( 1 ) DEFAULT '1' COMMENT '客户公海状态 0-未分配 1-已分配',
	`customer_created_date` datetime DEFAULT NULL COMMENT '创建时间',
	`customer_updated_date` datetime DEFAULT NULL COMMENT '修改时间',
PRIMARY KEY ( `customer_id` ) USING BTREE
) ENGINE = INNODB DEFAULT CHARSET = utf8mb4 ROW_FORMAT = COMPACT COMMENT = '客户';

--客户状态
CREATE TABLE `customer_status` (
	`customer_status_id` VARCHAR ( 32 ) NOT NULL COMMENT '客户状态ID',
	`customer_status_name` INT ( 1 ) DEFAULT NULL COMMENT '客户状态名称',
	`customer_status_status` INT ( 1 ) DEFAULT '1' COMMENT '客户状态状态 0-不可用 1-可用',
	`customer_status_created_date` datetime DEFAULT NULL COMMENT '创建时间',
	`customer_status_updated_date` datetime DEFAULT NULL COMMENT '修改时间',
PRIMARY KEY ( `customer_status_id` ) USING BTREE
) ENGINE = INNODB DEFAULT CHARSET = utf8mb4 ROW_FORMAT = COMPACT COMMENT = '客户状态';

--工作日报
CREATE TABLE `work_report` (
	`work_report_id` VARCHAR ( 32 ) NOT NULL COMMENT '工作报告ID',
	`work_report_user_id` VARCHAR ( 255 ) NOT NULL COMMENT '用户ID',
	`work_report_user_name` VARCHAR ( 255 ) NOT NULL COMMENT '用户名称',
	`work_report_content` MEDIUMTEXT NOT NULL COMMENT '工作报告内容',
	`reviews_user_id` VARCHAR ( 32 ) DEFAULT NULL COMMENT '点评用户ID',
	`reviews_user_name` VARCHAR ( 255 ) DEFAULT NULL COMMENT '点评用户名称',
	`reviews` MEDIUMTEXT DEFAULT NULL COMMENT '工作报告点评',
	`work_report_type` INT ( 1 ) NOT NULL COMMENT '工作报告类型 0-日报 1-周报',
	`work_report_created_date` datetime DEFAULT NULL COMMENT '创建时间',
	`work_report_updated_date` datetime DEFAULT NULL COMMENT '修改时间',
PRIMARY KEY ( `work_report_id` ) USING BTREE
) ENGINE = INNODB DEFAULT CHARSET = utf8 ROW_FORMAT = COMPACT COMMENT = '工作报告';

--跟进记录
CREATE TABLE `follow_up_record` (
	`follow_up_record_id` VARCHAR ( 32 ) NOT NULL COMMENT '跟进记录ID',
	`user_id` VARCHAR ( 32 ) NOT NULL COMMENT '用户',
	`user_name` VARCHAR ( 255 ) NOT NULL COMMENT '姓名',
	`customer_id` VARCHAR ( 32 ) NOT NULL COMMENT '客户ID',
	`customer_name` VARCHAR ( 255 ) NOT NULL COMMENT '客户名称',
	`follow_up_date` date NOT NULL COMMENT '跟进时间',
	`follow_up_theme` VARCHAR ( 255 ) NOT NULL COMMENT '跟进主题',
	`follow_up_content` MEDIUMTEXT NOT NULL COMMENT '跟进内容',
	`next_remind_date` date NOT NULL COMMENT '下次提醒时间',
	`next_follow_up_theme` VARCHAR ( 255 ) NOT NULL COMMENT '下次跟进主题',
	`next_follow_up_content` MEDIUMTEXT NOT NULL COMMENT '下次跟进内容',
	`follow_up_record_type` INT ( 1 ) NOT NULL COMMENT '跟进类型 0-电话 1-微信 2-阿里旺旺',
	`follow_up_record_status` INT ( 1 ) NOT NULL DEFAULT '1' COMMENT '状态 0-禁用 1-正常',
	`follow_up_record_create_date` datetime NOT NULL COMMENT '创建时间',
	`follow_up_record_update_date` datetime NOT NULL COMMENT '更新时间',
PRIMARY KEY ( `follow_up_record_id` ) USING BTREE
) ENGINE = INNODB DEFAULT CHARSET = utf8 ROW_FORMAT = COMPACT COMMENT = '跟进记录';