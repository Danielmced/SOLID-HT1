package gt.edu.umg.open_closed_solution;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
     * @param characterName
     * @return
     */
    @GetMapping("/")
    public String index(@RequestParam(defaultValue = "Protagonist") String characterName) {
        String text = new String();
        text += characterName + new Protagonist().characterSelection();
        text += "<br>";
        text += "Voldemort" + new Antagonist().characterSelection();
        return text;
    }

}