package br.com.senai.shark.service;


import org.springframework.stereotype.Service;

@Service
public class HelloService {
	
	public void validaIdade(Integer idade) {
		if(idade == null || idade < 10) {
			throw new RuntimeException("Idade deve ser maior ou igual a 10");
		}
	}
	
	public void mediaNota(Integer nota1, Integer nota2, Integer nota3) {
		int notaFinal = (nota1 + nota2 + nota3) / 3;
		if (notaFinal < 7) {
			throw new RuntimeException("Média menor que 7");
		}
	}
}
