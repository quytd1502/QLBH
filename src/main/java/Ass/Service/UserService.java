package Ass.Service;

import Ass.Model.Users;

import java.util.List;

public interface UserService {
    List<Users> findAll();
    Users finById(Long id);
    void save(Users users);
    void remove(Long id);


}
