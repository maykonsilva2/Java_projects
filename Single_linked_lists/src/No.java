package Single_linked_lists.src;

public class No<T> {
    private T value;
    private No next;

    public No(T value) {
        this.value = value;
        this.next = null;
    }

    public void setNext(No<T> value) {
        this.next = value;
    }
    public No<T> getNext() {
        return this.next;
    }

    public void setValue(T value) {
        this.value = value;
    }
    public T getValue() {
        return this.value;
    }
}
