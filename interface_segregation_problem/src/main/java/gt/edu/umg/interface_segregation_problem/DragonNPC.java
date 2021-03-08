package gt.edu.umg.interface_segregation_problem;

public class DragonNPC implements IAction {

    /**
     * @return
     */
    @Override
    public String Fly() {
        return " is flying.";
    }

    /**
     * @return
     */
    @Override
    public String Walk() {
        return " is walking.";
    }

    /**
     * @return
     */
    @Override
    public String Swim() {
        //throw new UnsupportedOperationException(" can't swim.");
        return " can't swim.";//borrar esta linea en caso de utilizar throw
    }

}