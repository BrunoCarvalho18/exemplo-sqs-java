package br.com.sqstutorial.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.sqstutorial.service.MessageService;

@RestController
@RequestMapping("/sqs")
public class SQSController {
	
	@Autowired
	private MessageService enviarParaQueue;

	@GetMapping
	public String enviarMensagem() {
		enviarParaQueue.sentToQueue("Olá Spring Boot !");
		return "Enviou a mensagem !";
	}
}
