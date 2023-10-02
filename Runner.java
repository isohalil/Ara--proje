package SigortaProgramı;

import java.util.Scanner;

public class Runner {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        start();


    }

    private static void start() {


        System.out.println("-------------Hosgeldiniz ----------------");
        System.out.println("Lütfen dönem seçiniz");
        System.out.println("1-Haziran 2023 2-Aralık 2023");
        int donemTercih = input.nextInt();
        if (donemTercih == 1 || donemTercih == 2) {
            Arac arac = new Arac();
            AracServis as = new AracServis();
            arac.setDonem(donemTercih == 1 ? "Haziran 2023" : "Aralık 2023");
            System.out.println("Lütfen araç tipini giriniz");
            System.out.println("1-Otomobil 2-Otobüs 3-Kamyon 4-Motorsiklet ");
            int tip = input.nextInt();
            switch (tip) {
                case 1:
                    System.out.println("Lütfen aracınızın modelini giriniz");
                    System.out.println("1-Suv 2-Sedan 3-HB");
                    int model = input.nextInt();
                    input.nextLine();
                    switch (model) {
                        case 1:
                            System.out.println("Lütfen yılı giriniz");
                            String yili = input.nextLine();
                            System.out.println("Lütfen aracın fiyatını giriniz");
                            int afiyat = input.nextInt();
                            input.nextLine();
                            as.prim(yili, arac.getDonem(), afiyat);
                            break;
                        case 2:
                            System.out.println("Lütfen yılı giriniz");
                            String yili1 = input.nextLine();
                            System.out.println("Lütfen aracın fiyatını giriniz");
                            int afiyat1 = input.nextInt();
                            input.nextLine();
                            as.prim(yili1, arac.getDonem(), afiyat1);
                            break;
                        case 3:
                            System.out.println("Lütfen yılı giriniz");
                            String yili2 = input.nextLine();
                            System.out.println("Lütfen aracın fiyatını giriniz");
                            int afiyat2 = input.nextInt();
                            as.prim(yili2, arac.getDonem(), afiyat2);
                            break;
                        default:
                            System.out.println("Hatalı giriş ! ");
                    }break;
                case 2:
                    System.out.println("(Lütfen koltuk sayısını giriniz");
                    System.out.println("Koltuk sayısı seçiniz 1-)18-30 arası 2-)31 ve üzeri ");
                    int ksayi = input.nextInt();
                    input.nextLine();

                    as.prim("2015", arac.getDonem(), 10000, ksayi);
                    break;

            }


        }
    }
}
