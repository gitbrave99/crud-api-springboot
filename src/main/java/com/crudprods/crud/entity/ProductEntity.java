package com.crudprods.crud.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "product")
public class ProductEntity implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_product")
    private Integer id_product;

    @Column(name = "id_category")
    private Integer id_category;

    @Column(name = "product_name")
    private String product_name;

    @Column(name = "brand")
    private String brand;

    @Column(name = "unit_price")
    private Double unit_price;

    @Column(name = "stock")
    private Integer stock;


}
