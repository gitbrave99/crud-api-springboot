package com.crudprods.crud.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.crudprods.crud.entity.ProductEntity;
import com.crudprods.crud.repository.ProductRepository;
import com.crudprods.crud.service.ProductService;

@Service
public class ProductImplement implements ProductService{

    @Autowired
    ProductRepository productRepository;

    @Transactional(readOnly = true)
    @Override
    public List<ProductEntity> getListProducts() {
        return this.productRepository.findAll();
    }
    
}
