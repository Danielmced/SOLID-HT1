package gt.edu.umg.liskov_substitution_problem;

public class DragonNPC extends Action {

    
    /**
     * @return
     * @throws java.lang.Exception
     */
    @Override
    public String Swim() throws Exception {
        //throw new UnsupportedOperationException(" .I can't swim.");
        return " can't swim.";//borrar esta linea en caso de utilizar throw
    }

    //por razones de simplificación retorne el texto y no utilice la excepcion.

}