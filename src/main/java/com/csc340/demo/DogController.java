package com.csc340.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/dogs")
public class DogController {

    @Autowired
    private DogService dogService;

    // List of all dogs
    @GetMapping
    public String getAllDogs(Model model) {
        List<Dog> dogs = dogService.getAllDogs();
        model.addAttribute("dogs", dogs);
        return "animal-list";
    }

    // Details of a single dog by id
    @GetMapping("/{id}")
    public String getDogById(@PathVariable int id, Model model) {
        Dog dog = dogService.getDogById(id);
        model.addAttribute("dog", dog);
        return "animal-details";
    }

    // Create a new dog
    @GetMapping("/create")
    public String showCreateDogForm(Model model) {
        model.addAttribute("dog", new Dog());
        return "animal-create";
    }

    @PostMapping("/new")
    public String createDog(@ModelAttribute Dog dog) {
        dogService.addDog(dog);
        return "redirect:/dogs";
    }

    // Update a dog
    @GetMapping("/update/{id}")
    public String showUpdateDogForm(@PathVariable int id, Model model) {
        Dog dog = dogService.getDogById(id);
        model.addAttribute("dog", dog);
        return "animal-update";
    }

    @PostMapping("/update/{id}")
    public String updateDog(@PathVariable int id, @ModelAttribute Dog dog) {
        dog.setDogId(id);
        dogService.updateDog(dog);
        return "redirect:/dogs";
    }

    // Delete a dog
    @GetMapping("/delete/{id}")
    public String deleteDog(@PathVariable int id) {
        dogService.deleteDog(id);
        return "redirect:/dogs";
    }
}
