package com.example.apicpf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/cpf")
public class CpfController {

    private static final String API_URL = "https://databit.online/api";
    private static final String TOKEN = "f5d9ba82-5da8-415c-a83f-41bda913e787";
    private static final String TYPE = "cpftype";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/{cpf}")
    public Object getCpfData(@PathVariable(value = "cpf") String cpf) {
        String apiUrl = API_URL + "?token=" + TOKEN + "&type=" + TYPE + "&query=" + cpf;

        // Faz a requisição GET
        Object responseData = restTemplate.getForObject(apiUrl, Object.class);

        return responseData;
    }

}
