package gt.edu.umg.open_closed_solution;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 */
@SpringBootApplication

@RestController
public class OpenClosedSolutionApplication {


    /**
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(OpenClosedSolutionApplication.class, args);
    }

    /**
     * @param characterType 
     * @return
     */
    @GetMapping("/")
    public String index(@RequestParam(defaultValue = "Protagonist") String characterType) {
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