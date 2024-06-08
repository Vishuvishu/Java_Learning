<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login here</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
<div class="container">
<h1>Login</h1>
        <form action="LoginServlet" method="post"> <!-- Change method to "post" -->
            <label for="username">Username:</label>
            <input type="text" id="username" name="username" required><br>
            <label for="password">Password:</label>
            <input type="password" id="password" name="password" required><br>
            <button type="submit">Login</button>
        </form>

        <p><a href="index.html">Back to Home</a></p></div>
          <%-- Display error message if login fails --%>
        <% String error = request.getParameter("error");
        if (error != null && error.equals("1")) { %>
        <p style="color: red;">Invalid username or password. Please try again.</p>
<% } %>
<% if (error != null && error.equals("2")) { %>
                <p style="color: red;">Either no data to clean or not able to clean</p>
        <% } %>
        <% String clean = request.getParameter("clean");
            if (clean != null && clean.equals("yes")) { %>
                <p style="color: blue;">deleted entry with id null.</p>
        <% } %>
        <% String register = request.getParameter("registration");
            if (register != null && register.equals("success")) { %>
                <p style="color: green;">User added successfully</p>
        <% } %>
</body>
</html>