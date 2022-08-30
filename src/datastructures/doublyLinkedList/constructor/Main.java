package datastructures.doublyLinkedList.constructor;

import datastructures.doublyLinkedList.constructor.DoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList myDLL = new DoublyLinkedList(1);

//        myDLL.getHead();
//        myDLL.getTail();
//        myDLL.getLength();

        //Append Method

        myDLL.append(2);

        //(2) Items - Returs 2 Node
        System.out.println(myDLL.removeLast().value);
        //(1) Items - Returs 1 Node
        System.out.println(myDLL.removeLast().value);
        //(0) Items - Returs null
        System.out.println(myDLL.removeLast());

        myDLL.printList();
    }
}
