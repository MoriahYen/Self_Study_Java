package com.example.L9_demo.repo;

import com.example.L9_demo.model.Laptop;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepository {
    public void save(Laptop lap) {
        System.out.println("Saved in database...");
    }
}
