package datastructures.bigOnotation;

public class On2 {

    //On^2 is use in nested algorithm
    public static void printItems(int n){

        //n * n = n^2 = O(n^2)
        //Loop within Loop
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                for(int k = 0; k < n; k++) {
                    System.out.println(i + " " + j + " " +k);
                }
            }
        }
    }

    public static void main(String[] args) {
        printItems(10);
    }
}
