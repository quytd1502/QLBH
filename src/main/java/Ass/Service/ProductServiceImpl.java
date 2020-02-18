package Ass.Service;

import Ass.Model.Products;
import Ass.Repository.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProductServiceImpl implements ProductsService {
    @Autowired
    private ProductsRepository productsRepository;

    @Override
    public List<Products> findAll() {
        return productsRepository.findAll();
    }

    @Override
    public Products finById(Long id) {
        return productsRepository.findById(id);
    }


    @Override
    public void save(Products products) {
        productsRepository.save(products);
    }

    @Override
    public void remove(Long id) {
        productsRepository.remove(id);
    }


}
