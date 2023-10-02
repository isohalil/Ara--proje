package SigortaProgramı;

public class AracServis {

    void prim(String yili, String donem, int fiyat) {
        if (donem.equals("Haziran 2023")){
            System.out.println(fiyat < 10000 ? "2000" : "2500");
        }else System.out.println(fiyat < 10000 ? "2500" : "3000");


    }

    void prim(String yili, String donem, int fiyat, int ksayi) {
        if (donem.equals("Haziran 2023")){
            System.out.println(ksayi==1 ? "2000" : "2500");
        }else System.out.println(ksayi==1 ? "2500" : "3000");



    }



}

