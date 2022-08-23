package datastructures.bigOnotation;

public class NonDominant {
        public static void printItems(int n) {

            //O(n^2 + n) where n^2 is the dominant terms
            // and n is the non-dominant term.
            // we can just drop n as it is non-dominant.
            // we have just O(n^2)
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.println(i + " " + j);
                }
            }

            for (int k = 0; k < n; k++) {
                System.out.println(k);
            }
        }


        public static void main(String[] args) {
            printItems(10);
        }
}