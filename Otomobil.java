package SigortaProgramı;

public class Otomobil extends Arac {
    private String tip ;


    public Otomobil() {
    }

    public Otomobil(String tip) {
        this.tip = tip;
    }

    public Otomobil(String motorgucu, String yili, String donem, int fiyat, int prim, String tip) {
        super(motorgucu, yili, donem, fiyat, prim);
        this.tip = tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public String getTip() {
        return tip;
    }
}