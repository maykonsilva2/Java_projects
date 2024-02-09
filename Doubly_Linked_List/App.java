package Doubly_Linked_List;

import Doubly_Linked_List.src.List;

public class App {
    public static void main(String[] args) {
        List list = new List();

        list.insertInBeginning(5);
        list.insertInBeginning(10);
        list.insertInBeginning(15);

        list.printList();

        System.out.println("Beginning  value at List: " + list.searchAtBeginning());
        System.out.println("End value in List: " + list.searchAtEnd());
        
    }
}
