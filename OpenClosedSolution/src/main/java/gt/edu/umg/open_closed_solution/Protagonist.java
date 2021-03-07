package gt.edu.umg.open_closed_solution;


/**
 * 
 */
public class Protagonist implements ICharacterTypeSelection {

 
    /**
     * @param characterType 
     * @return
     */
    @Override
    public String eventAction(String characterType) {
        String text = "";
        
        if("protagonist".equals(characterType.toLowerCase())){
            text += "Hi protagonist. Your role is save the world!!!!!!";
        }
        return text;
    }

}