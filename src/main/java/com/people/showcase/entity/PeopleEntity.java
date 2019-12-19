package com.people.showcase.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PeopleEntity {

    @Id
    private Integer id;
    private String name;
    private String from;
    private String interests;
}
