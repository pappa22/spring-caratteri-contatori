<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">

</head>
<body>
	<br>
	<form action="contaParole" method="post">
		<input type="submit" value="Conta Parole"> <input
			type="hidden" name="testo" value="${testo}" />
	</form>
	<br>
	<form action="contaVocali" method="post">
		<input type="submit" value="Conta Vocali"> <input
			type="hidden" name="testo" value="${testo}" />
	</form>
	<br>
	<form action="contaConsonanti" method="post">
		<input type="submit" value="Conta Consonanti"> <input
			type="hidden" name="testo" value="${testo}" />
				</form>
<br><br><br>
		<form action="indietroUno" method="post"> 
			<input type="submit" value="Torna Indietro"> 
	</form> 
</body>
</html>