package daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import models.Aluno;
import models.Livro;

public class LivroDAO {

	private Connection connection;

	public LivroDAO() {
		this.connection = ConnectionFactory.getConnection();
	}

	public boolean inserirLivro(Livro livro) {

		String sql = "insert into livros (titulo, autor, editora, anoDePublicacao, edicao)values (?, ?, ?, ?,?)";

		try {
			PreparedStatement stmt = connection.prepareStatement(sql);

			stmt.setString(1, livro.getTitulo());
			stmt.setString(2, livro.getAutor());
			stmt.setString(3, livro.getEditora());

			stmt.setDate(4, new java.sql.Date(livro.getAnoDePublicacao().getTimeInMillis()));
			stmt.setDate(5, new java.sql.Date(livro.getAnoDeEdicao().getTimeInMillis()));

			stmt.execute();
			stmt.close();

		} catch (SQLException e) {
			
			e.printStackTrace();
			return false;
		}

		return true;
	}
	
	public List<Livro> lista(){
		List<Livro> result = new ArrayList<>();
		
		try {
			PreparedStatement stmt = this.connection.prepareStatement("select * from livros;");
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				
				Livro livro = new Livro();
				livro.setTitulo(rs.getString("titulo"));
				livro.setAutor(rs.getString("autor"));
				livro.setEditora(rs.getString("editora"));
				

				Calendar dataPublicacao = Calendar.getInstance();
				dataPublicacao.setTime(rs.getDate("anoDePublicacao"));
				livro.setAnoDePublicacao(dataPublicacao);
				
				Calendar dataEdicao = Calendar.getInstance();
				dataPublicacao.setTime(rs.getDate("edicao"));
				livro.setAnoDeEdicao(dataEdicao);
				
				
				result.add(livro);
			}
			rs.close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return result;
	}
	
	public boolean alterar(Aluno aluno) {
		String sql = "update alunos set matricula=?, nome=?, cpf=?, endereco=?, dataNascimento=? where id=?;";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, aluno.getMatricula());
			stmt.setString(1, aluno.getNome());
			stmt.setString(2, aluno.getCPF());
			stmt.setString(3, aluno.getEndereco());
			stmt.setDate(4, new java.sql.Date(aluno.getDataNascimento().getTimeInMillis()));
			
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	public boolean remover(Livro livro) {
		try {
			PreparedStatement stmt = connection.prepareStatement("delete from livros where id=?;");
			stmt.setLong(1, livro.getId());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public Livro getLivroPorNome(String nomeLivro) {
		Livro livro = null;
		String sql = "select * from livros";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				if(rs.getString("titulo").equals(nomeLivro)) {
					livro = new Livro();
					livro.setId(rs.getLong("id"));
					livro.setTitulo(rs.getString("titulo"));
				}
			}
			
			stmt.close();
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return livro;
	}
}
