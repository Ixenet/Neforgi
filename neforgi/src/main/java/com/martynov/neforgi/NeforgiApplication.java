package com.martynov.neforgi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class NeforgiApplication {

	public static void main(String[] args) {
		SpringApplication.run(NeforgiApplication.class, args);
	}

	    @Controller
    static class SpaForwardingController {
        @GetMapping(value = "/{path:[^\\.]*}")
        public String forward() {
            return "forward:/index.html";
        }
    }
}
