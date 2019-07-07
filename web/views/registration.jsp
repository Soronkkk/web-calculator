<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration</title>
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
</head>
<body class="w3-light-grey">
<div class="w3-container w3-blue-grey w3-opacity w3-right-align">
    <h1>Calculator</h1>
</div>
<div class="w3-container w3-center w3-green">
    <h2>Registration</h2>
</div>
<div>
    <form action="login" method="post" class="w3-selection w3-center w3-light-grey w3-padding">
        Username:<input type="text" name="username" class="w3-input w3-center w3-border w3-round-large"
                    style="position: relative; left: 35%; width: 30%"/><br/>

        Password:<input type="password" name="password" class="w3-input w3-center w3-border w3-round-large"
                        style="position: relative; left: 35%; width: 30%"/><br/>

        Name:<input type="text" name="name" class="w3-input w3-center w3-border w3-round-large"
                    style="position: relative; left: 35%; width: 30%"/><br/>

        Surname:<input type="text" name="surname" class="w3-input w3-center w3-border w3-round-large"
                    style="position: relative; left: 35%; width: 30%"/><br/>

        <button type="submit" name="add" value="add"
                class="w3-btn w3-center w3-green w3-round-large w3-margin-bottom">Registration
        </button>
    </form>
</div>
<div class="w3-container w3-grey w3-opacity w3-right-align w3-padding">
    <button class="w3-btn w3-round-large" onclick="location.href='/webcalculator_war_exploded/'">Back to main</button>
</div>
</body>
</html>
