package models;

import java.util.Calendar;

public class Livro {

	private Long id;
	private String titulo;
	private String autor;
	private String editora;
	private Calendar anoDePublicacao;
	private Calendar anoDeEdicao;
	private boolean statusLivro;
	
	public boolean isStatusLivro() {
		return statusLivro;
	}
	public void setStatusLivro(boolean statusLivro) {
		this.statusLivro = statusLivro;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public Calendar getAnoDePublicacao() {
		return anoDePublicacao;
	}
	public void setAnoDePublicacao(Calendar anoDePublicacao) {
		this.anoDePublicacao = anoDePublicacao;
	}
	public Calendar getAnoDeEdicao() {
		return anoDeEdicao;
	}
	public void setAnoDeEdicao(Calendar anoDeEdicao) {
		this.anoDeEdicao = anoDeEdicao;
	}
	
	
	
 }

