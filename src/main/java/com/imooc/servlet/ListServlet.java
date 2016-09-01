package com.imooc.servlet;

import java.io.IOException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.imooc.bean.Message;
import com.imooc.service.QueryService;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Driver;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import com.sun.javafx.sg.prism.NGWebView;

/**
 * 列表页面初始化和查询控制
 */

public class ListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// 设置接收数据的编码
		request.setCharacterEncoding("UTF-8");
		// 接受页面的值
		String command = request.getParameter("command");
		String description = request.getParameter("description");

		// 设置页面的值
		request.setAttribute("command", command);
		request.setAttribute("description", description);

		QueryService listService = new QueryService();
		// 查询消息列表并传给页面
		request.setAttribute("messageList", listService.queryMessageList(command, description));

		// 页面跳转
		request.getRequestDispatcher("WEB-INF/jsp/back/list.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
