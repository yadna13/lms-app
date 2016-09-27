<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fn" 
           uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE>
<html>
<body>
	<header style="height: 20px; background-color: yellow"> Fruits
		Store!!!!!!! </header>
	<img src="img/basket.png" height="60px;" />
	<hr />
	Total Records : <span style="background-color: yellow;">${fn:length(fruits)}</span> 
	<table border="1" style="width: 80%;">
		<tr>
			<td>Sno</td>
			<td>Name</td>
			<td>Price</td>
			<td>Taste</td>
			<td>Quantity</td>
			<td>PCity</td>
			<td>Image</td>
			<td>Doe</td>
			<td>Action</td>
		</tr>
		
		<c:forEach items="${fruits}" var="item">
		<tr>
			<td>${item.sno}</td>
			<td>${item.name}</td>
			<td>${item.price}</td>
			<td>${item.taste}</td>
			<td>${item.quantity}</td>
			<td>${item.pcity}</td>
			<td><img src="findImageBySno?sno=${item.sno}" height="40px;"></td>
			<td>${item.doe}</td>
			<td><a><img src="img/edit.png"></a>&nbsp;<a><img src="img/delete.png"></a></td>
		</tr>
		</c:forEach>
		

	</table>

</body>

</html>