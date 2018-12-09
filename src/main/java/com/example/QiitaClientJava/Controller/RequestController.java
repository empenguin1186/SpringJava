package com.example.QiitaClientJava.Controller;

import com.example.QiitaClientJava.Model.Item;
import com.example.QiitaClientJava.Service.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RequestController {

    @Autowired
    RequestService requestService;

    @GetMapping("/test")
    public String test(){
        List<Item> items = requestService.getAllItems();
        return items.get(0).getId();
    }

}
