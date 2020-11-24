package com.example.demo4.controller;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import com.example.demo4.Service.RegionService;
import com.example.demo4.model.Tarifa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/tarifa")
public class TarifaController {
    @Autowired
    private RegionService regionService;
    

    @GetMapping("/{pais}")
  public List<Tarifa> readAll(@PathVariable("pais")Long pais) {
    List<Tarifa> regiones = StreamSupport
      .stream(regionService.findTarifaByPais(pais).spliterator(), false)
      .collect(Collectors.toList());
    return regiones;
  }
}
