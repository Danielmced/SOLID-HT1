package gt.edu.umg.open_closed_solution;



/**
 * 
 */
public class Antagonist implements ICharacterTypeSelection {
  
    /**
     * @return
     */
    @Override
    public String characterSelection() {
        String text = "";
        text += " Hi antagonist. Your role is destroy the world!!!!!";
        return text;
    }

}