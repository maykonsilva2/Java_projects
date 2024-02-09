package Doubly_Linked_List.src;

import Doubly_Linked_List.src.Node;

public class List {
    public Node head;

    public List() {
        this.head = null;
        
    }

    public void insertInBeginning(int value) {
        if(this.head == null) {
            this.head = new Node(value);
        } else {
            Node newNode = new Node(value);
            newNode.next = this.head;
            newNode.prev = this.head;
            this.head = newNode;
        }
    }

    public void insertAtEnd(int value) {
        if(this.head == null){
            this.head = new Node(value);
        } else {
            Node newNode = new Node(value);

            while(this.head.next != null) {

            }
        }
    }
    
    public int searchAtBeginning() {
        return head.getData();
    }

    public int searchAtEnd() { 
        Node aux = this.head;

        while(aux.getNext() != null) {
            aux = aux.next;
        }
        return aux.getData();
    }

    //Show the elements of the list
    public void printList() {
        Node aux = this.head;

        while(aux != null) {
            System.out.print(aux.getData() + " -> ");
            aux = aux.next;
        }
        System.out.println("null"); //Show the end of list with null
    }
}
