package com.example.springlec5.Repository;

import com.example.springlec5.Entities.MyUser;
import org.springframework.data.repository.CrudRepository;


public interface UserRepository extends CrudRepository<MyUser,Long> {

    public MyUser findByUsername(String username);
}
