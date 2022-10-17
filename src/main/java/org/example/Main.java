package org.example;

import org.example.model.Customer;
import org.example.model.Product;
import org.example.services.CustomerService;
import org.example.services.ProductService;

public class Main {
    public static void main(String[] args) {
        SessionFactoryUtils sessionFactoryUtils = new SessionFactoryUtils();
        sessionFactoryUtils.init();
        CustomerService customerService = new CustomerService(sessionFactoryUtils);
        ProductService productService = new ProductService(sessionFactoryUtils);

        for (Product product: customerService.getProducts(1L)) {
            System.out.println(product.getId() + " " + product.getTitle() + " " + product.getPrice());
        }

        for (Customer product: productService.getCustomers(1L)) {
            System.out.println(product.getId() + " " + product.getName());
        }
    }
}