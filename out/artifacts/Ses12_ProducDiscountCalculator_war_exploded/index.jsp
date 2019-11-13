<%--
  Created by IntelliJ IDEA.
  User: ThinkKING
  Date: 11/13/2019
  Time: 9:13 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>ProductDiscountCalculator</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
  </head>
  <body>
  <h2>Product Discount Calculotor</h2>
  <form method="post" action="/calculate">
    <label>Product Description:</label>
    <input type="text" name="product"><br/>
    <label>List Price</label>
    <input type="text" name="price"><br/>
    <label>Discount Percent</label>
    <input type="text" name="discountRate">
    <label>%</label><br/>
    <input type="submit" id="submit" value="Calculate Discount">
  </form>
  </body>
</html>
