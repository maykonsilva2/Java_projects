package Hashing;

import java.util.ArrayList;

public class Hash {
    private final int bucket;
    private final ArrayList<Integer>[] table;

    public Hash(int bucket) {
        this.bucket = bucket;
        this.table = new ArrayList[bucket];
        for(int i = 0; i < bucket; i++){
            table[i] = new ArrayList<>();
        }
    }

    //has function to map values to key
    public int hashFunction(int key) {
        return (key % this.bucket);
    }

    public void insertItem( int key) {
        int index = hashFunction(key);
        this.table[index].add(key);
    }

    public void deleteItem(int key) {
        int index = hashFunction(key);

        if (this.table[index].contains(key)) {
            table[index].remove(Integer.valueOf(key));
        }
    }

    public void displayHash() {
        for(int index = 0; index < this.bucket;  index++){
            System.out.print(index);
            for(int value : table[index]) {
                System.out.print(" -->" + value);
            }
            System.out.println();
        }
    }

       // Drive Program
       public static void main(String[] args)
       {
           // array that contains keys to be mapped
           int[] values = { 15, 11, 27, 8, 12 };
    
           Hash h = new Hash(7);
    
           // insert the keys into the hash table
           for (int key : values) {
               h.insertItem(key);
           }
           h.displayHash();
       }
}
