package FirstProject;

import java.util.Scanner;

public class Hafta15 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci sayiyi giriniz:");

        int sayi1= scanner.nextInt();
        System.out.print("Ikinci sayiyi giriniz:");

        int sayi2= scanner.nextInt();
        int sayi3 = 0;

        for (int i = sayi1; i==sayi2 ;) {
            sayi3=sayi1-sayi2;
        }


        // int toplam = 0;


        //  for (int i = 0; i < 101; i=i+5) {
        //     toplam = toplam + i;

        //  }
        //System.out.print(toplam);


        int toplam = 0;
        int sayi = 0;
        int yuz = 101;


       while (sayi != yuz) {

            if (sayi % 5 == 0)
                toplam = toplam + sayi;
            sayi += 1;
        }
        System.out.print(toplam);







        do {

            if (sayi % 5 ==0)
            toplam = toplam + sayi;
sayi+=1;


        } while (sayi!=yuz );
        System.out.print(toplam);








    }

}