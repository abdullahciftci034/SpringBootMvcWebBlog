package com.abdullah.webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.abdullah.webapp.managers.PersonManager;
import com.abdullah.webapp.models.Person;

@RestController
@RequestMapping("/persons")
public class PersonController {
    private final PersonManager personManager;

    @Autowired
    public PersonController(PersonManager personManager) {
        this.personManager = personManager;
    }

    @PostMapping("/save")
    public ResponseEntity<Person> createPerson(@RequestBody() Person person) {
        System.out.println(person.toString());
        Person savedPerson = personManager.save(person);
        return ResponseEntity.ok(savedPerson);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Person> getPersonById(@PathVariable int id) {
        Person person = personManager.getById(id);
        if (person != null) {
            return ResponseEntity.ok(person);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}