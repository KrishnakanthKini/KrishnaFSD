<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<html>

<head>
	<title>Customer Confirmation</title>
</head>

<body bgcolor="green">

The customer is confirmed: ${customer.firstName} ${customer.lastName}

<br><br>

freePass: ${customer.freePass}

<br><br>

Postal code: ${customer.postalCode}

<br><br>


</body>

</html>
