package org.example.dao;

import org.example.model.Customer;
import org.example.SessionFactoryUtils;
import org.example.model.Product;
import org.hibernate.Session;

import java.util.List;

public class CustomerDao {
    SessionFactoryUtils sessionFactoryUtils;

    public CustomerDao(SessionFactoryUtils sessionFactoryUtils) {
        this.sessionFactoryUtils = sessionFactoryUtils;
    }

    public Customer findById(Long id) {
        try(Session session = sessionFactoryUtils.getSession()) {
            session.beginTransaction();
            Customer customer = session.get(Customer.class, id);
            session.getTransaction().commit();
            return customer;
        }
    }

    public List<Customer> findAll() {
        try(Session session = sessionFactoryUtils.getSession()) {
            session.beginTransaction();
            List<Customer> customers = session.createQuery("select c from Customer c").getResultList();
            session.getTransaction().commit();
            return customers;
        }
    }

    public void deleteById(Long id) {
        try(Session session = sessionFactoryUtils.getSession()) {
            session.beginTransaction();
            session.delete(session.get(Customer.class, id));
            session.getTransaction().commit();
        }
    }

    public void saveOrUpdate(Customer customer) {
        try(Session session = sessionFactoryUtils.getSession()) {
            session.beginTransaction();
            session.saveOrUpdate(customer);
            session.getTransaction().commit();
        }
    }

    public List<Product> getProducts(Long id) {
        try(Session session = sessionFactoryUtils.getSession()) {
            session.beginTransaction();
            List<Product> products = session.get(Customer.class, id).getProducts();
            session.getTransaction().commit();
            return products;
        }
    }
}
