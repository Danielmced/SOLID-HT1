package gt.edu.umg.OpenClosedProblem;

public class CharacterTypeSelection {

    /**
     * @param characterType 
     * @return
     */
    /*de ser necesario un nuevo tipo de personaje se debe modificar este archivo e incluirlo al switch case*/
    public String characterSelection(String characterType) {
        String text = new String();
        switch(characterType){
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