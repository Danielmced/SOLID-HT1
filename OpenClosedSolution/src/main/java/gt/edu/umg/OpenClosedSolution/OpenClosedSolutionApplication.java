package gt.edu.umg.OpenClosedSolution;

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
public class OpenClosedSolutionApplication {

    /**
     * Default constructor
     */
    public OpenClosedSolutionApplication() {
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO implement here
        SpringApplication.run(OpenClosedSolutionApplication.class, args);
    }

    /**
     * @param characterType 
     * @return
     */
    @RequestMapping("/")
    public String index(@RequestParam(defaultValue = "Protagonist") String characterType) {
        // TODO implement here
        String text = new String();
        ICharacterTypeSelection select = new Protagonist();
        text += select.eventAction(characterType);
        select = new Antagonist();
        text += select.eventAction(characterType);
        /*intente recorrer las clases como en js pero no supe como, asi que realmente no 
        llegue a ninguna solución el problema sigue estando presente, pero en otra clase xD*/
        return text;
    }

}