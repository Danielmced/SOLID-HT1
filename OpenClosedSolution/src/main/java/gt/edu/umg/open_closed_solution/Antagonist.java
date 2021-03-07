package gt.edu.umg.open_closed_solution;



/**
 * 
 */
public class Antagonist implements ICharacterTypeSelection {
  

    /**
     * @param characterType 
     * @return
     */
    @Override
    public String eventAction(String characterType) {
        String text = "";
        
        if("antagonist".equals(characterType.toLowerCase())){
            text += "Hi antagonist. Your role is destroy the world!!!!!";
        }
        return text;
    }

}