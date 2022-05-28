package com.example.assignment2.Repository;

import com.example.assignment2.Entity.product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<product,Long> {



}
