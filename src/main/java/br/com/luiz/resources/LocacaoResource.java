package br.com.luiz.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.luiz.dto.FilmeDTO;
import br.com.luiz.services.LocacaoService;

@RestController
@RequestMapping(value = "/filmes")
public class LocacaoResource {
	
	@Autowired
	LocacaoService service;
	
	@GetMapping
	public ResponseEntity alugarFilmes(@RequestBody FilmeDTO objDto) {
		
		return ResponseEntity.ok().body(this.service.alugarFilmes(objDto));
		
	}

}
