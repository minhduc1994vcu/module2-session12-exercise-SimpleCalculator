<%--
  Created by IntelliJ IDEA.
  User: minhduc
  Date: 20/04/2019
  Time: 10:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<h1>SimPle Calculator</h1>
<form action="/calculate" method="post">
    <fieldset>
        <legend> calculator</legend>
        <table>
            <tr>
                <td>First operand:</td>
                <td><input type="text" name="firstOperand"></td>
            </tr>
            <tr>
                <td>Operator:</td>
                <td><select name="operator">
                    <option value="+">Add</option>
                    <option value="-">Sub</option>
                    <option value="*">Mul</option>
                    <option value="/">Div</option>
                </select></td>
            </tr>
            <tr>
                <td>Second operand:</td>
                <td><input type="text" name="secondOperand"></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" name="Calculator"></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>
