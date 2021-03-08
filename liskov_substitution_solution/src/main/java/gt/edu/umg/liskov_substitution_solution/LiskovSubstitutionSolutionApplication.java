package gt.edu.umg.liskov_substitution_solution;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

@RestController
public class LiskovSubstitutionSolutionApplication {


    /**
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(LiskovSubstitutionSolutionApplication.class, args);
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
            text += "<br>Dragon " + dragon.fly();
            text += "<br>Dragon " + dragon.walk();
        }
        if("human".equalsIgnoreCase(npc)){
            HumanNPC human = new HumanNPC();
            text += "<br>Human " + human.swim();
            text += "<br>Human " + human.walk();
        }     
        return text;
    }

}