package com.example.demo4.controller;

import com.example.demo4.Service.RegionService;
import com.example.demo4.model.Pais;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/pais")
public class PaisController {

  @Autowired
  private RegionService regionService;

  @GetMapping("/{region}")
  public List<Pais> readAll(@PathVariable("region")Long region) {
    List<Pais> regiones = StreamSupport
      .stream(regionService.findPaisByRegion(region).spliterator(), false)
      .collect(Collectors.toList());
    return regiones;
  }
}
