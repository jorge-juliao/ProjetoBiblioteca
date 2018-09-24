package Comandos;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import daos.LivroDAO;
import models.Livro;

public class ListarLivro {

	public String executa(HttpServletRequest request, HttpServletResponse response) {
		LivroDAO dao = new LivroDAO();
		List<Livro> livros = dao.lista();
		
		request.setAttribute("livros", livros);
		
		return "ListarLivro.jsp";
		
}
}
