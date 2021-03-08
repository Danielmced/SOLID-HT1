package gt.edu.umg.interface_segregation_problem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

@RestController
public class InterfaceSegregationProblemApplication {

    /**
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(InterfaceSegregationProblemApplication.class, args);
    }

    /**
     * @param npc 
     * @return
     */
    @GetMapping("/")
    public String index(@RequestParam(defaultValue = "Dragon") String npc) {
        String text = "";
        if("dragon".equalsIgnoreCase(npc)){
            DragonNPC dragon = new DragonNPC();
            text += "<br>Dragon " + dragon.Fly();
            text += "<br>Dragon " + dragon.Swim();
            text += "<br>Dragon " + dragon.Walk();
        }
        if("human".equalsIgnoreCase(npc)){
            HumanNPC human = new HumanNPC();
            text += "<br>Human " + human.Fly();
            text += "<br>Human " + human.Swim();
            text += "<br>Human " + human.Walk();
        }        
        return text;
    }

}