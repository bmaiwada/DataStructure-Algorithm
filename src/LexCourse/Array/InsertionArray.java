package LexCourse.Array;

public class InsertionArray {
    public static void insertion(char[] ar, int pos, char val){
        //Traversing the array from the last position to the position where the element has to be inserted
        for(int i= ar.length-1; i>=pos; i-- ){
            //Moving each element one position to its right
            ar[i] = ar[i-1];
        }
        //inserting the data at the specified position
        ar[pos - 1] = val;
    }

    public static void main(String[] args) {
        char arr[] = new char[5];
        arr[0] = 'A';
        arr[1] = 'B';
        arr[2] = 'C';
        arr[3] = 'D';
        arr[4] = 'E';

        //make changes and try to insert elements at different positions
        InsertionArray.insertion(arr, 3, 'J');
        for (int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
