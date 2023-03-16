package com.wildcodeschool.wildandwizard.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.CascadeType;

import java.util.*;;

@Entity
public class School {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Long capacity;
    private String country;

    @OneToMany(mappedBy = "school", cascade = CascadeType.ALL)
    private List<Wizard> wizards;

    public School() {
    }

    public School(String name, Long capacity , String country) {
        this.name = name;
        this.capacity = capacity;
        this.country = country;
    }

    public List<Wizard> getWizards(){
        return this.wizards;
    }
    public void setWizards(List<Wizard> wizards){
        this.wizards = wizards;
    } 

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getCapacity() {
        return capacity;
    }

    public void setCapacity(Long capacity) {
        this.capacity = capacity;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}