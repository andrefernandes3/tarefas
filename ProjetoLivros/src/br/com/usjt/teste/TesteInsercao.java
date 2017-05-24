package br.com.usjt.teste;

import br.com.usjt.dao.LivroDAO;
import br.com.usjt.model.Livro;

public class TesteInsercao {

	public static void main(String[] args) {
		
		Livro livro = new Livro();
			
		livro.setTitulo("JAVA");
		livro.setId(592);
		livro.setAutor("JOAo");
		
		LivroDAO dao = new LivroDAO();
		
		dao.adicionaLivro(livro);
		System.out.println("GRAVADO");
		
	}

}
