package FirstProject;

public class hafta17 {

     public static void main(String[] args) {


         for (int i = 0; i < 6; i++) {

             if (1>i){
                 System.out.print("     *");
                 System.out.println(" ");
             } else if (2>i){
                 System.out.print("    **");
                 System.out.println(" ");
             }else if (3>i){
                 System.out.print("   ***");
                 System.out.println(" ");
             }else if (4>i){
                 System.out.print("  ****");
                 System.out.println(" ");
             }else if (5>i){
                 System.out.print(" *****");
                 System.out.println(" ");
             }else {
                 System.out.print("******");
                 System.out.println(" ");
             }



             int[] Scores = {44,56,76,78,65,43,56,45,43,66,89,88,77,99,67,45,32};

             int minimum = Scores[0];

             for (int I = 1; i < Scores.length; i++) {

                 if(minimum > Scores[i]){
                     minimum = Scores[i];
                 }

             }

             System.out.println("minimum = " + minimum);


             
             String[] names = {"Liam,Olivia,Noah,Emma,Oliver,Charlotte,Elijah,Amelia,Theodore,Harper"};

           /*  String names = Scores[0];

             for (int I = 1; i < names.Lenght; i++) {

                 if(names > Scores[i]){
                     names = Scores[i];
                 } */

             }

            // System.out.println("minimum name = " + names);


         }
         }







