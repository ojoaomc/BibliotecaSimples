package com.example.biblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Biblioteca {
	private List<Livro> livros = new ArrayList<>();
	
	public void adicionarLivro(String titulo, String autor) {
		livros.add(new Livro(titulo, autor));
	}
	
	public List<Livro> listarLivros(){
		return new ArrayList<>(livros);
	}
	
	// Busca livros por autor, ignorando maiúsculas/minúsculas.
	// @param autor NOME DO AUTOR A SER BUSCADO.
	// @return LISTA DE LIVROS DO AUTOR ESPECIFICADO.
	
	public List<Livro> buscaPorAutor(String autor) {
		return livros.stream()
				.filter(livro -> livro.getAutor().equalsIgnoreCase(autor))
				.collect(Collectors.toList());
	}
}
