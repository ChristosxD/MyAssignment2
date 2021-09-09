<%-- 
    Document   : alltrainers
    Created on : Jun 17, 2021, 5:01:29 PM
    Author     : Chris
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
        <%@ taglib uri="http://www.springframework.org/tags/form" prefix="Form" %>
        <link rel="stylesheet"   href="${pageContext.request.contextPath}/css/style.css" type="text/css"></link>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.3.0/font/bootstrap-icons.css">
        <title>Our Trainers</title>
    </head>
    <body style="background-color: rgb(19, 128, 86,0.5)">
        <div class="jumbotron text-center">
            <h1>Trainers</h1>
        </div>
        <div class="container">
            <div class="row">
                <a href="${pageContext.request.contextPath}/add"><i class="bi bi-person-plus"></i></a>
                <table class="table table-success table-striped">
                    <tr>
                        <th>First Name</th>
                        <th>Last Name</th>
                        <th>Subject</th>
                        <th>Edit</th>
                        <th>Delete</th>
                    </tr>
                    <c:forEach items="${trainers}" var="trainer">
                        <tr>
                            <td ><c:out value="${trainer.firstname}"/></td>
                            <td ><c:out value="${trainer.lastname}"/></td>
                            <td ><c:out value="${trainer.subject}"/></td>
                            <td><a href="${pageContext.request.contextPath}/edit/${trainer.id}"><i class="bi bi-pencil"></i></a></td>
                            <td><a id="delete" onclick="if(confirm('Are you sure that you want to delete the teacher?')){location.href='${pageContext.request.contextPath}/delete/${trainer.id}'}"><i class="bi bi-trash"></i></a></td>
                        </tr>
                    </c:forEach>
                </table>
            </div>
        </div>
    </body>
</html>
