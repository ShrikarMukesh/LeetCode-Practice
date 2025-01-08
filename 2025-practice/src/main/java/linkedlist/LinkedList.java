package main.java.linkedlist;

public class LinkedList {
    private static Node head = null;
    private int size = 0;

    public void insert(int data){
        Node newNode = new Node(data);
        if (head == null){
           head = newNode;
        }
        else {
            Node temp = head;
            while(temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(newNode);
        }
        size++;
    }

    public void traverse() {
        Node temp = head;
        while(null != temp) {
            System.out.print(" " + temp.getData());
            temp = temp.getNext();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.insert(4);
        linkedList.insert(18);
        linkedList.insert(7);
        linkedList.insert(3);
        linkedList.traverse();
    }
}
