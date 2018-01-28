package com.study.aop.dao;


import com.study.aop.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDao extends JpaRepository<Product,Long> {
    public Product findById(Long id);
}
