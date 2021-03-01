package gt.edu.umg.LiskovSubstitutionProblem;

import java.util.*;

/**
 * 
 */
public class HumanNPC extends Action {

    /**
     * Default constructor
     */
    public HumanNPC() {
    }
    
    /**
     *
     * @return
     */
    @Override
    public String Fly() throws Exception {
        throw new Exception(" cannot fly");// TODO implement here
    }

}