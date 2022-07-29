package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("matematik sınav notunuzu giriniz: " );
        int mat = scanner.nextInt();
        System.out.println("fizik sınav notunuzu giriniz: " );
        int fizik = scanner.nextInt();
        System.out.println("kimya sınav notunuzu giriniz: " );
        int kimya = scanner.nextInt();
        System.out.println("Türkçe sınav notunuzu giriniz: " );
        int Türkçe = scanner.nextInt();
        System.out.println("tarih sınav notunuzu giriniz: " );
        int tarih = scanner.nextInt();
        System.out.println("müzik sınav notunuzu giriniz: " );
        int müzik = scanner.nextInt();
        double toplam = mat + fizik +kimya +Türkçe +tarih +müzik;
        double ortalama = toplam/6;
        System.out.println("not ortalamanız : "+ortalama);

        if(ortalama>=60){
            System.out.println("sınıfı geçti");
        }else{
            System.out.println("sınıfta kaldı");
        }
    }
}
