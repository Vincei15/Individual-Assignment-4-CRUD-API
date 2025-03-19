package com.csc340.demo;

import jakarta.persistence.*;

@Entity
public class Dog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int dogId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String description;

    private String breed;
    private double age;

    public int getDogId() { return dogId; }
    public void setDogId(int dogId) { this.dogId = dogId; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public String getBreed() { return breed; }
    public void setBreed(String breed) { this.breed = breed; }
    public double getAge() { return age; }
    public void setAge(double age) { this.age = age; }
}
