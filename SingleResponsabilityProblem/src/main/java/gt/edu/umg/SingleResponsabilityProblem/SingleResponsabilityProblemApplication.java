package gt.edu.umg.SingleResponsabilityProblem;

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
public class SingleResponsabilityProblemApplication {
    
    /**
     * Default constructor
     */
    public SingleResponsabilityProblemApplication() {
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO implement here
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
        // TODO implement here
        String texto = new String();
        Character npc = new Character();        
        
        npc.setName(name);
        npc.setStrenght(strenght);
        npc.setVitality(vitality);
        npc.setAttack_speed(attack_speed);
        
        texto += "NPC: "+npc.getName()+"<br> Strenght: "+npc.getStrenght()+"<br> Vitality: "+npc.getVitality()+
                "<br> Attack_speed: "+npc.getAttack_speed();
        
        texto += "<br>**"+npc.getName()+npc.jump()+"**<br>";
        texto += "<br>**"+npc.getName()+npc.run()+"**<br>";
        texto += "<br>**"+npc.getName()+npc.move_backward()+"**<br>";
        texto += "<br>**"+npc.getName()+npc.move_forward()+"**<br>";
        return texto;
    }

}