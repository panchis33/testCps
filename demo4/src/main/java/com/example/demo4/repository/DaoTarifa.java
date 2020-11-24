package com.example.demo4.repository;

import com.example.demo4.model.Tarifa;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface DaoTarifa extends JpaRepository<Tarifa, Long> {
  @Query("SELECT t FROM Tarifa t WHERE t.pais = ?1")
  List<Tarifa> findByPais(Long pais);
}
