package gt.edu.umg.SingleResponsabilitySolution;

public class Character implements CharacterAction {

    private String name;

    private int strenght;
    
    private int vitality;
    
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
     * @param name
     * @param strenght
     * @param vitality
     * @param attack_speed
     */
    
    public Character(String name, int strenght, int vitality, int attack_speed) {
        this.name = name;
        this.strenght = strenght;
        this.vitality = vitality;
        this.attack_speed = attack_speed;
    }  
    
    /**
     * @return
     */
    @Override
    public String jump() {
        return " is jumping";
    }

    /**
     * @return
     */
    @Override
    public String move_forward() {
        return " is moving forward";
    }

    /**
     * @return
     */
    @Override
    public String move_backward() {
        return " is moving backward";
    }

    /**
     * @return
     */
    @Override
    public String run() {
        return " is running";
    }

}