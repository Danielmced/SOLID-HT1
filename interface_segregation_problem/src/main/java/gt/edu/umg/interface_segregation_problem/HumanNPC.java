package gt.edu.umg.interface_segregation_problem;

public class HumanNPC implements IAction {

    /**
     * @return
     */
    @Override
    public String Fly() {
        //throw new UnsupportedOperationException(" can't fly.");
        return " can't fly.";//borrar esta linea en caso de utilizar throw
    }

    /**
     * @return
     */
    @Override
    public String Walk() {
        return " is walking";
    }

    /**
     * @return
     */
    @Override
    public String Swim() {
        return " is swimming";
    }

}