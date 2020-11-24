package com.example.demo4.repository;

import com.example.demo4.model.Region;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DaoRegion extends JpaRepository<Region, Long> {
 
    
}
