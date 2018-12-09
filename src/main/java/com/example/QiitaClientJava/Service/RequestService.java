package com.example.QiitaClientJava.Service;

import com.example.QiitaClientJava.Model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class RequestService {

    @Autowired
    RestTemplate restTemplate;

    @Value("https://qiita.com/api/v2/items")
    private URI uri;

    public ArrayList<Item> getAllsample() {
        Item[] items = restTemplate.getForObject(uri, Item[].class);
        return new ArrayList(Arrays.asList(items));
    }

    public List<Item> getAllItems() {
        List<Item> result = new ArrayList<>();
        RequestEntity requestEntity = RequestEntity.get(uri).build();
        ResponseEntity<List<Item>> items = restTemplate.exchange(requestEntity, new ParameterizedTypeReference<List<Item>>() {
        });
        return items.getBody();
    }
}
