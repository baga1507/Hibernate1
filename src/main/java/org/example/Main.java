package org.example;

import org.hibernate.Session;

public class Main {
    public static void main(String[] args) {
        SessionFactoryUtils sessionFactoryUtils = new SessionFactoryUtils();
        sessionFactoryUtils.init();
        try {
            ProductDao productDao = new ProductDao(sessionFactoryUtils);
            Product product = productDao.findById(2L);
            productDao.deleteById(2L);
            System.out.println(product.getTitle());
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            sessionFactoryUtils.shutdown();
        }
    }
}