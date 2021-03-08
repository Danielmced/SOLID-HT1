package gt.edu.umg.liskov_substitution_solution;

public class HumanNPC implements IWalk, ISwim {

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