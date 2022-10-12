package org.example;

import org.hibernate.Session;

public class Main {
    public static void main(String[] args) {
        SessionFactoryUtils sessionFactoryUtils = new SessionFactoryUtils();
        sessionFactoryUtils.init();
        try {
            Session session = sessionFactoryUtils.getSession();
            session.beginTransaction();
            Product product = session.get(Product.class, 3L);
            session.getTransaction().commit();
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