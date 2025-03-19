package com.csc340.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
class DogService {
    @Autowired
    private DogRepository dogRepository;

    public List<Dog> getAllDogs() { return dogRepository.findAll(); }
    public Dog getDogById(int id) { return dogRepository.findById(id).orElse(null); }
    public Dog addDog(Dog dog) { return dogRepository.save(dog); }
    public Dog updateDog(Dog dog) { return dogRepository.save(dog); }
    public void deleteDog(int id) { dogRepository.deleteById(id); }
    public List<Dog> getDogsByBreed(String breed) { return dogRepository.findByBreed(breed); }
    public List<Dog> searchDogsByName(String name) { return dogRepository.findByNameContaining(name); }
}