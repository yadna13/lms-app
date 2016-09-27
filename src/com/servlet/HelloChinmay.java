package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 
 * @author xxxxxxxxxxxx
 *
 */
public class HelloChinmay extends HttpServlet {

	
	public void init(ServletConfig config) throws ServletException{
		System.out.println("_____initializing a servlet");
		super.init(config);
	}
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter pow=resp.getWriter();
		ServletConfig servletConfig=super.getServletConfig();
		pow.println("<h2 style=\"background-color:"+servletConfig.getInitParameter("color")+";\">Hey I am chinmay and learning here JSP/Servlet!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!<h2>");
		pow.println("<h2 style=\"background-color:pink;\">Hey I am chinmay and learning here JSP/Servlet!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!<h2>");
		pow.println("<h2 style=\"background-color:pink;\">Email= "+servletConfig.getInitParameter("email")+"<h2>");
	}

}
