package Queue_data_structure.src;

import java.util.Arrays;

public class Queue_2 {
    private int[] arrayQueue;
    private int begin, end, capacity, count;

    public Queue_2(int size)
    {
        this.arrayQueue = new int[size];
        this.begin = 0;
        this.end = -1;
        this.capacity = size;
        this.count = 0;
    }

    public int sizeQueue(){ return this.count; }
    public boolean isEmpty(){ return (sizeQueue() == 0); }
    public boolean isFull(){  return (sizeQueue() == this.capacity); }

    public void toInsert(int element)
    {
        if(isFull())
        {
            System.out.println("Queue is full(Overflow)");
            System.exit(-1);
        }
        else 
        {
            System.out.println("Inserting " + element);

            this.end = (this.end + 1) % this.capacity;
            this.arrayQueue[this.end] = element;
            this.count++;
        }
    }

    public int toRemove()
    {
        if (isEmpty())
        {
            System.out.println("Queue is Empty(UnderFlow)");
            System.exit(-1);
        }

        int firstElementQueue = arrayQueue[this.begin];

        System.out.println("Removing " + firstElementQueue);

        this.begin = (this.begin + 1) % this.capacity;
        this.count--;

        return firstElementQueue;
    }

      @Override
    public String toString()
    {
        // criar um array auxiliar para armazenar os elementos da fila na ordem correta
        int[] aux = new int[count];
        
        // copiar os elementos da fila para o array auxiliar usando um loop for
        for (int i = 0; i < count; i++) {
            aux[i] = arrayQueue[(begin + i) % capacity];
        }
        
        // retornar a representação em string do array auxiliar usando o método Arrays.toString
        return Arrays.toString(aux);
    }


    // @Override
    // public String toString()
    // {
    //     String beginQueue = "[";
    //     int currentIndex = this.begin;

    //     while(currentIndex != this.end + 1)
    //     {
    //         System.out.println(beginQueue);

    //         if(currentIndex == this.arrayQueue.length){ currentIndex = 0; }

    //         if(currentIndex == this.end)
    //         {
    //             beginQueue += this.arrayQueue[currentIndex];
    //         }
    //         else
    //         {
    //             beginQueue += this.arrayQueue[currentIndex] + " , ";
    //         }
    //         currentIndex++;
    //     }
    //     return beginQueue + "]";
    // }
}

/*
 * link: https://www.techiedelight.com/pt/queue-implementation-in-java/
@params arrayQueue: array that will store the queue elements
@params begin: pointer to the beginning of the queue
@params end: pointer to the end of the queue
@params capacity: maximum capacity of the queue
@params count: current size of the queue
@params  end = (end + 1) % capacity;  // circular increment get the correct index of the array 
    O operador % é útil para implementar uma fila circular, que é uma forma de aproveitar melhor o espaço do array. Em uma fila circular, quando o fim da fila chega ao final do array, ele volta para o início, ocupando as posições livres. Assim, a fila pode ocupar qualquer posição do array, desde que não ultrapasse a sua capacidade.

    Para entender melhor como funciona o operador %, vamos ver alguns exemplos:

    10 % 5 retorna 0, pois 10 dividido por 5 não tem resto.
    7 % 4 retorna 3, pois 7 dividido por 4 tem resto 3.
    17 % 5 retorna 2, pois 17 dividido por 5 tem resto 2.
    No caso da fila, o operador % é usado para calcular o índice do fim da fila de acordo com a capacidade do array. Por exemplo, se a capacidade for 5 e o fim da fila for 4, então:

    end = (end + 1) % capacity resulta em end = (4 + 1) % 5, que é igual a 0.
    Isso significa que o fim da fila passa a ser a posição 0 do array, ou seja, a primeira posição.
    Se a capacidade for 5 e o fim da fila for 2, então:

    end = (end + 1) % capacity resulta em end = (2 + 1) % 5, que é igual a 3.
    Isso significa que o fim da fila passa a ser a posição 3 do array, ou seja, a quarta posição.

@params System.exit(-1) significa que o programa está encerrando a execução da máquina virtual Java (JVM) com um código de status negativo. O código de status é um número inteiro que indica se o programa terminou normalmente ou anormalmente. Um código de status zero (0) significa que o programa terminou normalmente, sem erros. Um código de status diferente de zero (-1, 1, 2, etc.) significa que o programa terminou anormalmente, com algum erro.

O método System.exit é usado para encerrar a JVM e sair do programa imediatamente, sem executar as linhas de código que estão abaixo dele. Esse método também invoca os ganchos de desligamento (shutdown hooks) que foram registrados, que são blocos de código que podem ser usados para liberar os recursos ocupados pelo programa ou fazer alguma operação final antes de sair.

 */
