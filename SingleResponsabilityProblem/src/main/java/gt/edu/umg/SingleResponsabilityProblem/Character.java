package gt.edu.umg.SingleResponsabilityProblem;

import java.util.*;

/**
 * 
 */
public class Character {

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
     * 
     * @return 
     */
    public String jump() {
        return " is jumping";
        // TODO implement here
    }

    /**
     * 
     * @return 
     */
    public String move_forward() {
        return " is moving forward";
        // TODO implement here
    }

    /**
     * 
     * @return 
     */
    public String move_backward() {
        return " is moving backward";
        // TODO implement here
    }

    /**
     * 
     * @return 
     */
    public String run() {
        return " is running";
        // TODO implement here
    }

}