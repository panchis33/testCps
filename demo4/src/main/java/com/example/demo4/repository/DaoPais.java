package com.example.demo4.repository;


import java.util.List;

import com.example.demo4.model.Pais;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface DaoPais extends JpaRepository<Pais, Long> {
    @Query("SELECT t FROM Pais t WHERE t.region = ?1")    
    List<Pais> findByRegion(Long region );
    
}