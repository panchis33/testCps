package com.example.demo4.Service.impl;

import com.example.demo4.Service.RegionService;
import com.example.demo4.model.Pais;
import com.example.demo4.model.Region;
import com.example.demo4.model.Tarifa;
import com.example.demo4.repository.DaoPais;
import com.example.demo4.repository.DaoRegion;
import com.example.demo4.repository.DaoTarifa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class RegionServiceImpl implements RegionService {

  @Autowired
  private DaoRegion daoRegion;

  @Autowired
  private DaoPais daoPais;

  @Autowired
  private DaoTarifa daoTarifa;

  @Override
  @Transactional(readOnly = true)
  public Iterable<Region> findAll() {
    return daoRegion.findAll();
  }

  @Override
  @Transactional(readOnly = true)
  public Iterable<Pais> findPaisByRegion(Long region) {
    return daoPais.findByRegion(region);
  }

  @Override
  public Iterable<Tarifa> findTarifaByPais(Long pais) {
    return daoTarifa.findByPais(pais);
  }
}
