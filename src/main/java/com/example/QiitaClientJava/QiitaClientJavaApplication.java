package com.example.QiitaClientJava;

import com.example.QiitaClientJava.Model.Item;
import com.example.QiitaClientJava.Service.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class QiitaClientJavaApplication {

		public static void main(String[] args) {
			SpringApplication.run(QiitaClientJavaApplication.class, args);
		}

}
