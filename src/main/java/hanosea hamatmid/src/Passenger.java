public class Passenger {
    private int passportNum;    
    private String name;        
    private Boolean permPass;   
    private int km;             

    public Passenger(int passportNum, String name) {
        this.passportNum = passportNum;
        this.name = name;
        this.permPass = false;
        this.km = 0;
    }

    public int getPassportNum() {
        return passportNum;
    }

    public void setPassportNum(int passportNum) {
        this.passportNum = passportNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getPermPass() {
        return permPass;
    }

    public void setPermPass(Boolean permPass) {
        this.permPass = permPass;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }
}
