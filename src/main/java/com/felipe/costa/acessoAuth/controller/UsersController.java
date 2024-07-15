package com.felipe.costa.acessoAuth.controller;


import com.felipe.costa.acessoAuth.entity.Users;
import com.felipe.costa.acessoAuth.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users/")
@ResponseBody
public class UsersController {

    @Autowired
    private UsersService service;

    @PostMapping("/salvar")
    public ResponseEntity<?> salvar(@RequestBody Users users){
        try {
            Users resp = service.saveUsers(users);
            return ResponseEntity.ok(resp);
        }catch (Exception ex){

            return ResponseEntity.status(500).body(ex.getMessage());
        }

    }

    @GetMapping("/listar")
    public ResponseEntity<?> listar(){
        return ResponseEntity.status(200).body(service.users());
    }

}


