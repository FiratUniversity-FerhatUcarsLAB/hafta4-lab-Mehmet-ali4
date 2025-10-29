import java.util.Scanner;
public class OgrenciBilgi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=====================================");

        System.out.println("OBSYE HOŞ GELDİNİZ...");

        System.out.print("Adınızı giriniz : ");
        String ad = input.nextLine();

        System.out.print("Soy Adınızı giriniz :");
        String soyAd = input.nextLine();

        System.out.print("Öğrenci Numaranızı giriniz:");
        int no = input.nextInt();

        System.out.print("Yaşınız:");
        int yas = input.nextInt();

        System.out.print("GPA'nız nedir (0.00-4.00)");
        double gpa = input.nextDouble();


            //ÇIKTILAR
        System.out.println("============== ÖĞRENCİ BİLGİ SİSTEMİ ==============");
        System.out.printf("Ad Soyad : %s %s%n ", ad, soyAd );
        System.out.printf("Öğrenci Numarası : %d%n ",no);
        System.out.printf("Yaş : %d%n ",yas);
        System.out.printf("GPA : %.2f%n ",gpa);
        

        if(gpa>=2.5){
            System.out.println("Başarılı bir öğrencisiniz ");
           }else{System.out.println("Başarılı bir öğrenci değilsiniz...");
        }
    }
}
