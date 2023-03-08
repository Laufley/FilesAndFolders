package com.codeclan.example.FilesAndFoldersService.Repositories;

import com.codeclan.example.FilesAndFoldersService.Models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepository extends JpaRepository<Folder, Long> {
}
