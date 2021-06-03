package br.com.luiz;

import java.util.ArrayList;
import java.util.List;

public class Locacao {

	public double alugarFilmes(ArrayList<Filme> filmes) {
		double valor = 0;
		
		for (int i = 0; i < filmes.size(); i++) {
			if(i == 2) {
				valor += filmes.get(i).getPreco() * 0.75;
			}else {
				if(i == 3) {
					valor += filmes.get(i).getPreco() * 0.5;
				}else{
					valor += filmes.get(i).getPreco();
				}
			}
		}
		return valor;
	}
}
