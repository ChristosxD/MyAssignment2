<%-- 
    Document   : edit
    Created on : Jun 22, 2021, 10:23:34 AM
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
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
        <link rel="stylesheet"   href="${pageContext.request.contextPath}/css/style.css" type="text/css"></link>
        <title>JSP Page</title>
    </head>
    <body>
        <div class="jumbotron text-center">
            <h1>Edit Trainer</h1>
        </div>
        <div class="container">
            <div class="row"> 
                <Form:form method="POST" action="${pageContext.request.contextPath}/edittrainer" modelAttribute="newtrainer">                       
                        <Form:hidden   class="form-control" id="id" path="id"/>
                    <div class="form-group">
                        <label for="fname">First Name</label>
                        <Form:input   class="form-control" id="fname" path="firstname" type="text"/>
                        <small class="form-text text-muted"><Form:errors path="firstname"/></small>
                    </div>
                    <div class="form-group">
                        <label for="lname">Last Name</label>
                        <Form:input class="form-control" id="lname" path="lastname" type="text"/>
                        <small class="form-text text-muted"><Form:errors path="lastname"/></small>
                    </div>
                    <div class="form-group">
                        <label for="sub">Subject</label>
                        <Form:input class="form-control" id="sub" path="subject" type="text"/> 
                        <small class="form-text text-muted"><Form:errors path="subject"/></small>
                    </div>
                    <br>
                    <input id ="submit"  class="btn btn-primary" type="Submit"/>
                </Form:form>
            </div>
        </div>    
    </body>
</html>
