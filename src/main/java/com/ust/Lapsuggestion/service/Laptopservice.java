package com.ust.Lapsuggestion.service;

import com.speedment.jpastreamer.application.JPAStreamer;
import com.ust.Lapsuggestion.model.Laptop;
import com.ust.Lapsuggestion.repo.Laptoprepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class Laptopservice
{
    @Autowired
    private Laptoprepo r;

    private final JPAStreamer j;

    @Autowired
    public Laptopservice( JPAStreamer j)
    {
        this.j = j;
    }

    public Laptop addlap(Laptop laptop) {
        return r.save(laptop);
    }

    public Map<String, Long> getLap(int price) {
        return j.stream(Laptop.class).filter(laptop -> laptop.getPrice() <= price)
                .collect(Collectors.groupingBy(Laptop::getModelname, Collectors.counting()));
    }
    }
