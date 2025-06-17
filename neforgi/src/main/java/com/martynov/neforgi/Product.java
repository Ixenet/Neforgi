package com.martynov.neforgi;

import lombok.Data;
import lombok.AllArgsConstructor;

@Data 
@AllArgsConstructor 
public class Product {
    private Long id;
    private String name;
    private String description;
    private double price;
    private String imageUrl;
}