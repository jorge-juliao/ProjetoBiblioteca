package Comandos;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import daos.LivroDAO;
import models.Livro;

public class BuscaLivro implements Logica{
	@Override
	public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
		String nomeLivro = req.getParameter("nomeLivro");
		LivroDAO dao = new LivroDAO();
		Livro l = dao.getLivroPorNome(nomeLivro);
		List<Livro> livros = new ArrayList<>();
		
		if(l == null) {
			return "LivroNaoExiste.html";
		}
		
		livros.add(l);
		req.setAttribute("livros", livros);
		return "Emprestimo.jsp";
	}
}
