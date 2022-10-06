package br.com.samuel.gstec.resource.hello;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {
    
    @GetMapping("/welcome")
    public ResponseEntity<String> sendMessage() {
        return ResponseEntity.ok("<h1>Olá mundo!</h1>");
    }
}