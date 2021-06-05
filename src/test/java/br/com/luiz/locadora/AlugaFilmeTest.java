package br.com.luiz.locadora;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import br.com.luiz.Filme;
import br.com.luiz.Locacao;
import junit.framework.TestCase;

public class AlugaFilmeTest extends TestCase {
	
	private Filme filme;
	private Locacao locacao;
	ArrayList<Filme> filmes;
	
	@Before
	public void setUp() {
		filme = new Filme();
		locacao = new Locacao();
		filmes = new ArrayList<>();
	}
	
	
	@Test
	public void deveAlugarUmFilme() {
		filme = new Filme();
		locacao = new Locacao();
		filmes = new ArrayList<>();
		
		filme.setPreco(10);
		filme.setNome("Filme 1");
		
		filmes.add(filme);
		
		assertEquals(10.0, locacao.alugarFilmes(filmes));
	}
	
	@Test
	public void deveAlugarDoisFilmes() {
		filme = new Filme();
		locacao = new Locacao();
		filmes = new ArrayList<>();
		
		filme.setPreco(10);
		filme.setNome("Filme 1");

		filmes.add(filme);
		filmes.add(filme);
		
		assertEquals(20.0, locacao.alugarFilmes(filmes));
	}
	
	@Test
	public void deveAlugarTresFilmes() {
		filme = new Filme();
		locacao = new Locacao();
		filmes = new ArrayList<>();
		
		filme.setPreco(10);
		filme.setNome("Filme 1");
		
		filmes.add(filme);
		filmes.add(filme);
		filmes.add(filme);
		
		assertEquals(27.5, locacao.alugarFilmes(filmes));
	}
	
	@Test
	public void deveAlugarQuatroFilmes() {
		filme = new Filme();
		locacao = new Locacao();
		filmes = new ArrayList<>();
		
		filme.setPreco(10);
		filme.setNome("Filme 1");
		
		filmes.add(filme);
		filmes.add(filme);
		filmes.add(filme);
		filmes.add(filme);
		
		assertEquals(32.5, locacao.alugarFilmes(filmes));
	}
	
	@Test
	public void deveAlugarCincoFilmes() {
		filme = new Filme();
		locacao = new Locacao();
		filmes = new ArrayList<>();
		
		filme.setPreco(10);
		filme.setNome("Filme 1");
		
		filmes.add(filme);
		filmes.add(filme);
		filmes.add(filme);
		filmes.add(filme);
		filmes.add(filme);
		
		assertEquals(35.0, locacao.alugarFilmes(filmes));
	}
	
	@Test
	public void deveAlugarSeisFilmes() {
		filme = new Filme();
		locacao = new Locacao();
		filmes = new ArrayList<>();
		
		filme.setPreco(10);
		filme.setNome("Filme 1");
		
		filmes.add(filme);
		filmes.add(filme);
		filmes.add(filme);
		filmes.add(filme);
		filmes.add(filme);
		filmes.add(filme);
		
		assertEquals(35.0, locacao.alugarFilmes(filmes));
	}
	
	@Test
	public void deveAlugarSeteFilmes() {
		filme = new Filme();
		locacao = new Locacao();
		filmes = new ArrayList<>();
		
		filme.setPreco(10);
		filme.setNome("Filme 1");
		
		filmes.add(filme);
		filmes.add(filme);
		filmes.add(filme);
		filmes.add(filme);
		filmes.add(filme);
		filmes.add(filme);
		filmes.add(filme);
		
		assertEquals(45.0, locacao.alugarFilmes(filmes));
	}
	
	
	
	
	
}
