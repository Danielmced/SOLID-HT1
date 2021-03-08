package gt.edu.umg.liskov_substitution_problem;

public class HumanNPC extends Action {
    
    /**
     *
     * @return
     */
    @Override
    public String Fly() throws Exception {
        //throw new UnsupportedOperationException(" .I can't fly.");
        return " can't fly.";//borrar esta linea en caso de utilizar throw
    }

    //por razones de mejor comprension retorne el texto y no utilice la excepcion.
    
}