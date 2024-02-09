package Queue_data_structure;

import Queue_data_structure.src.Queue;
import Queue_data_structure.src.Queue_2;

public class APP {
    public static void main(String[] args){
        //Queue<Integer> queueNumbers = new Queue<Integer>(4);
        Queue_2 queueNumbers = new Queue_2(3);
        queueNumbers.toInsert(1);
        queueNumbers.toInsert(3);
        // queueNumbers.toInsert(4);
        // queueNumbers.toInsert(5);

        System.out.println(queueNumbers.toString());
    }
}
