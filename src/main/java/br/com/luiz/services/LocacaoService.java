package br.com.luiz.services;

import org.springframework.stereotype.Service;

import br.com.luiz.dto.FilmeDTO;

@Service
public class LocacaoService {

	public double alugarFilmes(FilmeDTO obj) {
		double valor = 0;

		for (int i = 0; i < obj.getFilmes().size(); i++) {
			if (i == 2) {
				valor += obj.getFilmes().get(i).getPreco() * 0.75;
			} else if (i == 3) {
				valor += obj.getFilmes().get(i).getPreco() * 0.5;
			} else if (i == 4) {
				valor += obj.getFilmes().get(i).getPreco() * 0.25;
			} else if (i == 5) {
				valor += 0.0;
			} else if (i == 6) {
				valor += obj.getFilmes().get(i).getPreco();
			} else {
				valor += obj.getFilmes().get(i).getPreco();
			}
		}

		return valor;
	}
}
