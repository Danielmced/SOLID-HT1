package gt.edu.umg.liskov_substitution_solution;

public class DragonNPC implements IFly, IWalk {


    /**
     * @return
     */
    @Override
    public String fly() {
        return " is flying";
    }

    /**
     * @return
     */
    @Override
    public String walk() {
        return " is walking";
    }

}