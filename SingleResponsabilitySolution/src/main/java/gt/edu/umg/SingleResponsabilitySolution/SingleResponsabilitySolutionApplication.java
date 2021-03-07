package gt.edu.umg.SingleResponsabilitySolution;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

@RestController
public class SingleResponsabilitySolutionApplication {
    /**
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(SingleResponsabilitySolutionApplication.class, args);
    }

    /**
     * @param name 
     * @param strenght 
     * @param vitality 
     * @param attack_speed 
     * @return
     */
    @GetMapping("/")
    public String index(@RequestParam(defaultValue = "Mike") String name,
            @RequestParam(defaultValue = "1") int strenght, 
            @RequestParam(defaultValue = "10") int vitality, 
            @RequestParam(defaultValue = "1") int attack_speed) {
            
        return new CharacterRoutine().generateRoutine(new Character(name, strenght, vitality, attack_speed));
    }

}