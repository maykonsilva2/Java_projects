## Doubly Linked List (DLL) (lista duplamente encadeada)
Uma lista duplamente encadeada é uma estrutura de dados que armazena uma sequência de valores, chamados de nós. Cada nó tem dois ponteiros, um que aponta para o nó anterior e outro que aponta para o nó seguinte. O primeiro nó da lista é chamado de cabeça (head) e o último nó é chamado de cauda (tail). 
Quando uma lista duplamente encadeada é inicializada, tanto a cabeça(head) quanto a cauda(tail) apontam para nulo, pois a lista está vazia.

## Aplicações da lista duplamente encadeada
Uma lista duplamente encadeada permite que você percorra a lista em qualquer direção, ou seja, da cabeça(head) para a cauda(tail) ou da cauda(tail) para a cabeça(head). Isso pode ser útil para algumas aplicações, como navegar em páginas da web ou manter um histórico de ações. Uma lista duplamente encadeada também facilita a inserção e a remoção de nós em qualquer posição da lista, pois você pode acessar facilmente os nós adjacentes. 
No entanto, uma lista duplamente encadeada ocupa mais espaço na memória do que uma lista simplesmente encadeada, pois cada nó tem um ponteiro extra.

![DLL](img/DLL_1_doubly_linked_list.png)

Implementação de uma lista duplamente encadeada em JAVA.
- Para implementar uma DLL, defina uma classe Node que representa um nó. A classe Node tem três atributos: `data`, `prev` e `next`.
    `data` armazena o valor do nó.
    `prev` armazena a referência ao nó anterior na lista, ou seja, a cauda(tail).
    `next` armazena a referência ao nó seguinte na lista, ou seja, aponta para a cabeça(head) do nó seguinte.

OBS: `next` e `prev` são inicializados como nulo por padrão, portanto, não precisamos colocar no construtor da classe Node. ```next = null``` e ```prev = null```	

```java
        
        public class Node {
            private int data; // data is the value of the node, declared as private to not be accessed directly
            public Node prev; // prev is the pointer to the previous node, the tail, declared as public to be accessed directly
            public Node next; // next is the pointer to the next node, the head, declared as public to be accessed directly

            // Constructor to create a new node
            // next and prev is by default initialized as null, but we can initialize them while creating a new node.
            public Node(int value) { this.data = value;}

            //Method get data
            public int getData() {
                return this.data;
            }
        }
```
- Crie também uma classe List que representa a lista duplamente encadeada. A classe List tem  um atributo: `head`.
    `head` armazena a referência ao primeiro nó da lista.
OBS: O tail vou deixar como atributo `prev` na classe Node para facilitar o acesso, mas poderia ser um atributo da classe List.
    `prev` armazena a referência ao último nó da lista.

```java
        public class List {
            public Node head; // head of list
            // Constructor to create an empty list
            public List() {
                this.head = null;
            }
        }
```

- Para inserir um novo node no inicio da lista, crie o metodo `insertInBeginning` dentro da classe List. E devemos verficar se a lista está vazia, se estiver vazia, o novo node deve ser a cabeça(head), se não estiver vazia, o novo node deve ser inserido no inicio da lista e a `next` que aponta para o proximo nó  deve ser atualizada e o novo node deve apontar para o node anterior que é a cauda(tail) que atribuimos no construtor da classe Node como prev. Fiz dessa forma para facilitar o acesso ao ultimo node da lista,  e depois atribuimos o novo node como a nova cabeça(head) da lista.
    ```java

        //Method to insert a new node at the beginning of the list
        public void insertInBeginning(int value) {
            if(this.head == null){
                this.head = new Node(value);
            } else {
                Node newNode = new Node(value);
                newNode.next = this.head; // update the next pointer of the new node to point to the head
                newNode.prev = this.head; // remember that prev is the pointer to the previous node, the tail.
                this.head = newNode; // update the head
            }
        }
    ```
- Implemente o método  `printList()` dentro da classe List para podemos imprimir os valores da lista.
    ```java
        //Method to print the list
        public void printList() {
            Node aux = this.head;
            while (aux != null) {
                System.out.print(aux.data + " -> ");
                aux = aux.next;
            }
            System.out.println("null"); // show null in the end of the list
        }
    ```

- Agora vamos fazer o teste criando instancias da classe List e adicionando alguns valores.
    ```java
        import Doubly_Linked_List.src.List; // import the List class

        public static void main(String[] args) {
            List list = new List();
            list.insertInBeginning(5);
            list.insertInBeginning(10);
            list.insertInBeginning(15);
            list.insertInBeginning(20);
            list.insertInBeginning(25);
        }
    ```
    O resultado será:
    ```java
        25 -> 20 -> 15 -> 10 -> 5 -> null
    ```

## Metodo para inserir um novo node no final da lista
- Para inserir um novo node no final da lista, crie o metodo `insertAtEnd` dentro da classe List. E devemos verficar se a lista está vazia, se estiver vazia, o novo node deve ser a cabeça(head), se não estiver vazia, o novo node deve ser inserido no final da lista, para fazer isso devemos pecorrer a lista até o ultimo node, lembre que o ultimo node tem o atributo `next` como nulo, antes criamos `Node aux` que é uma referencia para a cabeça(head) da lista, implemente um laço de repetição `while` para pecorrer a lista até o ultimo node, e depois atribuimos o novo node como o ultimo node da lista e atualizamos o `prev` do novo node para apontar para o nó anterior.
    ```java
        //Method to insert a new node at the end of the list
        public void insertAtEnd(int value) {
            if(this.head == null){
                this.head = new Node(value);
            } else {
                Node newNode = new Node(value);
                Node aux = this.head;
                while (aux.next != null) {
                    aux = aux.next;
                }
                aux.next = newNode;
                newNode.prev = aux;
            }
        }
    ```

## Metodo para inserir de forma ordenada

## Buscando na Lista Duplamente Encadeada
Reference: https://www.geeksforgeeks.org/data-structures/linked-list/doubly-linked-list/?ref=appendix
Reference: https://github.com/LuisAraujo/Estrutura-de-Dados-em-Java#5---lista-duplamente-encadeada