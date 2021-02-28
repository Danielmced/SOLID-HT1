package gt.edu.umg.SingleResponsabilitySolution;

import java.util.*;

/**
 * 
 */
public class Character implements CharacterAction {

    /**
     * Default constructor
     */
    public Character() {
    }

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
        // TODO implement here
        return name;
    }

    /**
     * @return
     */
    public int getStrenght() {
        // TODO implement here
        return strenght;
    }

    /**
     * @return
     */
    public int getVitality() {
        // TODO implement here
        return vitality;
    }

    /**
     * @return
     */
    public int getAttack_speed() {
        // TODO implement here
        return attack_speed;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        // TODO implement here
        this.name = name;
    }

    /**
     * @param strenght
     */
    public void setStrenght(int strenght) {
        // TODO implement here
        this.strenght = strenght;
    }

    /**
     * @param vitality
     */
    public void setVitality(int vitality) {
        // TODO implement here
        this.vitality = vitality;
    }

    /**
     * @param attack_speed
     */
    public void setAttack_speed(int attack_speed) {
        // TODO implement here
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
        // TODO implement here
        return " is jumping";
    }

    /**
     * @return
     */
    @Override
    public String move_forward() {
        // TODO implement here
        return " is moving forward";
    }

    /**
     * @return
     */
    @Override
    public String move_backward() {
        // TODO implement here
        return " is moving backward";
    }

    /**
     * @return
     */
    @Override
    public String run() {
        // TODO implement here
        return " is running";
    }

}