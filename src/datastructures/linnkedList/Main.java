package datastructures.linnkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList myLinkedList = new LinkedList(11);

//        myLinkedList.getHead();
//        myLinkedList.getTail();
//        myLinkedList.getLength();

        //Adding an item to the last
        myLinkedList.append(3);
        myLinkedList.append(23);
        myLinkedList.append(7);

        // Set an item using set method
//        myLinkedList.set(1, 4);



//        // Remove last item
//        //(2) Items - Return 2 Node
//        System.out.println(myLinkedList.removeLast().value);
//        //(1) Items - Return 1 Node
//        System.out.println(myLinkedList.removeLast().value);
//        //(0) Items - Return 0 Node
//        System.out.println(myLinkedList.removeLast());

        // Remove from the beginning

        // Remove last item
//        //(2) Items - Return 2 Node
//        System.out.println(myLinkedList.removeFirst().value);
//        //(1) Items - Return 1 Node
//        System.out.println(myLinkedList.removeFirst().value);
//        //(0) Items - Return 0 Node
//        System.out.println(myLinkedList.removeFirst());

        // Get the value for get method
//        System.out.println(myLinkedList.get(2).value + "\n");

        // Insert item at an index
//        myLinkedList.insert(1,1);

        // Remove at the index
        myLinkedList.remove(1);

        //Reverse Method
        myLinkedList.reverse();

        // Print List
        myLinkedList.printList();
    }
}
