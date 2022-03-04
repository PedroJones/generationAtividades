package br.org.generation.exercicios.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bsm")
public class hellobsm {
	 @GetMapping
	 public String bsm() {
		 return "Persistência <br> <br> Atenção aos detalhes!";
	 }
}
