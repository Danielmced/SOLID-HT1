package gt.edu.umg.dependency_inversion_problem;

public class RegularPlayer {

    private String nickName;

    /**
     * 
     * @return 
     */
    public String getNickName() {
        return this.nickName;
    }

    /**
     * @param nickName
     */
    public void RegularPlayer(String nickName) {
        this.nickName = nickName;
    }

    /**
     * 
     * @return 
     */
    public String getRegularAwards() {
        String text = "";
        text +="<br> Obteniendo los premios regulares...<br>";
        text +="Premios = 3";
        return text;
    }

}