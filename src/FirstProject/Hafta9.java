package FirstProject;

import java.util.Scanner;

public class Hafta9 {
    public static void main(String[] args) {
        System.out.println("Yil sonu scorunuzu girin:");
        Scanner scanner = new Scanner(System.in);
        double cevap = scanner.nextDouble();
        if (cevap>=90) {
            System.out.println("A aldiniz");
        } else if (cevap>=80) {
            System.out.println("B aldiniz");
        } else if (cevap>=70 ) {
            System.out.println("C aldiniz");
        } else if (cevap>=60) {
            System.out.println("D aldiniz");
        } else if (cevap<=59) {
            System.out.println("F aldiniz");
        }
    }
}
