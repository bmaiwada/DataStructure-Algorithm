package datastructures;

public class StringClass {



        public static void main(String[] args) {

            String str = "Infoys Certified Java Programmer Mock";

            String strUpdated = str.trim().substring(6,7) + str.trim().substring(37); //line 1

            System.out.println(strUpdated);

        }




}
