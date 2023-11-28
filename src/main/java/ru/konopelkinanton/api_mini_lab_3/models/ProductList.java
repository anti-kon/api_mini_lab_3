package ru.konopelkinanton.api_mini_lab_3.models;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class ProductList {
    private List<Product> products;
    private int total;
    private int skip;
    private int limit;
}
