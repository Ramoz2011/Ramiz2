package FirstProject;

public class Hafta14 {
    public static void main(String[] args) {
        for (int i = 1; i < 101; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 1; i < 101; i = i + 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 1; i < 101; i++) {
            if (i % 2 != 0)
                System.out.print(i + " ");
        }
        for (int i = 2; i < 101; i=i+2) {
            System.out.print(i + " ");
        }


        String dsffs = "hello";
        System.out.println(dsffs.charAt(2));
        dsffs.concat("hi");

        String name = "Ramiz";


        for (int i = name.length()-1; i >=0 ; i--) {
            System.out.print(name.charAt(i));
        }




    }
}
