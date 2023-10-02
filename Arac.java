package SigortaProgramı;

public class Arac {

    /*Motor gücü,yılı,Dönem,fiyat,prim,*/

    private String motorgucu;
    private String yili;
    private String donem ;
    private int fiyat;
    private int prim ;

    public Arac() {
    }

    public Arac(String motorgucu, String yili, String donem, int fiyat, int prim) {
        this.motorgucu = motorgucu;
        this.yili = yili;
        this.donem = donem;
        this.fiyat = fiyat;
        this.prim = prim;
    }

    public String getMotorgucu() {
        return motorgucu;
    }

    public String getYili() {
        return yili;
    }

    public String getDonem() {
        return donem;
    }

    public int getFiyat() {
        return fiyat;
    }

    public int getPrim() {
        return prim;
    }

    public void setMotorgucu(String motorgucu) {
        this.motorgucu = motorgucu;
    }

    public void setYili(String yili) {
        this.yili = yili;
    }

    public void setDonem(String donem) {
        this.donem = donem;
    }

    public void setFiyat(int fiyat) {
        this.fiyat = fiyat;
    }

    public void setPrim(int prim) {
        this.prim = prim;
    }

    @Override
    public String toString() {
        return "Arac{" +
                "motorgucu='" + motorgucu + '\'' +
                ", yili='" + yili + '\'' +
                ", donem='" + donem + '\'' +
                ", fiyat=" + fiyat +
                ", prim=" + prim +
                '}';
    }
}
