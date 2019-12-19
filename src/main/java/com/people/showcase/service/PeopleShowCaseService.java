package com.people.showcase.service;

import com.people.showcase.bean.People;
import com.people.showcase.common.Mapper;
import com.people.showcase.entity.PeopleEntity;
import com.people.showcase.repository.PeopleShowCaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PeopleShowCaseService {

    @Autowired
    PeopleShowCaseRepository peopleShowCaseRepository;
    private Mapper mapper;

    public People savePeople(People people) {
        return Optional.ofNullable(peopleShowCaseRepository.save(
                (PeopleEntity) mapper.mapToEntity(people, PeopleEntity.class)))
                .map(person -> (People) mapper.mapToBean(person, People.class))
                .orElseThrow(() -> new RuntimeException("Exception occurred while adding award"));
    }

    private PeopleEntity convertEntity(People people) {
        PeopleEntity peopleEntity = new PeopleEntity();
        peopleEntity.setName(people.getName());
        peopleEntity.setFrom(people.getFrom());
        peopleEntity.setInterests(people.getInterests());

        //TODO
        //FIXME
        //REVIEW

        return peopleEntity;
    }

    public List<People> getAllPeople() {
        return null;
    }
}
