package com.aprendizagem.aprendizagem.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Aprendizagem")

public class AprendizagemController {
	@GetMapping

	public String hello() {
		return "Meus objetivos de aprendizagem para esta semana são reforçar o aprendizado em banco "
				+ "de dados e Spring ";
	}
	}


