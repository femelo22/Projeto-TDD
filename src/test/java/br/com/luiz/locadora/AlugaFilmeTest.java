package br.com.luiz.locadora;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import br.com.luiz.dto.FilmeDTO;
import br.com.luiz.entities.Filme;
import br.com.luiz.services.LocacaoService;
import junit.framework.TestCase;

public class AlugaFilmeTest extends TestCase {
	
	private Filme filme;
	private LocacaoService locacao;
	private FilmeDTO filmesDto;
	ArrayList<Filme> filmes;	
	
	@Test
	public void deveLancarExcecaoSemFilmesAlugados() {
		try {
			
			filme = new Filme();
			locacao = new LocacaoService();
			filmes = new ArrayList<>();
			filmesDto = new FilmeDTO();

			locacao.alugarFilmes(filmesDto);
			
			fail();

		} catch (IllegalArgumentException e) {
			assertEquals("Voce deve alugar pelo menos um filme.", e.getMessage());
		}

	}
	
	@Test
	public void deveAlugarUmFilme() {
		filme = new Filme();
		locacao = new LocacaoService();
		filmes = new ArrayList<>();
		filmesDto = new FilmeDTO();
		
		filme.setPreco(10);
		filme.setNome("Filme 1");
		
		filmes.add(filme);
		
		filmesDto.setFilmes(filmes);
		
		assertEquals(10.0, locacao.alugarFilmes(filmesDto));
	}
	
	@Test
	public void deveAlugarDoisFilmes() {
		filme = new Filme();
		locacao = new LocacaoService();
		filmes = new ArrayList<>();
		filmesDto = new FilmeDTO();
		
		filme.setPreco(10);
		filme.setNome("Filme 1");

		filmes.add(filme);
		filmes.add(filme);
		
		filmesDto.setFilmes(filmes);
		
		assertEquals(20.0, locacao.alugarFilmes(filmesDto));
	}
	
	@Test
	public void deveAlugarTresFilmes() {
		filme = new Filme();
		locacao = new LocacaoService();
		filmes = new ArrayList<>();
		filmesDto = new FilmeDTO();
		
		filme.setPreco(10);
		filme.setNome("Filme 1");
		
		filmes.add(filme);
		filmes.add(filme);
		filmes.add(filme);
		
		filmesDto.setFilmes(filmes);
		
		assertEquals(27.5, locacao.alugarFilmes(filmesDto));
	}
	
	@Test
	public void deveAlugarQuatroFilmes() {
		filme = new Filme();
		locacao = new LocacaoService();
		filmes = new ArrayList<>();
		filmesDto = new FilmeDTO();
		
		filme.setPreco(10);
		filme.setNome("Filme 1");
		
		filmes.add(filme);
		filmes.add(filme);
		filmes.add(filme);
		filmes.add(filme);
		
		filmesDto.setFilmes(filmes);
		
		assertEquals(32.5, locacao.alugarFilmes(filmesDto));
	}
	
	@Test
	public void deveAlugarCincoFilmes() {
		filme = new Filme();
		locacao = new LocacaoService();
		filmes = new ArrayList<>();
		filmesDto = new FilmeDTO();
		
		filme.setPreco(10);
		filme.setNome("Filme 1");
		
		filmes.add(filme);
		filmes.add(filme);
		filmes.add(filme);
		filmes.add(filme);
		filmes.add(filme);
	
		filmesDto.setFilmes(filmes);
		
		assertEquals(35.0, locacao.alugarFilmes(filmesDto));
	}
	
	@Test
	public void deveAlugarSeisFilmes() {
		filme = new Filme();
		locacao = new LocacaoService();
		filmes = new ArrayList<>();
		filmesDto = new FilmeDTO();
		
		filme.setPreco(10);
		filme.setNome("Filme 1");
		
		filmes.add(filme);
		filmes.add(filme);
		filmes.add(filme);
		filmes.add(filme);
		filmes.add(filme);
		filmes.add(filme);
		
		filmesDto.setFilmes(filmes);
		
		assertEquals(35.0, locacao.alugarFilmes(filmesDto));
	}
	
	@Test
	public void deveAlugarSeteFilmes() {
		filme = new Filme();
		locacao = new LocacaoService();
		filmes = new ArrayList<>();
		filmesDto = new FilmeDTO();
		
		filme.setPreco(10);
		filme.setNome("Filme 1");
		
		filmes.add(filme);
		filmes.add(filme);
		filmes.add(filme);
		filmes.add(filme);
		filmes.add(filme);
		filmes.add(filme);
		filmes.add(filme);
		
		filmesDto.setFilmes(filmes);
		
		assertEquals(45.0, locacao.alugarFilmes(filmesDto));
	}
	
	
	
	
	
}
