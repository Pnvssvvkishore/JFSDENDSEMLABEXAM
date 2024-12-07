package com.klef.jfsd.exam.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Map;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private RestTemplate restTemplate;

    @SuppressWarnings("unchecked")
	@Override
    public List<Map<String, Object>> getAllProducts() {
        String url = "https://fakestoreapi.com/products";
        return restTemplate.getForObject(url, List.class);
    }
}
