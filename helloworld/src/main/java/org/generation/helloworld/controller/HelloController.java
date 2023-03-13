package org.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//indiga para o spring que essa é uma classe controladora
@RestController

//indica um endpoit para nossa aplicação
@RequestMapping("/hello")
public class HelloController {
	
	@GetMapping
	public String hello() {
		return "Alo mundão";
	}
	
	@GetMapping ("/bsm")
	public String bsm() {
		return "- Persistência\r\n"
				+ "- Mentalidade de Crescimento\r\n"
				+ "- Orientação ao Futuro\r\n"
				+ "- Responsabilidade Pessoal\r\n"
				+ "- Trabalho em Equipe\r\n"
				+ "- Comunicação\r\n"
				+ "- Comunicação Não Violenta\r\n"
				+ "- Atenção para Detalhes\r\n"
				+ "- Proatividade";
	}
	
	@GetMapping ("/objetivo")
	public String objetivo() {
		return "Compreender a arquitetura de sistemas web e as tecnologias utilizadas no desenvolvimento backend.\r\n"
				+ "Desenvolver habilidades de programação na linguagens Java.\r\n"
				+ "Compreender os conceitos de API e como construir e integrar APIs com outras aplicações.\r\n"
				+ "Desenvolver as ferramentas de desenvolvimento de backend, como o Git e Spring Boot.\r\n"
				+ "Aprender a implementar testes automatizados para garantir a qualidade do código e a funcionalidade do sistema.";
	}
}
