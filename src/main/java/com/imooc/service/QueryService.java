package com.imooc.service;

import java.util.List;

import com.imooc.bean.Message;
import com.imooc.dao.MessageDao;

/**
 * 查询相关的业务功能
 */
public class QueryService {
	public List<Message> queryMessageList(String command,String description) {
		MessageDao messageDao = new MessageDao();
		return messageDao.queryMessageList(command, description);
	}
}
