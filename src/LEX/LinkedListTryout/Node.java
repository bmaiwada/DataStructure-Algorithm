package LEX.LinkedListTryout;

public class Node {
    private String data;
    private Node next;

    public Node(String data){
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}

class LinkedList{
    private Node head;
    private Node tail;

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public void addAtEnd(String data){
        // Create a new node
        Node node = new Node(data);

        // Check if the list is empty,
        // If yes, make the node as the head and the tail
        if(this.head == null)
            this.head = this.tail = node;
        else {
            // If the list is not empty, add the element at the end
            this.tail.setNext(node);

            // Make the new node as the tail
            this.tail = node;
        }
    }

}

class Tester {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.addAtEnd("Munich");
        list.addAtEnd("Venice");
        list.addAtEnd("Milan");
        list.addAtEnd("Vienna");

        System.out.println("Adding an element to the linked list " +list);
    }
}
