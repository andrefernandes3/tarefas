package br.com.usjt.service;

import java.util.List;

import br.com.usjt.dao.LivroDAO;
import br.com.usjt.model.Livro;

public class Biblioteca {

	private LivroDAO livroDAO;

	public Biblioteca() {
		livroDAO = new LivroDAO();
	}

	public void cadastrarLivro(Livro livro) {
		try{
			livroDAO.adicionaLivro(livro);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	public List <Livro> getLista(){
		return livroDAO.getLista();
	}
}
