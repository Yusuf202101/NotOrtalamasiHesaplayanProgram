import java.sql.SQLOutput;
import java.util.Scanner;
public class FirstProgram {
    public static void main(String[] args)
    {
        int mat,fizik,tarih,kimya,turkce,muzik;
        Scanner inp = new Scanner(System.in);
        System.out.print("Matematik notunuz :");
        mat = inp.nextInt();

        System.out.print("Fizik notunuz :");
        fizik = inp.nextInt();

        System.out.print("Tarih notunuz :");
        tarih = inp.nextInt();

        System.out.print("Kimya notunuz :");
        kimya = inp.nextInt();

        System.out.print("Türkçe notunuz :");
        turkce = inp.nextInt();

        System.out.print("Müzik notunuz :");
        muzik = inp.nextInt();

        int toplam = mat+fizik+tarih+kimya+turkce+muzik;
        double ortalama = toplam/6;
        System.out.println("Not Ortalamanız : "+ortalama);
        System.out.println(ortalama>60 ?"Geçtiniz": "Kaldınız");




    }
}
