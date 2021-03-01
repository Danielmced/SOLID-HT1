package gt.edu.umg.OpenClosedSolution;

import java.util.*;

/**
 * 
 */
public class Antagonist implements ICharacterTypeSelection {

    /**
     * Default constructor
     */
    public Antagonist() {
    }

    /**
     * @param characterType 
     * @return
     */
    @Override
    public String eventAction(String characterType) {
        // TODO implement here
        String text = new String();
        
        if("antagonist".equals(characterType.toLowerCase())){
            text += "Hi antagonist. Your role is destroy the world!!!!!";
        }
        return text;
    }

}