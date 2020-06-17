<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Il risultato dell'operazione è: <b>${ris}</b>
<br><br>
<form action="indietro" method="post">
		<input type="submit" value="Torna Indietro">
		<input type="hidden"  name="testo" value= "${testo}"/>>
</form>
</body>
</html>