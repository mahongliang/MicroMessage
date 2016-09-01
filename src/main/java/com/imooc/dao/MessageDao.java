package com.imooc.dao;

import java.io.IOException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.imooc.bean.Message;
import com.imooc.db.DBAccess;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

/**
 * 和message表相关的数据库操作
 */
public class MessageDao {

	/**
	 * 根据查询条件查询消息列表
	 */
	public List<Message> queryMessageList(String command, String description) {

		DBAccess dbAccess = new DBAccess();
		List<Message> messageList = new ArrayList<Message>();
		SqlSession sqlSession = null;
		try {
			Message message = new Message();
			message.setCommand(command);
			message.setDescription(description);
			sqlSession = dbAccess.getSqlSession();
			// 通过sqlSession执行SQL语句
			messageList = sqlSession.selectList("Message.queryMessageList", message);
			sqlSession.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (sqlSession != null) {
				sqlSession.close();
			}
		}
		return messageList;
	}

	/**
	 * 单条删除
	 */
	public void deleteOne(int id) {
		DBAccess dbAccess = new DBAccess();
		SqlSession sqlSession = null;
		try {
			sqlSession = dbAccess.getSqlSession();
			// 通过sqlSession执行SQL语句
			sqlSession.delete("Message.deleteOne", id);
			sqlSession.commit();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (sqlSession != null) {
				sqlSession.close();
			}
		}
	}
	
	/**
	 * 单条删除
	 */
	public void deleteBatch(List<Integer> ids) {
		DBAccess dbAccess = new DBAccess();
		SqlSession sqlSession = null;
		try {
			sqlSession = dbAccess.getSqlSession();
			// 通过sqlSession执行SQL语句
			sqlSession.delete("Message.deleteBatch", ids);
			sqlSession.commit();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(sqlSession != null) {
				sqlSession.close();
			}
		}
	}
	

	// /**
	// * 根据查询条件查询消息列表
	// */
	// public List<Message> queryMessageList(String command,String description){
	//
	// ArrayList<Message> messageList = new ArrayList<Message>();
	// try {
	// Class.forName("com.mysql.jdbc.Driver");
	// Connection conn = (Connection)
	// DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/micro_message",
	// "root", "123");
	// StringBuilder sql = new StringBuilder("select
	// ID,COMMAND,DESCRIPTION,CONTENT from MESSAGE where 1=1");
	// List<String> paramList = new ArrayList<String>();
	// if(command != null && !"".equals(command.trim())) {
	// sql.append(" and COMMAND=?");
	// paramList.add(command);
	// }
	// if(description != null && !"".equals(description.trim())) {
	// sql.append(" and DESCRIPTION like '%' ? '%'");
	// paramList.add(description);
	// }
	// PreparedStatement statement = (PreparedStatement)
	// conn.prepareStatement(sql.toString());
	// for(int i = 0; i < paramList.size(); i++) {
	// statement.setString(i + 1, paramList.get(i));
	// }
	//
	// ResultSet rs = statement.executeQuery();
	//
	// while (rs.next()) {
	// Message message = new Message();
	// message.setId(rs.getString("ID"));
	// message.setCommand(rs.getString("COMMAND"));
	// message.setDescription(rs.getString("DESCRIPTION"));
	// message.setContent(rs.getString("CONTENT"));
	// messageList.add(message);
	// }
	// } catch (ClassNotFoundException e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// } catch (SQLException e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	//
	// return messageList;
	// }

}
