package com.example.demo4.controller;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import com.example.demo4.Service.RegionService;
import com.example.demo4.model.Region;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
@RequestMapping("/api/region")
public class RegionController {

  @Autowired
  private RegionService regionService;

  @GetMapping
  public List<Region> readAll(){
      List<Region> regiones = StreamSupport
      .stream(regionService.findAll().spliterator(), false)
      .collect(Collectors.toList());
    return regiones;
  }
}
