package gt.edu.umg.interface_segregation_solution;

public class DragonNPC implements IFlyAction, IWalkAction {

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