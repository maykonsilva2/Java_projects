package Doubly_Linked_List.src;

public class Node {
        private int data;
        public Node prev;
        public Node next;

        // next and prev is by default initialized as null
        public Node(int value) { 
            this.data = value;
            // this.prev = null;
            // this.next = null;
        }

        public int getData() {
            return this.data;
        }
        
        public Node getNext() {
            return this.next;
        }
}
