package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.servlet.model.Fruit;

/**
 * 
 * @author xxxxxxxxxxxx
 *
 */
public class FruitsServlet extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ServletContext applicatioin=getServletContext();
		Connection connection=(Connection)applicatioin.getAttribute("conn");
		List<Fruit> fruits=new ArrayList<>();
		try {
			PreparedStatement pstmt=connection.prepareStatement("select sno,name,price,taste,quantity,pcity,doe from fruit_tbl");
			ResultSet  resultSet=pstmt.executeQuery();
			while(resultSet.next()){
				Fruit fruit=new Fruit();
				fruit.setSno(resultSet.getInt(1));
				fruit.setName(resultSet.getString(2));
				fruit.setPrice(resultSet.getInt(3));
				fruit.setTaste(resultSet.getString(4));
				fruit.setQuantity(resultSet.getInt(5));
				fruit.setPcity(resultSet.getString(6));
				fruit.setDoe(resultSet.getTimestamp(7));
				fruits.add(fruit);
			}
			//I am adding my all the fruits inside the request scope before forwarding to the JSP so that we can access all the
			//fruits on the forwarded JSP
			req.setAttribute("fruits", fruits);
			RequestDispatcher dispatcher=req.getRequestDispatcher("fruits.jsp");
		 dispatcher.forward(req, resp);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
