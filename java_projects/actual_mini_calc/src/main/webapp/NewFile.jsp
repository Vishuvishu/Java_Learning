<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>Mini Calculator</title>
    <style>
        img {
            height: 20%;
            width: 20%;
        }
		h1{
		color:white;
		}
        body {
            text-align: center;
            background: linear-gradient(to right, #18045F, #32285F);
        }
    </style>
</head>

<body>
    <img src="images/funny.gif">
    <h1><%=request.getParameter("joke") %></h1>
    <form action="MyServlet" method="get">
        <input name="num1" placeholder="first number"></input>
        <input name="num2" placeholder="second number"></input>
        <button name="bt1" value="1">+</button>
        <button name="bt1" value="2">-</button>
        <button name="bt1" value="3">*</button>
        <button name="bt1" value="4">/</button>
    </form>
    <h1>Ans = <%=request.getParameter("ans") %></h1>

</body>

</html>