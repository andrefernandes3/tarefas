package br.com.usjt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.usjt.model.Livro;

public class LivroDAO {
	
	private Connection connection;
	
	public LivroDAO(){
		this.connection = new ConnectionFactory().getConnection();
	}
	
	public void adicionaLivro(Livro livro){
		
		String sql = "insert into cadastro" + "(titulo, numPages, nomeAutor)" + " values (?,?,?)";
		
		try{
			
			PreparedStatement ps = connection.prepareStatement(sql);
			
			ps.setString(1, livro.getTitulo());
			ps.setInt(2, livro.getNumPages());
			ps.setString(3, livro.getAutor());
			
			ps.execute();
			ps.close();
		}catch (SQLException e){
			throw new RuntimeException(e);
		}
	}
	
	public List<Livro> getLista(){
		
		String sql = "select * from cadastro";
		
		try {
			List<Livro> livros = new ArrayList<>();
			PreparedStatement ps = this.connection.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()){
				Livro livro = new Livro();
				
				livro.setTitulo(rs.getString("titulo"));
				livro.setNumPages(rs.getInt("numPages"));
				livro.setAutor(rs.getString("nomeAutor"));
				
				livros.add(livro);
			}
			rs.close();
			ps.close();
			return livros;
		}catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
