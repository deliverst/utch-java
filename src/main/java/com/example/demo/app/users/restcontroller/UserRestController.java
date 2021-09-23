package com.example.demo.app.users.restcontroller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserRestController {

    @GetMapping("/{id}")
    public Integer findById(@PathVariable("id")Integer id){
        return id;
    }


    @PostMapping
    public String create(@RequestBody String usuario){
        return usuario;
    }
}


/* http://localhost:8080/users/

{
    "usuario":"hola"
}

 */