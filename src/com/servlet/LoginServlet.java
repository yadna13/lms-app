package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 
 * @author xxxxxxxxxxxx
 *
 */
public class LoginServlet extends HttpServlet {

	
	public void init(ServletConfig config) throws ServletException{
		System.out.println("_____initializing a servlet");
		super.init(config);
	}
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String login=req.getParameter("login");
		String password=req.getParameter("password");
		resp.setContentType("text/html");
		PrintWriter pow=resp.getWriter();
		ServletContext applicatioin=getServletContext();
		Connection connection=(Connection)applicatioin.getAttribute("conn");
		try {
			PreparedStatement pstmt=connection.prepareStatement("select login from logins_tbl where login=? and password=?");
			pstmt.setString(1,login);
			pstmt.setString(2,password);
			ResultSet  resultSet=pstmt.executeQuery();
			if(resultSet.next()){
				 RequestDispatcher dispatcher=req.getRequestDispatcher("success.jsp");
				 dispatcher.forward(req, resp);
			}else{
				RequestDispatcher dispatcher=req.getRequestDispatcher("failure.jsp");
				 dispatcher.forward(req, resp);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
