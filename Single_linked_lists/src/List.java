package Single_linked_lists.src;

public class List<T> {
    private No head;
    private int size;

    public List(){
        this.head = null;
        this.size = 0;
    }

    public void insertBeginList(T value) {
        No newNo = new No(value);

        newNo.setNext(this.head);
        this.head = newNo;
        this.size++;
    }
    
    public void insertEndList(T value) {
        No newNo = new No(value);

        if(this.head == null) {
            this.head = newNo;
        } 
        else {
            No aux = this.head;
            while (aux.getNext() != null) {
                aux = aux.getNext();
            }
            aux.setNext(newNo);
        }
        this.size++;
    }

    public Object removeBeginList() {
        if(this.head == null) {
            return null;
        }
        else{
            No aux = this.head;
            this.head = this.head.getNext();
            this.size--;
            return aux.getValue(); //getValue () returns an Object, you need to cast the return value to T, like this:  return (T) aux.getValue (); or  public Object removeBeginList()
        }
    }

    public Object removeEndList() {
        if(this.head == null) {
            return null;
        }
        else{
            No aux = this.head;
            No prev = null;

            while(aux.getNext() != null){
                prev = aux;
                aux = aux.getNext();
            }
            
            if(prev == null) {
                this.head = null;
            }
            else{
                prev.setNext(null);
            }
            this.size--;
            return aux.getValue();
        }
    }

    public int searchIndexInList(T value) {
        No aux = this.head;
        int index = 0;
        while(aux.getValue() != null) {
            if(aux.getValue().equals(value)) {
                return index;
            }
            aux = aux.getNext();
            index++;
        }
        return  -1;
    }

    public Object searchIndexInList_2(T value) {
        No aux = this.head;

        while(aux.getValue() != null) {
            if (aux.getValue().equals(value)) {
                return  aux.getValue();
            }
            aux = aux.getNext();
        }
        return null;
    }

        // Show the elements of list
    public void printList() {
        No aux = this.head;
            
        while(aux != null) { 
            System.out.print(aux.getValue() + " -> ");
            aux = aux.getNext();
        }
        System.out.println("Null"); // Show the end of list with null.
        
    }
}
