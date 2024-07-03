package br.com.youtube.product_ms.dto;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class productDTO {

    private String name;
    private  String description;
    private double price;
    private boolean available;
}
