package com.example.TaskManagement.Model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Task {


    private Integer idtest;
    private String name;
    private String surname;


    public Task() {
    }

    public Task(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getIdtest() {
        return idtest;
    }

    public void setIdtest(Integer idtest) {
        this.idtest = idtest;
    }
}
