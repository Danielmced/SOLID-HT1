package gt.edu.umg.open_closed_solution;


/**
 * 
 */
public class Protagonist implements ICharacterTypeSelection {

    /**
     * @return
     */
    @Override
    public String characterSelection() {
        String text = "";
        text += " Hi protagonist. Your role is save the world!!!!!!";
        return text;
    }

}