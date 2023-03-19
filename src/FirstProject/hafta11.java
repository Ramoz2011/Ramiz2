package FirstProject;


import java.util.Scanner;

public class hafta11 {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            //ikici odev
            System.out.println("corner 1:");
            int corner1 = scanner.nextInt();

            System.out.println("Corner 2:");

            int corner2 = scanner.nextInt();

            System.out.println("Corner 3:");

            int corner3 = scanner.nextInt();

            if (corner1==corner2 && corner1==corner3 && corner3==corner2){

                System.out.println("this triangle is a equilateral");
            }else if (corner1==corner2 || corner1==corner3 || corner3==corner2) {
                System.out.println("this triangle is an isosceles");

            }else {
                System.out.println(" this triangle is a scalene ");
            }


            //ucuncu odev 1
            System.out.println("birinci sayi:");

            int sayi2de1 = scanner.nextInt();

            System.out.println("ikinci sayi:");

            int sayi2de2 = scanner.nextInt();

            System.out.println("ucuncu sayi:");

            int sayi2de3 = scanner.nextInt();

            String cevap2 = "";

            if (sayi2de1 > sayi2de2 && sayi2de1>sayi2de3){cevap2 = "en buyuk sayi birinci";

            }else if (sayi2de2>sayi2de1 && sayi2de2>sayi2de3){cevap2 = "en buyuk sayi ikinci";

            }else if (sayi2de3>sayi2de1 && sayi2de3>sayi2de2) {
                cevap2 = "en buyuk sayi ucuncu";

            }else if (sayi2de1 == sayi2de2 && sayi2de1 == sayi2de3 && sayi2de2 == sayi2de3 ) {

                cevap2 = "butun sayilar esit";
            }else if (sayi2de2==sayi2de3 && sayi2de2>sayi2de1 && sayi2de3>sayi2de1){
                cevap2 = "en buyuk sayi ikinci ve ucuncu";
            }else if (sayi2de1==sayi2de3 && sayi2de1>sayi2de2 && sayi2de3>sayi2de2){
                cevap2 = "en buyuk sayi birinci ve ucuncu";
            }else {
                cevap2 = "en buyuk sayi birinci ve ikinci";
            }
            System.out.println(cevap2);







       //ucuncu odev 2
            System.out.println("birinci sayiyi giriniz");
            int Sayi31 = scanner.nextInt();
            System.out.println("Ikinci sayiyi giriniz");
            int sayi32 = scanner.nextInt();
            System.out.println("Ucuncu sayiyi giriniz");
            int sayi33 = scanner.nextInt();

            if (Sayi31>sayi32){

                if (Sayi31>sayi33){
                    System.out.println("en buyuk sayi 1");
                }else if (Sayi31<sayi33){
                    System.out.println("en buyuk sayi 3");
                }else {
                    System.out.println("en buyuk sayi 1 ve 3");
                }
            } else if (Sayi31<sayi32) {
                if (sayi32>sayi33) {
                    System.out.println("en buyuk sayi 2");
                }else if (sayi32<sayi33) {
                    System.out.println("en buyuk sayi 3");
                }else {
                    System.out.println("en buyuk sayi 2 ve 3");
                }
            }else {
                if (Sayi31>sayi33 && sayi32>sayi33){
                 System.out.println("en buyuk sayi 1 ve 2");
                } else if (Sayi31<sayi33 && sayi32<sayi33) {
                    System.out.println("en buyuk sayi 3");
                }else {
                    System.out.println("butun sayilar esit");
                }
            }


        }








    }





