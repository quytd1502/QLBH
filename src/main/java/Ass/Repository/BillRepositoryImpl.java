package Ass.Repository;

import Ass.Model.Bill;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
public class BillRepositoryImpl implements BillRepository {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Bill> findAll() {
        String query = "SELECT p FROM Bill p";
        TypedQuery<Bill> billTypedQuery =  entityManager.createQuery(query,Bill.class);
        return billTypedQuery.getResultList();
    }

    @Override
    public Bill findById(Long id) {
        return entityManager.find(Bill.class,id);
    }


    @Override
    public void save(Bill model) {

    }

    @Override
    public void remove(Long id) {

    }

    @Override
    public void update(Long id, Bill model) {

    }


}
