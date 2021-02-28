package gt.edu.umg.SingleResponsabilitySolution;

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
public class SingleResponsabilitySolutionApplication {

    /**
     * Default constructor
     */
    public SingleResponsabilitySolutionApplication() {
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO implement here
        SpringApplication.run(SingleResponsabilitySolutionApplication.class, args);
    }

    /**
     * @param name 
     * @param strenght 
     * @param vitality 
     * @param attack_speed 
     * @return
     */
    @RequestMapping("/")
    public String index(@RequestParam(defaultValue = "Mike") String name,
            @RequestParam(defaultValue = "1") int strenght, 
            @RequestParam(defaultValue = "10") int vitality, 
            @RequestParam(defaultValue = "1") int attack_speed) {
        // TODO implement here
        String texto = new String();
        Character npc = new Character(name, strenght, vitality, attack_speed); 
        CharacterService genereteroutine = new CharacterService();
        
        texto += genereteroutine.routine(npc);
        
        
        return texto;
    }

}