package br.com.senai.shark.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.senai.shark.service.Senso;

@RestController
@RequestMapping("/senso")
public class SensoController {

	private static List<Senso> pessoa = new ArrayList<>();
	
	@PostMapping
	public ResponseEntity<Senso> inserePessoa(@RequestBody Senso pessoaSenso) {
		pessoa.add(pessoaSenso);
		return ResponseEntity.ok(pessoaSenso);
	}
	
	@GetMapping("/senso")
	public String Pessoa() {
		pessoa
		return "Nome: " + 
	}
}
