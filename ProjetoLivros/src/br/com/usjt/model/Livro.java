package br.com.usjt.model;

public class Livro {
	private int id;
	private String titulo;
	private int numPages;
	private String autor;
	
	public Livro(){
		
	}
	
	public int getId() {
		return id;
	}
	public String getTitulo() {
		return titulo;
	}
	public int getNumPages() {
		return numPages;
	}
	public String getAutor() {
		return autor;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setNumPages(int numPages) {
		this.numPages = numPages;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}	
}