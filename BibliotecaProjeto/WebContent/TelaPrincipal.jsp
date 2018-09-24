<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
	<style>
		
		.box {
			backgroud-color:black;
			with: 20px;
			length: 20px;		
			}
	</style>
</head>
	
<body class="box">

		<label>Página Principal</label>
		<div>
		<a href="/Biblioteca/CadastrarAluno.jsp" >Cadastre alunos</a><br>
		</div>
		<div>
		<a href="/Biblioteca/CadastrarLivro.jsp" >Cadastre livros</a><br>
		</div>
		<div>
		<a href="/Biblioteca/ListarLivros.jsp" >Listar livros</a><br>
		</div>
		<div>
		<a href="/Biblioteca/ListarAlunos.jsp" >Listar Alunos</a><br>
		</div>
		<div>
		<a href="/Biblioteca/RelatorioAtivo.jsp" >Relatorio dos alunos que possuem emprestimo validado</a><br>
		</div>
		<div>
		<a href="/Biblioteca/RelatorioEmAtraso.jsp" >Relatorio dos alunos que possuem emprestimo em atraso</a><br>
		</div>
		<div>
		<a href="/Biblioteca/Emprestimo.jsp" >Emprestimos de livros</a><br>
		</div>
		<div>
		<a href="/Biblioteca/Devolucao.jsp" >devolução de livros</a><br>
		</div>
</body>
</html>