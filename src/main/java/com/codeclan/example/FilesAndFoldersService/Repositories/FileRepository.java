package com.codeclan.example.FilesAndFoldersService.Repositories;

import com.codeclan.example.FilesAndFoldersService.Models.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File, Long> {
}
