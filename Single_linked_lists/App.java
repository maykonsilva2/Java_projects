package Single_linked_lists;

import Single_linked_lists.src.List;
import Single_linked_lists.src.No;

public class App {
    public static void main(String args[]){
        List<String> names = new List<>();

        names.insertBeginList("Maria");
        names.insertBeginList("Joao");
        names.insertBeginList("Pedro");

        names.insertEndList("Antonio");

        //names.removeBeginList();
        //names.removeEndList();

        names.printList();

        int value = names.searchIndexInList("Maria");
        System.out.println(value);

        Object value2 = names.searchIndexInList_2("Maria");
    }

}

