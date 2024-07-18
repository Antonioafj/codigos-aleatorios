package br.com.youtube.product_ms.service;

import br.com.youtube.product_ms.dto.ProductDTO;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class ProductServiceTest {

    @Autowired
    private ProductService service;

    private ProductDTO request;

    @BeforeEach
    public  void setUp() {
        request = new ProductDTO();
        request.setName("Iphone 14 Pro Max");
        request.setDescription("Celular de últimma geração e tals. Parte da frente com Ceramic Shield, Parte de trás com vidro e estrutura de alumínio ");
        request.setPrice(13654.99);
    }

    @Test
    public void shouldCreateProduct() {

        Optional<ProductDTO> response = service.create(request);

        assertNotNull(response.get());
        assertEquals(request.getName(), response.get().getName());
        assertEquals(request.getDescription(), response.get().getDescription());
        assertEquals(request.getPrice(), response.get().getPrice());
        assertTrue(response.get().isAvailable());
    }
}
