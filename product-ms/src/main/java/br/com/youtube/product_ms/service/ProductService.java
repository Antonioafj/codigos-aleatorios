package br.com.youtube.product_ms.service;

import br.com.youtube.product_ms.dto.ProductDTO;

import java.util.List;
import java.util.Optional;

public interface ProductService {

        Optional<ProductDTO> create (ProductDTO request);

        List<ProductDTO> getAll();

        Optional<ProductDTO> getById(Long id);

        boolean inactive(Long id);

}