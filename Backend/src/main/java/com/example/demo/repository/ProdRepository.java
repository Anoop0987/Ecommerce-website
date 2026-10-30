package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.Product;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdRepository extends JpaRepository<Product, Integer> {}