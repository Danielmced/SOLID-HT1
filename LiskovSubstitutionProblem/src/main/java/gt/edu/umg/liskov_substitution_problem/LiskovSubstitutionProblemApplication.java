package gt.edu.umg.liskov_substitution_problem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

@RestController
public class LiskovSubstitutionProblemApplication {

    /**
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(LiskovSubstitutionProblemApplication.class, args);
    }

    /**
     * @param npc 
     * @return
     * @throws java.lang.Exception
     */
    @RequestMapping("/")
    public String index(@RequestParam(defaultValue = "Dragon") String npc) throws Exception {
        String text = "";
        if("dragon".equalsIgnoreCase(npc)){
            DragonNPC dragon = new DragonNPC();
            text += "<br>Dragon " + dragon.Fly();
            text += "<br>Dragon " + dragon.Swim();
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