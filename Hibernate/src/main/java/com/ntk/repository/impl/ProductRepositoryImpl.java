/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ntk.repository.impl;

import com.ntk.HibernateDemo.HibernateUtils;
import com.ntk.pojo.Product;
import java.util.List;
import java.util.Map;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Session;

/**
 *
 * @author admin
 */
public class ProductRepositoryImpl {
    public List<Product> getProducts (Map<String, String> params){
        try (Session s = HibernateUtils.getFactory().openSession()){
            CriteriaBuilder b = s.getCriteriaBuilder();
            CriteriaQuery<Product> q = b.createQuery(Product.class);
            Root r = q.from(Product.class);
            
            q.select(r);
            q.orderBy(b.desc(r.get("id")));
            
            Query query = s.createQuery(q);
//            Query query = s.createQuery("From Products");
            List<Product> products = query.getResultList();
            
            return products;
        }
    }
}
