package uk.ac.westminster.products_api;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class InfoController {

        @GetMapping("/info")
        public String info() {
            return "This is my Spring Boot application";
        }
    }

