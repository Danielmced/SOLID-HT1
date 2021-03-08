package gt.edu.umg.dependency_inversion_solution;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

@RestController
public class DependencyInversionSolutionApplication {

    /**
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(DependencyInversionSolutionApplication.class, args);
    }

    /**
     * @return
     */
    @GetMapping("/")
    public String index() {
        PremiumPlayer premium = new PremiumPlayer();
        premium.PremiumPlayer("Daniel");
        RegularPlayer regular = new RegularPlayer();
        regular.RegularPlayer("Estuardo");
        
        String text = "";
        text += "<h1>Premium: </h1>" + premium.getNickName();
        text += premium.getRegularAwards();
        text += premium.getPremiumAwards();
        
        text += "<br><h3>Regular</h3>" + regular.getNickName();
        text += regular.getRegularAwards();
        return text;
    }

}