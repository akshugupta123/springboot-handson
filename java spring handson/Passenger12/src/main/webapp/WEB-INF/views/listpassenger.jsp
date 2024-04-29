<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>List of Passengers</title>
</head>
<body>
    <h1>List of Passengers</h1>
    <table border="1">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Date of Birth</th>
            <th>Phone</th>
            <th>Email</th>
        </tr>
        <c:forEach var="passenger" items="${passengers}">
            <tr>
                <td>${passenger.id}</td>
                <td>${passenger.name}</td>
                <td>${passenger.dob}</td>
                <td>${passenger.phone}</td>
                <td>${passenger.email}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
