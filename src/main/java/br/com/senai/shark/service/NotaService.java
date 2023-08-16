package br.com.senai.shark.service;

import org.springframework.stereotype.Service;

@Service
public class NotaService {
	
	public double calculaMedia(String notas) {
		String[] notasVetor = notas.split(",");
		
		double soma = 0.0;
		for(int i = 0; i < notasVetor.length; i++) {
			soma += Double.parseDouble(notasVetor[i]);
		}
		double media = soma/notasVetor.length;
		return media;
	}
}
