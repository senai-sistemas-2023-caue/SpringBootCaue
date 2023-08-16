package br.com.senai.shark.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.senai.shark.service.NotaService;

@RestController
public class NotasController {
	
	@Autowired
	private NotaService notaService;
	
	@GetMapping("/media")
	public String calculaMedia(@RequestParam String nome, @RequestParam String notas) {
		double media = notaService.calculaMedia(notas);
		
		return "O aluno " + nome + " foi " + (media < 7 ? "reprovado" : "aprovado") + " com média: " + media;
	}
	
	@GetMapping("/media/{nome}/{notas}")
	public String calculaMediaPath(@RequestParam String nome, @RequestParam String notas) {
		double media = notaService.calculaMedia(notas);
		
		return "O aluno " + nome + " foi " + (media < 7 ? "reprovado" : "aprovado") + " com média: " + media;
	}
	
}
