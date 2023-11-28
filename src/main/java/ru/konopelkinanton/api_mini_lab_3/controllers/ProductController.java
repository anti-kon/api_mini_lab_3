package ru.konopelkinanton.api_mini_lab_3.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.konopelkinanton.api_mini_lab_3.models.Product;
import ru.konopelkinanton.api_mini_lab_3.models.ProductList;
import ru.konopelkinanton.api_mini_lab_3.services.ProductService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
@AllArgsConstructor
public class ProductController {

    private ProductService service;

    @GetMapping
    public ProductList getAllProducts () {
        return service.getAllProducts();
    }

    @GetMapping("/{id}")
    public Product getProductById (@PathVariable int id) {
        return service.getProductById(id);
    }

    @GetMapping("/category/{category}")
    public ProductList getProductsByCategory (@PathVariable String category) {
        return service.getProductsByCategory(category);
    }

    @GetMapping("/categories")
    public List<String> getCategories () {
        return service.getCategories();
    }
}
