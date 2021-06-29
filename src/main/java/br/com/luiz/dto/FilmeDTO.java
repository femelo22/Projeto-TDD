package br.com.luiz.dto;

import java.util.ArrayList;
import java.util.List;

import br.com.luiz.entities.Filme;

public class FilmeDTO {
	
	List<Filme> filmes = new ArrayList<>();

	public List<Filme> getFilmes() {
		return filmes;
	}

	public void setFilmes(List<Filme> filmes) {
		this.filmes = filmes;
	}
	
	

}
