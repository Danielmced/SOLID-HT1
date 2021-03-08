package gt.edu.umg.dependency_inversion_solution;


public class PremiumPlayer implements IPremiumAwards, IRegularAwards {

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
    public void PremiumPlayer(String nickName) {
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
    
    /**
     * @return
     */
    @Override
    public String getPremiumAwards() {
        String text = "";
        text +="<br> Obteniendo los premios premium...<br>";
        text +="Premios = 15";
        return text;
    }

}