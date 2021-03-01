package gt.edu.umg.LiskovSubstitutionProblem;

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
public class LiskovSubstitutionProblemApplication {

    /**
     * Default constructor
     */
    public LiskovSubstitutionProblemApplication() {
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO implement here
        SpringApplication.run(LiskovSubstitutionProblemApplication.class, args);
    }

    /**
     * @param npc 
     * @return
     */
    @RequestMapping("/")
    public String index(@RequestParam(defaultValue = "Dragon") String npc) throws Exception {
        // TODO implement here
        String text = new String();
        if("dragon".equals(npc.toLowerCase())){
            DragonNPC dragon = new DragonNPC();
            text += "<br>Dragon " + dragon.Fly();
            text += "<br>Dragon " + dragon.Swin();
            text += "<br>Dragon " + dragon.Walk();
        }
        if("human".equals(npc.toLowerCase())){
            HumanNPC human = new HumanNPC();
            text += "<br>Human " + human.Fly();
            text += "<br>Human " + human.Swin();
            text += "<br>Human " + human.Walk();
        }
        
        return text;
    }

}