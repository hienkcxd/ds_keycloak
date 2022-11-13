package com.ds.ds_backend.controller;

import com.ds.ds_backend.model.UserDs;
import com.ds.ds_backend.repository.UserDsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserDsController {
    @Autowired
    UserDsRepository userDsRepository;

    @PostMapping("/admin/user")
    public ResponseEntity<UserDs> addUser(@RequestBody UserDs userDs){
        return ResponseEntity.ok(userDsRepository.save(userDs));
    }

    @GetMapping("/user/list")
    public ResponseEntity<List<UserDs>> findAll(){
        return ResponseEntity.ok(userDsRepository.findAll());
    }
}
