package org.example.model;

public class Store {

    public static void listProducts(ProductForSale[] products) {

        for (ProductForSale product : products) {
            product.showDetails();
        }
    }

    public static void main(String[] args) {

        ProductForSale[] products = new ProductForSale[3];

        products[0] = new Chocolate(
                "Dark Chocolate",
                120.0,
                "Premium dark chocolate"
        );

        products[1] = new Coke(
                "Coca Cola",
                45.0,
                "Classic Coca Cola"
        );

        products[2] = new Bread(
                "White Bread",
                25.0,
                "Fresh white bread"
        );

        listProducts(products);
    }
}