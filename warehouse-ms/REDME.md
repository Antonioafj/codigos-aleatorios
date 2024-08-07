# Product-ms

## Endpoints
- BaseURL: /products
- POST: create()
- GET: getAll()
- GET /{id}: getById()
- PUT /{id}: update()
- DELETE /{id} delete()

## Model
``` json
{
  "id": 1,
  "name": "iPhone 13 Pro Max",
  "description": "Celular de última geração e tals",
  "price": 6999.90,
  "isAvailable": true
}
```

## Business Rules

- Só é possível a criação de produtos com preço positivo;
- Não é possível pesquisar produtos que não estão disponíveis;
- Não é possível inserir descrições com menos de 50 caracteres;

# Warehouse-ms

## Endpoints
- BaseURL: /Warehouses
- POST: create()
- GET: getAll()
- GET /{id}: getById()*
- PUT /{id}: update()*

## Model
```json
{
 "id": 1,
 "product-id": 1,
 "quantity": 10
}
```

## Business Rules

- O estoque é reponsável por avisar se o produto está ou não disponível. Ou seja caso o valor da quantidade
  seja igual a 0 deve informar o outro serviço.
- Não é permitido mais de uma linha do mesmo produto salva na base de dados;
