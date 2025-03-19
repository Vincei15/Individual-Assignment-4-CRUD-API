package com.csc340.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/dogs")
class DogController {
    @Autowired
    private DogService dogService;

    @GetMapping
    public List<Dog> getAllDogs() { return dogService.getAllDogs(); }

    @GetMapping("/{id}")
    public Dog getDogById(@PathVariable int id) { return dogService.getDogById(id); }

    @PostMapping
    public Dog addDog(@RequestBody Dog dog) { return dogService.addDog(dog); }

    @PutMapping("/{id}")
    public Dog updateDog(@PathVariable int id, @RequestBody Dog dog) {
        dog.setDogId(id);
        return dogService.updateDog(dog);
    }

    @DeleteMapping("/{id}")
    public void deleteDog(@PathVariable int id) { dogService.deleteDog(id); }

    @GetMapping("/breed/{breed}")
    public List<Dog> getDogsByBreed(@PathVariable String breed) { return dogService.getDogsByBreed(breed); }

    @GetMapping("/search")
    public List<Dog> searchDogsByName(@RequestParam String name) { return dogService.searchDogsByName(name); }
}
