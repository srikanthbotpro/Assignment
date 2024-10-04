package com.ust.Lapsuggestion.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Laptop {
    @Id
    private String id;
    private String Modelname;
    private String Brandname;
    private String Price;
    private String Processor;
}
