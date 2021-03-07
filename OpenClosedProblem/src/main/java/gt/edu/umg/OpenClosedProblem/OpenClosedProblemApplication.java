package gt.edu.umg.OpenClosedProblem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

@RestController
public class OpenClosedProblemApplication {

    /**
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(OpenClosedProblemApplication.class, args);
    }

    /**
     * @param characterName
     * @return
     */
    @GetMapping("/")
    public String index(@RequestParam(defaultValue = "Daniel") String characterName) {
        CharacterTypeSelection role = new CharacterTypeSelection();       
        String text = "";   
        text += characterName + role.characterSelection("protagonist");
        text += "<br>";
        text += "Voldemort " + role.characterSelection("antagonist");
        return text;
    }

}