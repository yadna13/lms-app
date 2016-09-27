package com.servlet.listener;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ConnectionListener implements ServletContextListener{
	
	
	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		System.out.println("_______Creating connection with database!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		try {
			//This is application scope which is accessible to whole application
			ServletContext servletContext=arg0.getServletContext();
			String username=servletContext.getInitParameter("username");
			String password=servletContext.getInitParameter("password");
			String databaseName=servletContext.getInitParameter("databaseName");
			Class.forName("com.mysql.jdbc.Driver");
			Connection  con=DriverManager.getConnection("jdbc:mysql://localhost:3306/"+databaseName,username,password);
			//here we are adding this connection to servlet context means inside the application scope
			//it means we can access it anywhere in the application
			servletContext.setAttribute("conn", con);
		}catch(Exception ex){
			ex.printStackTrace();
		}
		
	}
	

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	

}
