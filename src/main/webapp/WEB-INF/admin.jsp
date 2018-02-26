<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Karen-nout-W
  Date: 2/24/2018
  Time: 11:39 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
Add Category:<br>
<spring:form action="/addCategory" method="post" modelAttribute="category">
    <spring:label path="name">Name:</spring:label>
    <spring:input path="name"/>
    <input type="submit" value="ADD">
</spring:form>
<br>
Add Brand:<br>
<spring:form action="/addBrand" method="post" modelAttribute="brand">
    <spring:label path="name">Name:</spring:label>
    <spring:input path="name"/>
    <input type="submit" value="ADD">
</spring:form>
<br>
Add Product:<br>
<spring:form action="/addProduct" method="post" modelAttribute="product" enctype="multipart/form-data">
    <spring:label path="name">Name:</spring:label>
    <spring:input path="name"/><br>
    <spring:label path="description">Description:</spring:label>
    <spring:textarea path="description"/><br>
    <spring:label path="price">Price:</spring:label>
    <spring:input path="price"/><br>
    <spring:select path="category" items="${allCategories}" itemLabel="name"></spring:select><br>
    <spring:select path="brand" items="${allBrands}" itemLabel="name"></spring:select><br>
    <label for="image">Image:</label>
    <input type="file" id="image" name="image"/><br>
    <input type="submit" value="ADD">
</spring:form>
<br>
</body>
</html>
