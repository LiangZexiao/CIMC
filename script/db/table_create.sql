drop table IF EXISTS `base_car`;
drop table IF EXISTS `con_car`;
drop table IF EXISTS `cold_car`;
drop table IF EXISTS `tank_car`;
drop table IF EXISTS `spe_car`;
drop table IF EXISTS `inf_car`;
drop table IF EXISTS `abn_conf`;
drop table IF EXISTS `avoid_area`;
drop table IF EXISTS `province_code`;
drop table IF EXISTS `city_code`;
drop table IF EXISTS `user`;
drop table IF EXISTS `role`;
drop table IF EXISTS `menu`;
drop table IF EXISTS `permission`;
drop table IF EXISTS `role_perm`;
drop table IF EXISTS `abn_warning_param`;
drop table IF EXISTS `dsl_module`;

create table IF NOT EXISTS `base_car` (
vid int(11) NOT NULL comment '设备id',
devive_type int(2) comment '设备类型编号',
da_up datetime comment '数据时间',
latitude decimal(9,6) comment '经度',
longitude decimal(9,6) comment '纬度',
bd_lat decimal(9,6) comment '百度经度',
bd_long decimal(9,6) comment '百度纬度',
speed double(5,2) comment '车速',
PRIMARY KEY (vid),
index(devive_type)
)engine=INNODB charset=utf8 comment='车辆基本信息表';

create table IF NOT EXISTS con_car (
vid int(11) NOT NULL comment '设备id',
door1 tinyint comment '一号门开关',
door2 tinyint comment '二号门开关',
door3 tinyint comment '三号门开关',
door4 tinyint comment '四号门开关',
PRIMARY KEY (vid)
)engine=INNODB charset=utf8 comment='集装箱车辆信息表';

create table IF NOT EXISTS cold_car (
vid int(11) NOT NULL comment '设备id',
temperature1 double(7,3) comment '温度1',
temperature2 double(7,3) comment '温度2',
temperature3 double(7,3) comment '温度3',
temperature4 double(7,3) comment '温度4',
cooler_state tinyint comment '冷机总状态',
PRIMARY KEY (vid)
)engine=INNODB charset=utf8 comment='冷链运输车辆信息表';

create table IF NOT EXISTS tank_car (
vid int(11) NOT NULL comment '设备id',
`level` double(7,3) comment '液体高度',
volume int comment '容积',
gas tinyint comment '气体',
door1 tinyint comment '一号门开关',
door2 tinyint comment '二号门开关',
door3 tinyint comment '三号门开关',
door4 tinyint comment '四号门开关',
PRIMARY KEY (vid)
)engine=INNODB charset=utf8 comment='罐式集装箱车辆信息表';

create table IF NOT EXISTS spe_car (
vid int(11) NOT NULL comment '设备id',
water_temperature double(7,3) comment '水温',
fuel_num double(10,3) comment '剩余油量',
woker_hours double(10,3) comment '工作时长',
engine_speed double(10,3) comment '发动机转速',
fuel_temperature double(7,3) comment '油温',
average_fuel double(7,3) comment '平均油耗',
PRIMARY KEY (vid)
)engine=INNODB charset=utf8 comment='特种车辆信息表';

create table IF NOT EXISTS inf_car (
vid int(11) NOT NULL comment '设备id',
abnormal varchar(50) comment '异常',
PRIMARY KEY (vid)
)engine=INNODB charset=utf8 comment='异常信息表';

create table IF NOT EXISTS abn_conf (
id int(11) NOT NULL AUTO_INCREMENT comment '主键id',
abnConfig_type varchar(50) comment '异常名称',
abnConfig_value double(10,3) comment '异常阈值',
remark text comment '备注',
update_time datetime comment '更新时间',
PRIMARY KEY (id)
)engine=INNODB charset=utf8 comment='异常阈值表';

create table IF NOT EXISTS avoid_area (
id int(11) NOT NULL AUTO_INCREMENT comment '主键id',
left_high varchar(50) comment '左上坐标',
left_down varchar(50) comment '左下坐标',
right_high varchar(50) comment '右上坐标',
right_down varchar(50) comment '右下坐标',
area text comment '地址',
avoid_reason text comment '避让原因',
PRIMARY KEY (id)
)engine=INNODB charset=utf8 comment='不利地点标注表';

create table IF NOT EXISTS province_code (
code int(11) NOT NULL AUTO_INCREMENT comment '省份编码（2位）',
name varchar(50) comment '省（直辖市）全称',
short_name varchar(30) comment '简称',
is_municipality tinyint comment '是否直辖市',
latitude decimal(9,6) comment '经度',
longitude decimal(9,6) comment '纬度',
bd_lat decimal(9,6) comment '百度经度',
bd_lon decimal(9,6) comment '百度纬度',
PRIMARY KEY (code)
)engine=INNODB charset=utf8 comment='省份代码表';

create table IF NOT EXISTS city_code (
id int(11) NOT NULL AUTO_INCREMENT comment '主键id',
name varchar(30) comment '省（直辖市）全称',
short_name varchar(10) comment '简称',
province_code int(11) comment '所属省份编码',
code varchar(10) comment '城市编码（2位）',
latitude decimal(9,6) comment '经度',
longitude decimal(9,6) comment '纬度',
bd_lat decimal(9,6) comment '百度经度',
bd_lon decimal(9,6) comment '百度纬度',
PRIMARY KEY (id),
CONSTRAINT FOREIGN KEY (province_code) references `province_code`(code)
)engine=INNODB charset=utf8 comment='城市代码表';

create table IF NOT EXISTS `user` (
id int(11) NOT NULL AUTO_INCREMENT comment '主键id',
user_name varchar(30) comment '用户名',
password varchar(50) comment '用户密码',
role_id int(11) comment '角色id',
create_time datetime comment '更新时间',
PRIMARY KEY (id)
)engine=INNODB charset=utf8 comment='用户表';

create table IF NOT EXISTS `role` (
id int(11) NOT NULL AUTO_INCREMENT comment '主键id',
role_name varchar(30) comment '角色名',
grade int(1) comment '角色等级',
update_time datetime comment '更新时间',
PRIMARY KEY (id)
)engine=INNODB charset=utf8 comment='角色表';

create table IF NOT EXISTS `menu` (
id int(11) NOT NULL AUTO_INCREMENT comment '主键id',
menu_name varchar(50) comment '菜单名',
grade int(1) comment '菜单等级',
rel_menu_name varchar(50) comment '关联父类菜单名称',
rel_url varchar(100) comment '菜单关联url',
PRIMARY KEY (id)
)engine=INNODB charset=utf8 comment='菜单表';

create table IF NOT EXISTS `permission` (
id int(11) NOT NULL AUTO_INCREMENT comment '主键id',
perm_name varchar(50) comment '权限名',
perm_class varchar(50) comment '权限分类标签',
real_menu_id int(11) comment '关联菜单id',
PRIMARY KEY (id)
)engine=INNODB charset=utf8 comment='权限表';

create table IF NOT EXISTS `role_perm` (
id int(11) NOT NULL AUTO_INCREMENT comment '主键id',
role_id int(11) comment '角色id',
perm_id int(11) comment '权限id',
PRIMARY KEY (id)
)engine=INNODB charset=utf8 comment='角色权限映射表';

create table IF NOT EXISTS `abn_warning_param` (
id int(11) NOT NULL AUTO_INCREMENT comment '主键id',
devive_type int comment '设备类型编号',
param_name varchar(50) comment '参数名称',
param_max double comment '参数最大值',
param_min double comment '参数最小值',
param_weight double comment '参数重要性权重',
PRIMARY KEY (id)
)engine=INNODB charset=utf8 comment='预警参数表';

create table IF NOT EXISTS `dsl_module` (
id int(11) NOT NULL AUTO_INCREMENT comment '主键id',
module_name varchar(30) comment '模块名',
area_name varchar(30) comment '领域名',
param1 varchar(30) comment '参数1',
param2 varchar(30) comment '参数2',
param3 varchar(30) comment '参数3',
param4 varchar(30) comment '参数4',
language varchar(20) comment '语言',
module_description varchar(255) comment '模块描述',
command varchar(255) comment '命令',
PRIMARY KEY (id)
)engine=INNODB charset=utf8 comment='DSL模块表';

/* create `verhical_data`, {NAME=>`data_up`}
create `city_statistics`, {NAME=>`ds`}, {NAME=>`in`}, {NAME=>`out`}
create `abn_predict_result`, {NAME=>`info`} */
