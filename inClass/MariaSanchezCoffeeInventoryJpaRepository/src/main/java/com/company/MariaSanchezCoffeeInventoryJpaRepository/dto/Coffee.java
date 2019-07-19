package com.company.MariaSanchezCoffeeInventoryJpaRepository.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name="coffee")
public class Coffee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Integer roasterId;
    private String name;
    private int count;
    private lo
}
