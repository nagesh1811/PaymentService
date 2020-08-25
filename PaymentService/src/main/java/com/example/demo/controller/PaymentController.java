package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

@GetMapping("/payment")
public ResponseEntity<String> callSecondClient() throws Exception {
		
		String response = "Payment Received";
		
		return new ResponseEntity<String>(response,HttpStatus.OK);
	}
}
