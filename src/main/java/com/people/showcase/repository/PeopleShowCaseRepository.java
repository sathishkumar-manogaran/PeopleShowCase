package com.people.showcase.repository;

import com.people.showcase.entity.PeopleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeopleShowCaseRepository extends JpaRepository<PeopleEntity, Integer> {
}
