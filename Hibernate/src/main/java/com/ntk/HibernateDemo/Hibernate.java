/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.ntk.HibernateDemo;

import com.ntk.pojo.Category;
import com.ntk.repository.impl.ProductRepositoryImpl;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;

/**
 *
 * @author admin
 */
public class Hibernate {

    public static void main(String[] args) {
//        try(Session s = HibernateUtils.getFactory().openSession()) {
//            Query q = s.createQuery("From Category");
//            List<Category> cates = q.getResultList();
//            
//            cates.forEach(c -> System.out.println(c.getName()));
//        }
        ProductRepositoryImpl s = new ProductRepositoryImpl();
//        s.getProducts(null).forEach(p -> System.out.printf("%s - %.1f - %s\n", p.getName(), 
//                p.getPrice(), p.getCategory().getName()));
          s.getProducts(null).forEach(p -> System.out.printf("%d - %s - %.1f - %s\n", p.getId(), p.getName(), 
                p.getPrice(), p.getCategory().getName()));
    }
}
