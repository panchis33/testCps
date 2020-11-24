package com.example.demo4.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tarifa")
public class Tarifa implements Serializable {

  /**
   *
   */
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private Double tarifa;
  private Long estado;
  private Long pais;



  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Double getTarifa() {
    return tarifa;
  }

  public void setTarifa(Double tarifa) {
    this.tarifa = tarifa;
  }

  public Long getEstado() {
    return estado;
  }

  public void setEstado(Long estado) {
    this.estado = estado;
  }

  public Long getPais() {
    return pais;
  }

  public void setPais(Long pais) {
    this.pais = pais;
  }
}
