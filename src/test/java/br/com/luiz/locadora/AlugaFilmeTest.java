package br.com.luiz.locadora;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import br.com.luiz.Filme;
import br.com.luiz.Locacao;
import junit.framework.TestCase;

public class AlugaFilmeTest extends TestCase {
	
	private Filme filme;
	private Locacao locacao;
	ArrayList<Filme> filmes;
	
	@BeforeAll
	public void setUp() {
		filme = new Filme();
		locacao = new Locacao();
		filmes = new ArrayList<>();
	}
	
	
	@Test
	public void deveAlugarUmFilme() {
		filme.setPreco(10);
		filme.setNome("Filme 1");
		
		assertEquals(10.0, locacao.alugarUmFilme(filme));
	}
	
	@Test
	public void deveAlugarDoisFilmes() {
		
		filme.setPreco(10);
		filme.setNome("Filme 1");
		
		Filme filme2 = new Filme();
		filme2.setPreco(10);
		filme2.setNome("Filme2");
		
		filmes.add(filme);
		filmes.add(filme2);
		
		assertEquals(20.0, locacao.alugarDoisFilmes(filmes));
	}
	
	@Test
	public void deveAlugarTresFilmes() {
		
		filme.setPreco(10);
		filme.setNome("Filme 1");
		
		Filme filme2 = new Filme();
		filme2.setPreco(10);
		filme2.setNome("Filme2");
		
		Filme filme3 = new Filme();
		filme3.setPreco(10);
		filme3.setNome("Filme3");
		
		filmes.add(filme);
		filmes.add(filme2);
		filmes.add(filme3);
		
		assertEquals(27.5, locacao.alugarDoisFilmes(filmes));
	}
	
	
	
	
}
