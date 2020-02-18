package Ass.Service;

import Ass.Model.Bill;
import Ass.Repository.BillRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BillServiceImpl implements BillService {
    @Autowired
    private BillRepository billRepository;


    @Override
    public List<Bill> findAll() {
        return billRepository.findAll();
    }

    @Override
    public Bill finById(Long id) {
        return billRepository.findById(id);
    }

    @Override
    public void save(Bill bill) {

    }

    @Override
    public void remove(Long id) {

    }


}
