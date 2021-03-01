package gt.edu.umg.OpenClosedProblem;

import java.util.*;

/**
 * 
 */
public class CharacterTypeSelection {

    /**
     * Default constructor
     */
    public CharacterTypeSelection() {
    }

    /**
     * @param characterType 
     * @return
     */
    /*de ser necesario un nuevo tipo de personaje se debe modificar este archivo e incluirlo al switch case*/
    public String eventAction(String characterType) {
        // TODO implement here
        String text = new String();
        switch(characterType.toLowerCase()){
            case "protagonist":{
                text += "Hi protagonist. Your role is save the world!!!!!!";
                break;
            }
            case "antagonist":{
                text += "Hi antagonist. Your role is destroy the world!!!!!";
                break;
            }
            default:{
                text += "Sorry, i don't know what is "+ characterType;
                break;
            }
        }
        return text;
    }

}