import java.util.ArrayList;
import java.util.Scanner;

public class ListaNumeros {

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        // Lê os números digitados pelo usuário até que ele digite "exit"
        System.out.println("Digite os números que deseja adicionar à lista (Digite 'exit' para terminar):");
        int numero;
        while (true) {
            if (sc.hasNextInt()) {
                numero = sc.nextInt();
                lista.add(numero);
            } else if (sc.hasNext()) {
                String input = sc.next();
                if (input.equalsIgnoreCase("exit")) {
                    break;
                }
            }
        }

        sc.close();

        System.out.println("Os números armazenados na lista:");
        for (int n : lista) {
            System.out.print(n + " ");
        }
        System.out.println();
        
        int soma = 0;
        for (int n : lista) {
            soma += n;
        }
        System.out.println("A soma total dos números na lista é: " + soma);
    }
}