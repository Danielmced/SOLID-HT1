package gt.edu.umg.single_responsability_problem;

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
public class SingleResponsabilityProblemApplication {
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(SingleResponsabilityProblemApplication.class, args);
        
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
            @RequestParam(defaultValue = "1") int attack_speed){
        Character npc = new Character();        
        
        npc.setName(name);
        npc.setStrenght(strenght);
        npc.setVitality(vitality);
        npc.setAttack_speed(attack_speed);
        
        return npc.generateRoutine(npc);
    }

}
