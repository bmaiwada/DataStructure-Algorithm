package LexCourse.Array;

public class DeleteArray {
    public static void deleteArray(char [] ar, int pos){
        //Traverse the array from the position where the element has to be deleted to the end
        for(int i = pos -1; i < ar.length-1; i++){
            ar[i] = ar[i + 1];
        }
        //The space that is left at the end is filled with character 'O'
        ar[ar.length - 1] = 'O';
    }

    public static void main(String[] args) {
        char[] arr = new char[4];
        arr[0] = 'a';
        arr[1] = 'b';
        arr[2] = 'c';
        arr[3] = 'd';

        //make changes and try to delete elements from different positions
        DeleteArray.deleteArray(arr, 1);
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
