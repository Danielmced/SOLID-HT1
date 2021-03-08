package gt.edu.umg.dependency_inversion_solution;

public class RegularPlayer implements IRegularAwards {

    private String nickName;

    /**
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
     * @return
     */
    @Override
    public String getRegularAwards() {
        String text = "";
        text +="<br> Obteniendo los premios regulares...<br>";
        text +="Premios = 3";
        return text;
    }

}