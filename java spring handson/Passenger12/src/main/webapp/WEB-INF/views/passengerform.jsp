<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Passenger Registration Form</title>
</head>
<body>
    <h1>Passenger Registration Form</h1>
    <form action="/savepassenger" method="post">
        <label for="name">Name:</label>
        <input type="text" id="name" name="name" required><br><br>
        
        <label for="dob">Date of Birth:</label>
        <input type="date" id="dob" name="dob" required><br><br>
        
        <label for="phone">Phone:</label>
        <input type="text" id="phone" name="phone" required><br><br>
        
        <label for="email">Email:</label>
        <input type="email" id="email" name="email" required><br><br>
        
        <input type="submit" value="Submit">
    </form>
</body>
</html>
