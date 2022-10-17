package org.example.services;

import org.example.SessionFactoryUtils;
import org.example.dao.CustomerDao;
import org.example.model.Customer;
import org.example.model.Product;

import java.util.List;

public class CustomerService {
    CustomerDao customerDao;

    public CustomerService(SessionFactoryUtils sessionFactoryUtils) {
        customerDao = new CustomerDao(sessionFactoryUtils);
    }

    public Customer findById(Long id) {
        return customerDao.findById(id);
    }

    public List<Customer> findAll() {
        return customerDao.findAll();
    }

    public void deleteById(Long id) {
        customerDao.deleteById(id);
    }

    public void saveOrUpdate(Customer customer) {
        customerDao.saveOrUpdate(customer);
    }

    public List<Product> getProducts(Long id) {
        return customerDao.getProducts(id);
    }
}
