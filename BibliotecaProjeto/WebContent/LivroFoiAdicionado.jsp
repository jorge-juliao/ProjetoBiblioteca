<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="sistema" method="post">
		<input type="hidden" name="logica" value="sistema">
		<div>
			<h1>O livro ${param.titulo} foi adicionado com sucesso!</h1>
			<a href="TelaPrincipal.jsp">Voltar a tela principal</a>
			
		</div>
		</form>

</body>
</html>