package com.example.restServ;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/")
public class CalculatorController {
	
	@GetMapping("addition")
	@ResponseBody
	public double addition(@RequestParam double fir,@RequestParam double sec) {
		return fir+sec;
	}
	
	@GetMapping("multiplication")
	@ResponseBody
	public double multiplication(@RequestParam double fir,@RequestParam double sec) {
		return fir * sec;
	}
	
	
	

}

