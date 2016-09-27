<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
</head>
<body>
  
  
  <img alt="" src="img/login.png" />
  <form action="loginServlet" method="post">
  <table  cellpadding="10px;">
  		<tr>
  			<td>Login</td>
  			<td><input type="text" name="login"> 			
  			</td>
  		</tr>

  		<tr>
  			<td>Password</td>
  			<td><input type="password" name="password"> 			
  			</td>
  		</tr>

  		<tr>
  			<td>&nbsp;</td>
  			<td><input type="submit" value="Auth" style="background-color: pink;"/> 			
  			</td>
  		</tr>
  
  </table>
   <a href="fruits">Fruit Store<img src="img/basket.png" height="60px;"></a> 
    </form>


</body>
</html>