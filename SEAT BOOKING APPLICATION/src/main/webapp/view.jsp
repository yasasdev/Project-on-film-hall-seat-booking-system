<%@ page contentType="text/html;charset=UTF-8" language="java" %>

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
                <td>${booking.id != null ? booking.id : 'N/A'}</td>
                <td>${booking.seats != null ? booking.seats : 'N/A'}</td>
                <td>${booking.date != null ? booking.date : 'N/A'}</td>
                <td>${booking.time != null ? booking.time : 'N/A'}</td>
                <td>${booking.price != null ? booking.price : 'N/A'}</td>
            </tr>
        </c:forEach>
    </tbody>
</table>
</body>
</html>