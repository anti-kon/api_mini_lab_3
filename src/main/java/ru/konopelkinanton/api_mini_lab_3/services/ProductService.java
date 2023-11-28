package ru.konopelkinanton.api_mini_lab_3.services;

import ru.konopelkinanton.api_mini_lab_3.models.Product;
import ru.konopelkinanton.api_mini_lab_3.models.ProductList;

import java.util.List;

public interface ProductService {
    ProductList getAllProducts ();
    Product getProductById (int id);
    ProductList getProductsByCategory (String category);
    List<String> getCategories ();
}
