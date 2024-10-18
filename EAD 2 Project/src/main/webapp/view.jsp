<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Booking List</title>
    <link rel="stylesheet" type="text/css" href="<c:url value='/css/style.css'/>"/>
</head>
<body>
<h2>Booking List</h2>
<table border="1">
    <thead>
        <tr>
            <th>BOOKING ID</th>
            <th>BOOKING SEATS</th>
            <th>BOOKING DATE</th>
            <th>BOOKING TIME</th>
            <th>BOOKING PRICE</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach var="booking" items="${bookings}">
            <tr>
                <td>${booking.id}</td>
                <td>${booking.seats}</td>
                <td>${booking.date}</td>
                <td>${booking.time}</td>
                <td>${booking.price}</td>
            </tr>
        </c:forEach>
    </tbody>
</table>
</body>
</html>
