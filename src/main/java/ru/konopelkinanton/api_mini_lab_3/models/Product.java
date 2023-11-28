package ru.konopelkinanton.api_mini_lab_3.models;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@Builder
public class Product {
    private int id;
    private String title;
    private String description;
    private int price;
    private BigDecimal discountPercentage;
    private BigDecimal rating;
    private int stock;
    private String brand;
    private String category;
    private String thumbnail;
    private List<String> images;
}