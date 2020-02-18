package Ass.Service;

import Ass.Model.Bill;

import java.util.List;

public interface BillService {
    List<Bill> findAll();
    Bill finById(Long id);
    void save(Bill bill);
    void remove(Long id);
}
