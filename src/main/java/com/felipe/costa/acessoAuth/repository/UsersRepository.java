package com.felipe.costa.acessoAuth.repository;

import com.felipe.costa.acessoAuth.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long> {

            //Define criterios de buscas dinamicos
            public Users findByEmailAndPassword(String email, String password);
            public List<Users> findByName(String name);

}
