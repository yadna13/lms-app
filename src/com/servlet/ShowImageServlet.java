package com.servlet;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

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
public class ShowImageServlet extends HttpServlet {

	
	public void init(ServletConfig config) throws ServletException{
		System.out.println("_____initializing a servlet");
		super.init(config);
	}
	
	
	public  byte[] readFully(InputStream input) throws IOException{
	    byte[] buffer = new byte[8192];
	    int bytesRead;
	    ByteArrayOutputStream output = new ByteArrayOutputStream();
	    while ((bytesRead = input.read(buffer)) != -1)
	    {
	        output.write(buffer, 0, bytesRead);
	    }
	    return output.toByteArray();
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String sno=req.getParameter("sno");
		resp.setContentType("image/jpg");
		ServletContext applicatioin=getServletContext();
		Connection connection=(Connection)applicatioin.getAttribute("conn");
		try {
			PreparedStatement pstmt=connection.prepareStatement("select image from fruit_tbl where sno=?");
			pstmt.setInt(1,Integer.parseInt(sno));
			ResultSet  resultSet=pstmt.executeQuery();
			if(resultSet.next()){
				InputStream inputStream=resultSet.getBinaryStream(1);
				byte image[]=readFully(inputStream);
				resp.getOutputStream().write(image);
				resp.getOutputStream().flush();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
