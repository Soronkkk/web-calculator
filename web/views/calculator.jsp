<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Calculator</title>
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    <script>
        function insert(num) {
            if (document.form.result.value !== "") {
                document.form.operation.value = document.form.result.value;
                document.form.result.value = "";
            }
            document.form.operation.value = document.form.operation.value + num;
        }

        function equal() {
            var exp = document.form.operation.value;
            document.form.operation.value = exp;
            document.form.result.value = eval(exp);
        }

        function clean() {
            document.form.operation.value = "";
            document.form.result.value = "";
        }

        function backspace() {
            var exp = document.form.operation.value;
            document.form.operation.value = exp.substring(0, exp.length - 1);
        }

        function sqrt() {
            var exp = document.form.operation.value;
            exp = "Math.sqrt(" + exp + ")";
            document.form.operation.value = exp;
            document.form.result.value = eval(exp);
        }

        function pow() {
            var exp = document.form.operation.value;
            power = prompt("Введите степень");
            exp = "Math.pow(" + exp + ',' + power + ')';
            document.form.operation.value = exp;
            document.form.result.value = eval(exp);
        }
    </script>
    <style>
        * {
            margin: 0;
            padding: 0;
        }

        .button {
            width: 50px;
            height: 50px;
            font-size: 25px;
            margin: 2px;
            cursor: pointer;
            background: cornflowerblue;
            border: none;
            color: white;
        }

        .main {
            position: absolute;
            top: 50%;
            left: 50%;
            transform: translateX(-50%) translateY(-50%);
        }

        .bg {
            background: linear-gradient(to right, #ff7200, #4a82ff);
            height: 100%
        }
    </style>
</head>
<body class="w3-light-grey">
<div class="w3-container w3-blue-grey w3-opacity w3-right-align">
    <h1>Calculator</h1>
</div>
<div class="bg"></div>
<div class="main">
    <form name="form" method="post">
        <input type="text" name="operation" class="w3-input w3-center w3-border w3-round-large"
               style="position: relative"/><br/>
        <input type="text" name="result" class="w3-input w3-center w3-border w3-round-large"
               style="position: relative"/><br/>
        <input class="button" type="submit" value="=" onclick="equal()">
    </form>
    <table>
        <tr>
            <td><input class="button" type="button" value="C" onclick="clean()"></td>
            <td><input class="button" type="button" value="<" onclick="backspace()"></td>
            <td><input class="button" type="button" value="/" onclick="insert('/')"></td>
            <td><input class="button" type="button" value="X" onclick="insert('*')"></td>
        </tr>
        <tr>
            <td><input class="button" type="button" value="7" onclick="insert(7)"></td>
            <td><input class="button" type="button" value="8" onclick="insert(8)"></td>
            <td><input class="button" type="button" value="9" onclick="insert(9)"></td>
            <td><input class="button" type="button" value="-" onclick="insert('-')"></td>
        </tr>
        <tr>
            <td><input class="button" type="button" value="4" onclick="insert(4)"></td>
            <td><input class="button" type="button" value="5" onclick="insert(5)"></td>
            <td><input class="button" type="button" value="6" onclick="insert(6)"></td>
            <td><input class="button" type="button" value="+" onclick="insert('+')"></td>
        </tr>
        <tr>
            <td><input class="button" type="button" value="1" onclick="insert(1)"></td>
            <td><input class="button" type="button" value="2" onclick="insert(2)"></td>
            <td><input class="button" type="button" value="3" onclick="insert(3)"></td>
            <td><input class="button" type="submit" value="=" onclick="equal()"></td>
        </tr>
        <tr>
            <td><input class="button" type="button" value="0" onclick="insert(0)"></td>
            <td><input class="button" type="button" value="." onclick="insert('.')"></td>
            <td><input class="button" type="button" value="^n" onclick="pow()"></td>
            <td><input class="button" type="button" value="√" onclick="sqrt()"></td>
        </tr>
    </table>
</div>
<div class="w3-container w3-grey w3-opacity w3-right-align w3-padding">
    <button class="w3-btn w3-round-large" onclick="location.href='/webcalculator_war_exploded/'">Back to main</button>
</div>
</body>
</html>
