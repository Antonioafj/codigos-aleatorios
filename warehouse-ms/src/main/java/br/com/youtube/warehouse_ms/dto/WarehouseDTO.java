package br.com.youtube.warehouse_ms.dto;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class WarehouseDTO {

    private Long productId;
    private int quantity;
}
