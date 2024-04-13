package Hashing.linear_probing_hash;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LinearProbingHash {
    private final int[] hashTable;
    private final int TABLE_SIZE;

    public LinearProbingHash(int table_size) {
        this.TABLE_SIZE = table_size;
        this.hashTable = new int[this.TABLE_SIZE];
        // Preenche todos os elementos do array com (-1), ou seja, todas as posições
        // estão vazia.
        Arrays.fill(hashTable, -1);
    }

    public int hashFunction(int key) {
        return key % this.TABLE_SIZE;
    }

    public void insertItem(int key) {

        try {
            int index = hashFunction(key);
            int indexStart = index;

            while (hashTable[index] != -1) {
                // Caso o index já esteja ocupado, então verifica o proximo index.
                index = (index + 1) % this.TABLE_SIZE;
                if (index == indexStart) {
                    throw new IllegalAccessException("Inserção falhou. tabela de Hash cheia.");
                }
            }

            hashTable[index] = key;
        } catch (IllegalAccessException err) {
            err.printStackTrace();
        }

    }

    public static void main(String[] args) {
        LinearProbingHash Hash_1 = new LinearProbingHash(5);

        int[] keyToInsert = {50, 70, 76, 85, 93};

        for(int key : keyToInsert ){
            Hash_1.insertItem(key);
        }
    }
}










/*
 * reference: code
 * 
 * package Hashing.open_addressing;
 * 
 * import java.util.Arrays;
 * 
 * public class LinearProbing {
 * private final int[] hashTable;
 * private final int TABLE_SIZE;
 * 
 * public LinearProbing(int size) {
 * TABLE_SIZE = size;
 * hashTable = new int[TABLE_SIZE];
 * // Inicializa a tabela de hash com -1, indicando slot vazio
 * Arrays.fill(hashTable, -1);
 * }
 * 
 * // Função de hash para mapear valores para a chave
 * public int hashFunction(int key) {
 * return key % TABLE_SIZE;
 * }
 * 
 * // Método para inserir uma chave na tabela de hash
 * public void insertItem(int key) {
 * int index = hashFunction(key);
 * int startIndex = index;
 * 
 * // Procura o próximo slot livre ou excluído
 * while (hashTable[index] != -1 && hashTable[index] != -2) {
 * index = (index + 1) % TABLE_SIZE;
 * if (index == startIndex) { // Se voltou ao início, a tabela está cheia
 * return;
 * }
 * }
 * 
 * hashTable[index] = key;
 * }
 * 
 * // Método para deletar uma chave da tabela de hash
 * public void deleteItem(int key) {
 * int index = hashFunction(key);
 * int startIndex = index;
 * 
 * // Procura a chave na tabela de hash
 * while (hashTable[index] != -1) {
 * if (hashTable[index] == key) {
 * hashTable[index] = -2; // Marca como excluído
 * return;
 * }
 * index = (index + 1) % TABLE_SIZE;
 * if (index == startIndex) { // Se voltou ao início, a chave não está presente
 * return;
 * }
 * }
 * }
 * 
 * // Método para exibir a tabela de hash
 * public void displayHash() {
 * for (int i = 0; i < TABLE_SIZE; i++) {
 * if (hashTable[i] != -1 && hashTable[i] != -2) {
 * System.out.println("Slot " + i + ": " + hashTable[i]);
 * } else {
 * System.out.println("Slot " + i + ": Vazio");
 * }
 * }
 * }
 * 
 * // Programa principal
 * public static void main(String[] args) {
 * // Cria uma tabela de hash com sondagem linear
 * LinearProbing lpHash = new LinearProbing(5);
 * 
 * // Insere as chaves na tabela de hash
 * int[] keysToInsert = {50, 70, 76, 93};
 * for (int key : keysToInsert) {
 * lpHash.insertItem(key);
 * }
 * 
 * // Exibe a tabela de hash
 * lpHash.displayHash();
 * }
 * }
 * 
 */