package br.com.impacta.lab.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/atividades")
/*@RequestMapping("/teste")*/
public class HelloWorldController {

	@GetMapping("hello")
	public ResponseEntity<String> helloWorld() {
		
	
  	//Digite -> Hello world !
		return ResponseEntity.ok("Hello world 2 !");
	}
	
}
