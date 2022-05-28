package com.example.assignment2.Repository;

import com.example.assignment2.Entity.customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface customerRepository extends JpaRepository<customer,Long> {
}
