package FirstProject;

import java.util.Scanner;

public class Hafta6 {
    public static void
    main(String[] args) {

      System.out.println("***********dikdortgenin alani********");
      double uzunlugu = 7.9;
      double genisligi = 4.5;
      double dikdortgeninalani = uzunlugu + genisligi;
      System.out.println("dikdortgenin uzunlugu = " + uzunlugu);
      System.out.println("dikdortgenin genisligi = " + genisligi);
      System.out.println("dikdortgenin alani = " + dikdortgeninalani);


      System.out.println("*************dikdortgenin cevresi************");
      uzunlugu = 7.9;
      genisligi = 4.5;
      double dikdortgenincevresi = 2 * (uzunlugu + genisligi);
     System.out.println("dikdortgenin uzunlugu = " + uzunlugu);
     System.out.println("dikdortgenin genisligi = " + genisligi);
     System.out.println("dikdortgenin cevresi = " + dikdortgenincevresi);

        System.out.println("*************verilen sayinin rakamlarin topkamasi************");
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a 3 digit number: ");
        int sayi = scan.nextInt();

     //int sayi = 623;
    //int rakam1 = 6;
     //int rakam2 = 2;
     //int rakam3 = 3;

        int rakam1 = sayi/100 ;
        int rakam2 = (sayi / 10) % 10;
        int rakam3 = sayi % 10;

        int cevap = rakam1+rakam2+rakam3;
     System.out.println("sayi =" + sayi);
     System.out.println("Birinci rakam =" + rakam1);
     System.out.println("ikinci rakam =" + rakam2);
     System.out.println("ucuncu rakam =" + rakam3);
     System.out.println("cevap =" + cevap);
    }

}
