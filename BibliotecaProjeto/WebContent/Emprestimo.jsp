<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Insert title here</title>
	</head>
	<body>
		<form action="sistema" method="post">
			<input type="hidden" name="logica" value="BuscaLivro">
			<input type="text" name="nomeLivro">
			<input type="submit" value="buscar">
		</form>
		
	
			
				<form action="sistema" method="post">
			<input type="hidden" name="logica" value="EmprestimoLivro">
			<select name="idLivro">
		
				<c:forEach var="livro" items="${livros}">
					<option value="${livro.id}">${livro.titulo}</option>
				</c:forEach>
			</select>
			<input type="text" name="idAluno">
			<input type="submit" value="emprestar">
		</form>
	</body>
</html>