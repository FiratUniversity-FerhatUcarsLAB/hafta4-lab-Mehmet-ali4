import java.util.Scanner;

public class MaasHesap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("================================================");
        System.out.println("=====MAAŞ HESAPLAMA BRİMİNE HOŞ GELDİNZ....=====");
        System.out.println("================================================");
        
        System.out.printf("Adınızı Soyadınızı giriniz : ");
        String adsoy = input.nextLine();

        System.out.printf("Brüt Maaşınızı giriniz : ");
        double brütmaas = input.nextDouble();

        System.out.printf("Haftalık Çalışma Saati Giiniz (sadece doğal sayı) : ");
        int saat = input.nextInt();

        System.out.printf("Mesai Saatinizi Giriniz(sadece doğal sayı) : ");
        int mesai = input.nextInt();

        
        double mesaiücreti = brütmaas/160*saat*1.5;
        double ToplamGelir = brütmaas + mesaiücreti;

        //KESİNTİLER
        double SGK = ToplamGelir*0.14;
        double gelirvergisi = ToplamGelir*0.15;
        double damgavergisi = ToplamGelir*0.00759;
        double toplamkesinti = SGK+gelirvergisi+damgavergisi;


        //NETMAAŞ
        double neetmaas = ToplamGelir-toplamkesinti;


        //İSTATİSTİKLER
        double kesintioranı = toplamkesinti/ToplamGelir*100;
        

        //ÇIKTI
        System.out.println("=======================================");
        System.out.println("MAAŞ BODROSU");
        System.out.println("=======================================");
        System.out.println("Calisan : "+adsoy);
        System.out.println("===== GELİRLER  =====");
        System.out.println("Brüt maaş : "+brütmaas);
        System.out.println("Mesai ücreti : "+mesaiücreti);
        System.out.println("------------------------");
        System.out.println("TOPLAM GELİR : "+ToplamGelir);
        System.out.println("=======================================");
        System.out.println("===== KESİNTİLER =====");
        System.out.println("SGK Kesintisi (14.%): "+SGK);
        System.out.println("Gelir Vergisi (15.0%) : "+gelirvergisi);
        System.out.println("Damga Vergisi (0.8%) : "+damgavergisi);
        System.out.println("------------------------");
        System.out.println("TOPLAM KESİNTİ : "+toplamkesinti);
        System.out.println("NETMAAŞ : "+neetmaas);
        System.out.println("=======================================");
       




        



    }
    
}

