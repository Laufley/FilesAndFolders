package com.codeclan.example.FilesAndFoldersService.Repositories;

import com.codeclan.example.FilesAndFoldersService.Models.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long>{
}


