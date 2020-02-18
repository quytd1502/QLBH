package Ass.Repository;

import Ass.Model.Bill;
import Ass.Model.Products;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
public class ProductsRepositoryImpl implements ProductsRepository {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Products> findAll() {
        String query = "SELECT p FROM Products p";
        TypedQuery<Products> productsTypedQuery = entityManager.createQuery(query,Products.class);
        return productsTypedQuery.getResultList();
        }

    @Override
    public Products findById(Long id) {
        return entityManager.find(Products.class,id);
    }


    @Override
    public void save(Products model) {
        if (model.getMaSP() != null) {
            //update
            entityManager.merge(model);
        }else {
            //add new
            entityManager.persist(model);
        }

    }

    @Override
    public void remove(Long id) {
        entityManager.remove(findById(id));
    }

    @Override
    public void update(Long id, Products model) {

    }


}
