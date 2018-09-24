package Comandos;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import daos.LivroDAO;
import models.Livro;


public class ExcluirLivro implements Logica {
		public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
		long id = Long.parseLong(req.getParameter("id"));
		Livro livro = new Livro();
		livro.setId(id);
		LivroDAO dao = new LivroDAO();
		dao.remover(livro);
		System.out.println("Excluindo contato... ");
		return "lista-contatos.jsp";
		}
}
