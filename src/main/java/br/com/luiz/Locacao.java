package br.com.luiz;

import java.util.ArrayList;
import java.util.List;

public class Locacao {
	
	public double alugarUmFilme(Filme filme) {
		return filme.getPreco();
	}
	
	
	public double alugarDoisFilmes(ArrayList<Filme> filmes) {
		double valor = 0;
		
		for(int i=0; i < filmes.size(); i++) {
			valor += filmes.get(i).getPreco();
		}
		
		return valor;
	}
	
	
	public double alugarTresFilmes(ArrayList<Filme> filmes) {
		double valor = 0;
		
		for(int i=0; i < filmes.size(); i++) {
			if(i == 3) {
				valor += filmes.get(2).getPreco() / 0.25;
			}
			valor += filmes.get(i).getPreco();
		}
		
		return valor;
	}
	


}
