
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="/display_discount" method="post">
    <label>Product Description:</label><br>
    <input type="text" name="productDescription" placeholder="product description"/><br>
    <label>List Price:</label><br>
    <input type="text" name="listPrice" value="0"/><br>
    <label>Discount Percent:</label><br>
    <input type="text" name="discountPercent" value="0"/><br>
    <input type="submit" id="submit" value="Calculate Discount"/>
  </form>
  </body>
</html>
