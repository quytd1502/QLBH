package Ass.Service;

import Ass.Model.Products;

import java.util.List;

public interface ProductsService {
    List<Products> findAll();
    Products finById(Long id);
    void save(Products products);
    void remove(Long id);
}
