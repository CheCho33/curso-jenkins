package com.first.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

    //Este es un nuevo comentario
    //Agregamos algo nuevo 2
    @GetMapping("/hello")
    public String saludar(){
        return "Hola Mundo con REST en Spring Boot";
    }

    //Este es otro comentario
    //Agregamos algo 1
    @GetMapping("/hello2")
    public String saludar2(){
        return "Hola Mundo con REST en Spring Boot";
    }


    @GetMapping("/hello3")
    public String saludar3(){
        return "Hola Mundo con REST en Spring Boot";
    }


    @GetMapping("/hello4")
    public String saludar4(){
        return "Hola Mundo con REST en Spring Boot";
    }


    //Otro comentario
    @GetMapping("/hello6")
    public String saludar6(){
        return "Hola Mundo con REST en Spring Boot";
    }

    
    //Otro comentario
    @GetMapping("/hello10")
    public String saludar10(){
        return "Hola Sergio A";
    }


        //Otro comentario
        @GetMapping("/hello11")
        public String saludar11(){
            return "Hola Sergio A01";
        }

                //Otro comentario
        @GetMapping("/hello12")
        public String saludar12(){
            return "Hola Sergio A02";
        }
}

