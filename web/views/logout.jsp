<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
</head>
<body class="w3-light-grey">
<div class="w3-container w3-blue-grey w3-opacity w3-right-align">
    <h1>Calculator</h1>
</div>
<div class="w3-container w3-center w3-green">
    <h2>Logout</h2>
</div>
<%
    session.invalidate();
    System.out.println("logout");
%>
<div class="w3-container w3-grey w3-opacity w3-right-align w3-padding">
    <button class="w3-btn w3-round-large" onclick="location.href='/web_calculator_war_exploded/'">Back to main</button>
</div>
</body>
</html>
