package gt.edu.umg.interface_segregation_solution;

public class HumanNPC implements IWalkAction, ISwimAction {

    /**
     * @return
     */
    @Override
    public String walk() {
        return " is walking";
    }

    /**
     * @return
     */
    @Override
    public String swim() {
        return " is swimming";
    }

}