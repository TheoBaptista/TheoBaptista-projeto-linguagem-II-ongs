package br.com.trabalho.linguagem.sistema.ongs;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SistemaOngsApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SistemaOngsApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Olá mundo!!");
        System.out.println("Aqui ficará o código principal do projeto!");
    }
}
