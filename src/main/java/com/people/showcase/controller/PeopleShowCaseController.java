package com.people.showcase.controller;

import com.people.showcase.bean.People;
import com.people.showcase.service.PeopleShowCaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/app")
public class PeopleShowCaseController {

    @Autowired
    PeopleShowCaseService peopleShowCaseService;

    @PostMapping("/")
    public ResponseEntity savePeople(@RequestBody People people) {
        peopleShowCaseService.savePeople(people);
        return new ResponseEntity("Thank You %s" + people.getName(), HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity getAllPeople() {
        List<People> response = peopleShowCaseService.getAllPeople();
        return new ResponseEntity(response, HttpStatus.OK);
    }
}
