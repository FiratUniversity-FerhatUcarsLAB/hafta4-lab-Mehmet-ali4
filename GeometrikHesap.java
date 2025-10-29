import java.util.Scanner;
public class GeometrikHesap {

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

         System.out.println("====================================================");

         System.out.println("Geometrik Hesaplayıcıya Hoş Geldiniz...");

         System.out.println("====================================================");

         double pi = 3.14159;
         
         System.out.printf("Yarıçap giriniz(sadece doğal sayı) :");
         int r = input.nextInt();

         int cap = r*r;
         double alan = pi*r*r;
         double cevre = 2*pi*r;
         double hacim = 4/3*pi*r*r*r;
         double yüzeyalan = 4*pi*r*r;

         //ÇIKTILAR
         System.out.println("==========SONUÇLAR==========");
         System.out.println("Çap = "+cap);
         System.out.println("Alan = "+alan);
         System.out.println("Çevre = "+cevre);
         System.out.println("Hacim = "+hacim);
         System.out.println("Yüzey Alanı = "+yüzeyalan);

    }
}
