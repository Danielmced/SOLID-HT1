package gt.edu.umg.OpenClosedSolution;

import java.util.*;

/**
 * 
 */
public class Protagonist implements ICharacterTypeSelection {

    /**
     * Default constructor
     */
    public Protagonist() {
    }

    /**
     * @param characterType 
     * @return
     */
    @Override
    public String eventAction(String characterType) {
        // TODO implement here
        String text = new String();
        
        if("protagonist".equals(characterType.toLowerCase())){
            text += "Hi protagonist. Your role is save the world!!!!!!";
        }
        return text;
    }

}