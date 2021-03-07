package gt.edu.umg.single_responsability_problem;

/**
 * 
 */
public class Character {

    /**
     * 
     */
    private String name;

    /**
     * 
     */
    private int strenght;

    /**
     * 
     */
    private int vitality;

    /**
     * 
     */
    private int attack_speed;

    /**
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * @return
     */
    public int getStrenght() {
        return strenght;
    }

    /**
     * @return
     */
    public int getVitality() {
        return vitality;
    }

    /**
     * @return
     */
    public int getAttack_speed() {
        return attack_speed;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param strenght
     */
    public void setStrenght(int strenght) {
        this.strenght = strenght;
    }

    /**
     * @param vitality
     */
    public void setVitality(int vitality) {
        this.vitality = vitality;
    }

    /**
     * @param attack_speed
     */
    public void setAttack_speed(int attack_speed) {
        this.attack_speed = attack_speed;
    }

    /**
     * 
     * @return 
     */
    public String jump() {
        return " is jumping";
    }

    /**
     * 
     * @return 
     */
    public String move_forward() {
        return " is moving forward";
    }

    /**
     * 
     * @return 
     */
    public String move_backward() {
        return " is moving backward";
    }

    /**
     * 
     * @return 
     */
    public String run() {
        return " is running";
    }
    
    /**
     * 
     * @return 
     */
    public String generateRoutine(Character npc){
        String texto="";
        texto += "NPC: "+npc.getName()+"<br> Strenght: "+npc.getStrenght()+"<br> Vitality: "+npc.getVitality()+
                "<br> Attack_speed: "+npc.getAttack_speed();
        
        texto += "<br>**"+npc.getName()+npc.jump()+"**<br>";
        texto += "<br>**"+npc.getName()+npc.run()+"**<br>";
        texto += "<br>**"+npc.getName()+npc.move_backward()+"**<br>";
        texto += "<br>**"+npc.getName()+npc.move_forward()+"**<br>";
        return texto;
    }

}