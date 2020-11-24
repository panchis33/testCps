package com.example.demo4.Service;

import com.example.demo4.model.Pais;
import com.example.demo4.model.Region;
import com.example.demo4.model.Tarifa;

public interface RegionService {
  public Iterable<Region> findAll();

  public Iterable<Pais> findPaisByRegion(Long region);

  public Iterable<Tarifa> findTarifaByPais(Long pais);
}
