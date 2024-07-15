package com.felipe.costa.acessoAuth.service;

import com.felipe.costa.acessoAuth.entity.Users;
import com.felipe.costa.acessoAuth.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersService {

    @Autowired
    private UsersRepository repository;
        public Users saveUsers(Users users){

            Users resp = repository.save(users);
                return resp;
        }

        public List<Users> users(){
            List<Users> resp = repository.findAll();
            return resp;
    }

}
