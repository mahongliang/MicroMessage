
DROP TABLE IF EXISTS `command`;
CREATE TABLE `command` (
  `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `NAME` varchar(16) DEFAULT NULL COMMENT '指令名称',
  `DESCRIPTION` varchar(32) DEFAULT NULL COMMENT '描述',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `command_content`;
CREATE TABLE `command_content` (
  `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `CONTENT` varchar(2048) DEFAULT NULL COMMENT '内容',
  `COMMAND_ID` varchar(16) DEFAULT NULL COMMENT '指令ID',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;


INSERT INTO `command` VALUES (1, '查看', '精彩内容');
INSERT INTO `command` VALUES (2, '段子', '精彩段子');
INSERT INTO `command` VALUES (3, '新闻', '今日头条');
INSERT INTO `command` VALUES (4, '娱乐', '娱乐新闻');
INSERT INTO `command` VALUES (5, '电影', '近日上映大片');
INSERT INTO `command` VALUES (6, '彩票', '中奖号码');



INSERT INTO `command_content` VALUES (1,'精彩内容',1);
INSERT INTO `command_content` VALUES (2,'精彩段子',2);
INSERT INTO `command_content` VALUES (3,'今日头条',3);
INSERT INTO `command_content` VALUES (4,'娱乐新闻',4);
INSERT INTO `command_content` VALUES (5,'近日上映大片',5);
INSERT INTO `command_content` VALUES (6,'中奖号码',6);

INSERT INTO `command_content` VALUES (7,'精彩段子2',2);
INSERT INTO `command_content` VALUES (8,'精彩段子3',2);
INSERT INTO `command_content` VALUES (9,'精彩段子4',2);
INSERT INTO `command_content` VALUES (10,'昨日，邓超在微博分享了自己和孙俪的书法。夫妻同样写幸福，但差距很大。邓超自己都忍不住感慨字丑：左边媳妇写的。右边是我写的。看完我再也不幸福了。',2);
INSERT INTO `command_content` VALUES (11,'如果你的月薪是3000块钱，请记得分成五份，一份用来买书，一份给家人，一份给女朋友买化妆品和衣服，一份请朋友们吃饭，一份作为同事的各种婚丧嫁娶的份子钱。剩下的2999块钱藏起来，不要告诉任何人',2);
INSERT INTO `command_content` VALUES (12,'7月17日，马来西亚一架载有298人的777客机在乌克兰靠近俄罗斯边界坠毁。另据国际文传电讯社消息，坠毁机型为一架波音777客机，机载约280名乘客和15个机组人员。\r\n乌克兰空管部门随后证实马航MH17航班坠毁。乌克兰内政部幕僚表示，这一航班在顿涅茨克地区上空被击落。马来西亚航空公司确认，该公司从阿姆斯特丹飞往吉隆坡的MH17航班失联，并称最后与该客机取得联系的地点在乌克兰上空。图为马航客机坠毁现场。',2);



