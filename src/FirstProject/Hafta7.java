package FirstProject;

import java.util.Scanner;

public class Hafta7 {


   public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       System.out.println("ilk sayiyi giriniz:");
       int sayi= scan.nextInt();
       System.out.println("ikinci sayiyi giriniz");
       int sayi2 = scan.nextInt();
       boolean TrueOrFalse = sayi > sayi2;
       System.out.println("ilk sayi ikinci sayidan buyukmu:" + TrueOrFalse );



















       int firstNumber = 125;
       int secondNumber = 24;
       int sum = firstNumber+secondNumber;
       int subtract = firstNumber-secondNumber;
       int multiply = firstNumber*secondNumber;
       int divide = firstNumber/secondNumber;
       int remainder =firstNumber%secondNumber;
       System.out.println("125+24=" + sum);
       System.out.println("125-24=" + subtract );
       System.out.println("125x24=" + multiply);
       System.out.println("125/24=" + divide);
       System.out.println("125%24=" + remainder);

   }
}
