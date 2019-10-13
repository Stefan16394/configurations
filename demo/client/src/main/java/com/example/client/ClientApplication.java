package com.example.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RefreshScope
public class ClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientApplication.class, args);
	}

	@Value("${server.port:000}")
	private String port;

	@Value("${message.bye:x}")
    private String message;


	@GetMapping("/port")
	public String getPort(){
		return port;
	}

	@GetMapping("/home")
    public String getMessage(){
	    return message;
    }

}
