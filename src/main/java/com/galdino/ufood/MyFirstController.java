package com.galdino.ufood;

import com.galdino.ufood.model.Client;
import com.galdino.ufood.service.ActivationClientService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyFirstController {
    private ActivationClientService activationClientService;

    public MyFirstController(ActivationClientService activationClientService) {
        this.activationClientService = activationClientService;
    }

    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        Client client = new Client("John", "john@xyt.com", "55859999999");

        activationClientService.activate(client);

        return "Hello";
    }
}
