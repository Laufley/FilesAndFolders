package com.codeclan.example.FilesAndFoldersService.Components;

import com.codeclan.example.FilesAndFoldersService.Models.File;
import com.codeclan.example.FilesAndFoldersService.Models.Folder;
import com.codeclan.example.FilesAndFoldersService.Models.Person;
import com.codeclan.example.FilesAndFoldersService.Repositories.FileRepository;
import com.codeclan.example.FilesAndFoldersService.Repositories.FolderRepository;
import com.codeclan.example.FilesAndFoldersService.Repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("!test")
@Component

public class DataLoader implements ApplicationRunner {

    @Autowired
    PersonRepository personRepository;

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    public DataLoader(){
    }

    public void run(ApplicationArguments args) {

        Person renata = new Person("Renata");
        personRepository.save(renata);
        Person peter = new Person("Peter");
        personRepository.save(peter);
        Person maria = new Person("Maria");
        personRepository.save(maria);
        Person indira = new Person("Indira");
        personRepository.save(indira);
        Person andrea = new Person("Andrea");
        personRepository.save(andrea);
        Person rebeka = new Person("Rebeka");
        personRepository.save(rebeka);
        Person minka = new Person("Minka");
        personRepository.save(minka);

        Folder stockholmTrip = new Folder("Stockholm trip", peter);
        folderRepository.save(stockholmTrip);
        Folder teamManagement =  new Folder("team management", renata);
        folderRepository.save(teamManagement);
        Folder malmoStrategy = new Folder("Malmo strategy", maria);
        folderRepository.save(malmoStrategy);
        Folder vilniusStrategy = new Folder("Vilnius stratey", indira);
        folderRepository.save(vilniusStrategy);
        Folder newRoles = new Folder("new roles", andrea);
        folderRepository.save(newRoles);
        Folder recruiterNotes = new Folder("recruiter notes", rebeka);
        folderRepository.save(recruiterNotes);
        Folder sourcingStrategies = new Folder("sourcing strategies", minka);
        folderRepository.save(sourcingStrategies);

        File picture1 = new File("Smart Hire IT in colourful building", "jpg", 3, stockholmTrip);
        fileRepository.save(picture1);
        File picture2 = new File("e-scooter time", "jpg", 3, stockholmTrip);
        fileRepository.save(picture2);
        File picture3 = new File("birthday surprise", "jpg", 3, stockholmTrip);
        fileRepository.save(picture3);
        File training1 = new File("how to source well", "ppt", 6, teamManagement);
        fileRepository.save(training1);
        File training2 = new File("good developers do...", "ppt", 6, teamManagement);
        fileRepository.save(training2);
        File contact1 = new File("HR manager Greta", "txt", 2, malmoStrategy);
        fileRepository.save(contact1);
        File contact2 = new File("internal recruiter Matt", "txt", 2, malmoStrategy);
        fileRepository.save(contact2);
        File prospect1 = new File("Senior software developer A.", "txt", 2, vilniusStrategy);
        fileRepository.save(prospect1);
        File prospect2 = new File("Software architect J.", "txt", 2, vilniusStrategy);
        fileRepository.save(prospect2);
        File role1 = new File("C++ developer", "txt", 2, newRoles);
        fileRepository.save(role1);
        File role2 = new File("QA engineer", "txt", 2, newRoles);
        fileRepository.save(role2);
        File notes1 = new File("interview template", "txt", 2, recruiterNotes);
        fileRepository.save(notes1);
        File notes2 = new File("linkedin templates", "txt", 2, recruiterNotes);
        fileRepository.save(notes2);
        File learning1 = new File("how to use Boolean searches", "txt", 2, sourcingStrategies);
        fileRepository.save(learning1);
        File learning2 = new File("how to personalise your message", "txt", 2, sourcingStrategies);
        fileRepository.save(learning2);
    }
}
