package Components;

import Models.File;
import Models.Folder;
import Models.Person;
import Repositories.FileRepository;
import Repositories.FolderRepository;
import Repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.nio.file.Files;
import java.util.List;

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
        Person peter = new Person("Peter");
        Person maria = new Person("Maria");
        Person indira = new Person("Indira");
        Person andrea = new Person("Andrea");
        Person rebeka = new Person("Rebeka");
        Person minka = new Person("Minka");

        Folder stockholmTrip = new Folder("Stockholm trip", peter);
        Folder teamManagement =  new Folder("team management", renata);
        Folder malmoStrategy = new Folder("Malmo strategy", maria);
        Folder vilniusStrategy = new Folder("Vilnius stratey", indira);
        Folder newRoles = new Folder("new roles", andrea);
        Folder recruiterNotes = new Folder("recruiter notes", rebeka);
        Folder sourcingStrategies = new Folder("sourcing strategies", minka);

        File picture1 = new File("Smart Hire IT in colourful building", "jpg", 3, stockholmTrip);
        File picture2 = new File("e-scooter time", "jpg", 3, stockholmTrip);
        File picture3 = new File("birthday surprise", "jpg", 3, stockholmTrip);
        File training1 = new File("how to source well", "ppt", 6, teamManagement);
        File training2 = new File("good developers do...", "ppt", 6, teamManagement);
        File contact1 = new File("HR manager Greta", "txt", 2, malmoStrategy);
        File contact2 = new File("internal recruiter Matt", "txt", 2, malmoStrategy);
        File prospect1 = new File("Senior software developer A.", "txt", 2, vilniusStrategy);
        File prospect2 = new File("Software architect J.", "txt", 2, vilniusStrategy);
        File role1 = new File("C++ developer", "txt", 2, newRoles);
        File role2 = new File("QA engineer", "txt", 2, newRoles);
        File notes1 = new File("interview template", "txt", 2, recruiterNotes);
        File notes2 = new File("linkedin templates", "txt", 2, recruiterNotes);
        File learning1 = new File("how to use Boolean searches", "txt", 2, sourcingStrategies);
        File learning2 = new File("how to personalise your message", "txt", 2, sourcingStrategies);
    }
}
