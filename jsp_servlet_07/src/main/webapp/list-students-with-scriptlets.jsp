<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 6/3/2023
  Time: 12:14 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ page import="java.util.*" %>
<%@ page import="com.example.jsp_servlet_07" %>
<%@ page import="com.example.jsp_servlet_07.Student" %>
<html>
<head>
  <title>Student Tracker App</title>
  <link type="text/css" rel="stylesheet" href="/css/style.css">
</head>
<%
  List<Student> theStudents=
          (List<Student>) request.getAttribute("STUDENT_LIST");
%>
<body>
<div id="wrapper">
  <div id="header">
    <h2>CodeLeanAcademy</h2>
  </div>

</div>
<div id="container">
  <div id="content">
    <table>
      <tr>
        <th>First Name</th>
        <th>Last Name</th>
        <th>Email</th>
      </tr>
      <% for (Student tempStudent : theStudents){ %>
      <tr>
        <td> <%= tempStudent.getFirstName() %> </td>
        <td> <%= tempStudent.getLastName() %> </td>
        <td> <%= tempStudent.getEmail() %> </td>
      </tr>
      <% } %>
    </table>
  </div>
</div>
</body>
</html>
