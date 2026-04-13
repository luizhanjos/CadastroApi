package com.javax.CadastroApi.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class CadastroController {

	@GetMapping("/olaMundo")
	public String olaMundo() {
		return "Olá Mundo";
	}
	
	
}
