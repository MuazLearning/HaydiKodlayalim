package com.haydikodlayalim.dpatterns.d3_builder;

public class Main {

    public static void main(String[] args) {

        Product product1 = new Product();
        product1.setId(1L);
        product1.setName("Product 1");
        product1.setDescription("Product 1 description");

        Product product2 = new Product.ProductBuilder().id(2L).name("Product 2")
                .description("Product 2 description").build();

        ProductLombok product3 = ProductLombok.builder().id(3L).name("Product 3")
                .description("Product 3 description").build();

        System.out.println(product1);
        System.out.println(product2);
        System.out.println(product3);
    }
}
