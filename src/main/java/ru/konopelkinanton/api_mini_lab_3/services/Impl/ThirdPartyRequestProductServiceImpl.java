package ru.konopelkinanton.api_mini_lab_3.services.Impl;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import ru.konopelkinanton.api_mini_lab_3.models.Product;
import ru.konopelkinanton.api_mini_lab_3.models.ProductList;
import ru.konopelkinanton.api_mini_lab_3.services.ProductService;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

@Service
public class ThirdPartyRequestProductServiceImpl implements ProductService {

    private final RestTemplate restTemplate;

    public ThirdPartyRequestProductServiceImpl(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    @Override
    public ProductList getAllProducts() {
        String url = "https://dummyjson.com/products";
        return this.restTemplate.getForObject(url, ProductList.class);
    }

    @Override
    public Product getProductById(int id) {
        String url = "https://dummyjson.com/products/{id}";
        return this.restTemplate.getForObject(url, Product.class, id);
    }

    @Override
    public ProductList getProductsByCategory(String category) {
        String url = "https://dummyjson.com/products/category/{category}";
        return this.restTemplate.getForObject(url, ProductList.class, category);
    }

    @Override
    public List<String> getCategories() {
        String url = "https://dummyjson.com/products/categories";
        return List.of(Objects.requireNonNull(this.restTemplate.getForObject(url, String[].class)));
    }
}
