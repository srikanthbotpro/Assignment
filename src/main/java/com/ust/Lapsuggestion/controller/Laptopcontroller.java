package com.ust.Lapsuggestion.controller;

import com.ust.Lapsuggestion.model.Laptop;
import com.ust.Lapsuggestion.service.Laptopservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/ust")
public class Laptopcontroller {

    @Autowired
    private Laptopservice s;

    @PutMapping("/addlap")
    public Laptop addlap(@RequestBody Laptop laptop) {
        return s.addlap(laptop);
    }
    @GetMapping("/getlapbasedonprice/{price}")
    public Map<String, Long> getLap(@PathVariable int price)
    {
        return s.getLap(price);
    }
}
