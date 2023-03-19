package FirstProject;

import java.util.Scanner;

public class hafta141 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


      /*  System.out.println("Bir kelime giriniz");
        String kelime = input.next();


        for (int i = kelime.length() - 1; i >= 0; i--) {

            System.out.print(kelime.charAt(i));

        }*/


        // for (int i = 0; i < 101; i=i+5) {
        //   System.out.println(i);
        //  }


        // int hepsi = 0;
        //for (int i = 1; i < 101; i++) {
        //  hepsi = i + 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9+10+11 + 12 + 13 + 14 + 15 + 16 + 17 + 18 + 19+20+21 + 22 + 23 + 24 +
        //         25 + 26 + 27 + 28 + 29+30+31 + 32 + 33 + 34 + 35 + 36 + 37 + 38 + 39+40+41 + 42 + 43 + 44 + 45 + 46 + 47 +
        //       48 + 49+50+51 + 52 + 53 + 54 + 55 + 56 + 57 + 58 + 59+60+61 + 62 + 63 + 64 + 65 + 66 + 67 + 68 + 69+70+71 +
        //     72 + 73 + 74 + 75 + 76 + 77 + 78 + 79+80+81 + 82 + 83 + 84 + 85 + 86 + 87 + 88 + 89+90+91 + 92 + 93 + 94 +
        //   95 + 96 + 97 + 98 + 99;

        //System.out.println(hepsi);


       /* int hepsi = 0;
        for (int i = 1; i < 101; i++) {
            hepsi = hepsi + i;
        }

        System.out.println(hepsi);
*/
        int cevap = 0;
        for (; ; ) {

            System.out.print(
                    "\n1=Toplama " +
                    "\n2=cikarma " +
                    "\n3=carpim " +
                    "\n4=bolme " +
                    "\n5=Cik");
            System.out.println();
            System.out.print(" bir islem seciniz: ");
            String secim = input.next();
            System.out.println("islemi yapmak ikisayi giriniz:");
            input.nextLine();
            int birincisayi = input.nextInt();
            int ikincisayi = input.nextInt();
            if (secim.equals(String.valueOf(1)) || secim == "Toplama") {
                cevap = birincisayi + ikincisayi;
            }else if (secim.equals(String.valueOf(2)) || secim== "toplama" ){
                cevap = birincisayi - ikincisayi;
            } else if (secim == String.valueOf(3) || secim== "carpim") {
                cevap = birincisayi*ikincisayi;
            } else if (secim == String.valueOf(4) || secim== "bolme") {
                cevap = birincisayi/ikincisayi;
            }else if(secim == String.valueOf(5) || secim =="Cik") {
                break;
            }else{
                System.out.print("yanlis bir tusa bastiniz bida deneyin");
            }

            System.out.printf("cevap= ", cevap);

        }

        }
    }











