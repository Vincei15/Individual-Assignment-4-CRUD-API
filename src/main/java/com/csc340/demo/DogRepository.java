package com.csc340.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
interface DogRepository extends JpaRepository<Dog, Integer> {
    List<Dog> findByBreed(String breed);

    @Query("SELECT d FROM Dog d WHERE LOWER(d.name) LIKE LOWER(CONCAT('%', :name, '%'))")
    List<Dog> findByNameContaining(String name);
}
