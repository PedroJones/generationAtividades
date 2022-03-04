package br.org.generation.exercicios.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivos")
public class objetivos {
	 @GetMapping
	 public String helloobjetivos() {
		 return "Aprender a gerar aplicações de banco de dados com o Spring!";
	 }
}