package edu.fisa.ce.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CICDController {
	
	@GetMapping("fisa")
	public String test() {
		System.out.println("ddd");
		return "dd?";
	}
}
