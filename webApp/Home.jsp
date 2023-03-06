<html>
<head>
<title>Bank Information</title>
</head>
<body>
<h1>ENTER BANK DETAILS</h1>
<form action="adduser">
Account Number<input type="text" name=accno><br>
Account Name<input type="text" name=accname><br>
Account Balance<input type="text" name=balance><br>
<input type="submit"><br>
</form>
<h1>DISPLAY ACCOUNTHOLDER DETAILS</h1>
<form action="getuser">
Account Number<input type="text" name=accno><br>
<input type="submit"><br>
</form>
<h1>Delete ACCOUNTHOLDER DETAILS</h1>
<form action="deleteuser">
Account Number<input type="text" name=accno><br>
<input type="submit"><br>
</form>
<h1>Update ACCOUNTHOLDER DETAILS</h1>
<form action="updateuser">
Account Number<input type="text" name=accno><br>
<input type="submit"><br>
</form>
</body>
</html>