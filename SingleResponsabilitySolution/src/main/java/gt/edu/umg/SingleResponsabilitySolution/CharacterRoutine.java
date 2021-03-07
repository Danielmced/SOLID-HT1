package gt.edu.umg.SingleResponsabilitySolution;

public class CharacterRoutine {

    /**
     * @param character 
     * @return
     */
    public String generateRoutine(Character character) {
        String texto = new String();
        texto += "NPC: "+character.getName()+
                "<br> Strenght: "+character.getStrenght()+
                "<br> Vitality: "+character.getVitality()+
                "<br> Attack_speed: "+character.getAttack_speed();
        
        texto += "<br>**"+character.getName()+character.jump()+"**<br>";
        texto += "<br>**"+character.getName()+character.run()+"**<br>";
        texto += "<br>**"+character.getName()+character.move_backward()+"**<br>";
        texto += "<br>**"+character.getName()+character.move_forward()+"**<br>";
        return texto;
    }

}