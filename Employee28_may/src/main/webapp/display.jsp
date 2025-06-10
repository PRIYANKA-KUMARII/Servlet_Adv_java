<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String id=request.getParameter("id");
String name=request.getParameter("name");
String address=request.getParameter("address");
String gender=request.getParameter("gender");
String profile=request.getParameter("profile");
String[] hobbies=request.getParameterValues("hobbies");
String val="";
for(String st:hobbies)
{
	val=st+" ";
}



%>
<table frame="box" rules="all">
	<tr>
		<td>id</td>
		<td><%=id %>
	</tr>
	<tr>
		<td>name</td>
		<td><%=name %>
	</tr>
	<tr>
	    <td>address</td>
	    <td><%=address %>
	    </td>
	    </tr>
	<tr>
	     <td>gender</td>
	      <td><%=gender %>
	      </td>
	      </tr>
	   <tr>
	      <td>profile</td>
	        <td><%=profile %>
	        </td>
	      
	   
	    
	    
</table>
</body>
</html>