package org.example.services;

import org.example.SessionFactoryUtils;
import org.example.dao.ProductDao;
import org.example.model.Customer;
import org.example.model.Product;

import java.util.List;

public class ProductService {
    ProductDao productDao;

    public ProductService(SessionFactoryUtils sessionFactoryUtils) {
        productDao = new ProductDao(sessionFactoryUtils);
    }

    public Product findById(Long id) {
        return productDao.findById(id);
    }

    public List<Product> findAll() {
        return  productDao.findAll();
    }

    public void deleteById(Long id) {
        productDao.deleteById(id);
    }

    public void saveOrUpdate(Product product) {
        productDao.saveOrUpdate(product);
    }

    public List<Customer> getCustomers(Long id) {
        return productDao.getCustomers(id);
    }
}
