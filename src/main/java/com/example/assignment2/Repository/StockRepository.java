package com.example.assignment2.Repository;

import com.example.assignment2.Entity.stock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockRepository extends JpaRepository<stock,Long> {
}
