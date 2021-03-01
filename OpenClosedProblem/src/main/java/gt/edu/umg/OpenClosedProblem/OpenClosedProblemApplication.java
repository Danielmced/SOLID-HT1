package gt.edu.umg.OpenClosedProblem;

import java.util.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 */

@SpringBootApplication

@RestController
public class OpenClosedProblemApplication {

    /**
     * Default constructor
     */
    public OpenClosedProblemApplication() {
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO implement here
        SpringApplication.run(OpenClosedProblemApplication.class, args);
    }

    /**
     * @param characterType 
     * @return
     */
    @RequestMapping("/")
    public String index(@RequestParam(defaultValue = "Protagonist") String characterType) {
        // TODO implement here
        CharacterTypeSelection event = new CharacterTypeSelection();
        
        return event.eventAction(characterType);
    }

}