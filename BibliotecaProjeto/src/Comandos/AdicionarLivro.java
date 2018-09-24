package Comandos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import daos.LivroDAO;
import models.Livro;

public class AdicionarLivro implements Logica {
	
	public String executa(HttpServletRequest request, HttpServletResponse response) {
	String titulo = request.getParameter("titulo");
	String autor = request.getParameter("autor");
	String editora = request.getParameter("editora");
	String dataEmTexto1 = request.getParameter("anoDePublicacao");
	String dataEmTexto2 = request.getParameter("anoDeEdicao");

	
	Calendar dataFinalPublicacao = null;
	Calendar dataFinalEdicao = null;

	
	try {
		Date dataProvisoriaPublicacao = new SimpleDateFormat("dd/MM/yyyy").parse(dataEmTexto1);
		dataFinalPublicacao = Calendar.getInstance();
		dataFinalPublicacao.setTime(dataProvisoriaPublicacao);

		Date dataProvisoriaEdicao = new SimpleDateFormat("dd/MM/yyyy").parse(dataEmTexto2);
		dataFinalEdicao = Calendar.getInstance();
		dataFinalEdicao.setTime(dataProvisoriaEdicao);

		
	} catch (ParseException e) {
		e.printStackTrace();
	}
	
	Livro livro = new Livro();
	livro.setTitulo(titulo);
	livro.setAutor(autor);
	livro.setEditora(editora);
	livro.setAnoDePublicacao(dataFinalPublicacao);
	livro.setAnoDeEdicao(dataFinalEdicao);
	LivroDAO dao = new LivroDAO();
	dao.inserirLivro(livro);
	
	return "LivroFoiAdicionado.jsp";
}
}


	