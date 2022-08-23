package datastructures.bigOnotation;

public class Main {

    // Big O notation
    //use in iteration
    public static void printItems(int n){

        // O (n) => O (n + n) = O(2n)
        for (int i = 0; i < n; i++){
            System.out.println(i);
        }

        //O(n) proprtional
        for (int j = 0; j < n; j++){
            System.out.println(j);
        }

    }
    public static void main(String[] args) {

        printItems(10);

    }
}
