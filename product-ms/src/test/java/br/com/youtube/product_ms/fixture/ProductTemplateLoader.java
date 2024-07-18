package br.com.youtube.product_ms.fixture;

import br.com.six2six.fixturefactory.Fixture;
import br.com.six2six.fixturefactory.Rule;
import br.com.six2six.fixturefactory.loader.TemplateLoader;
import br.com.youtube.product_ms.dto.ProductDTO;

public class ProductTemplateLoader implements TemplateLoader {

    @Override
    public void load() {
        Fixture.of(ProductDTO.class).addTemplate("valid", new Rule() {{
            add("name", random("Iphone 14 Pro Max", "Iphone 13 Pro Max", "Samsung S23 Ultra"));
            add("description", "Celular de últimma geração e tals. Parte da frente com Ceramic Shield, Parte de trás com vidro e estrutura de alumínio ");
            add("price", random(Double.class, range(0.01, 8767.98)));
        }});
    }
}