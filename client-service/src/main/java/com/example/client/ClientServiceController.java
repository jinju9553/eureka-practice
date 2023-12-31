package com.example.client;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/client-service")
public class ClientServiceController {

	@GetMapping("/health-check")
	public String status(HttpServletRequest request) {
		//포트를 가져와서 출력
		return String.format("Client-Service Connected : %s", request.getServerPort());
	}
	
	//기존 프로젝트처럼 다른 서비스도 정의 가능
	@GetMapping("/message")
	public ResponseEntity<String> message() {
		return ResponseEntity.status(HttpStatus.OK).body("Hello Service");
	}
 }
