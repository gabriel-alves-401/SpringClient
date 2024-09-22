package com.github.io.springTest;

import org.springframework.context.annotation.Bean;

@Development
public class SpringConfiguration {
    @Bean
    public String index() {
        return "Pagina Inicial de Desenvolvimento";
    }
}
