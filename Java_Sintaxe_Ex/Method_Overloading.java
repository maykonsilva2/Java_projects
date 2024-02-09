package Java_Sintaxe_Ex;

public class Method_Overloading {
    public static void main(String args[]) {
    }

    static int plusMethod(int number_1, int number_2) { return number_1 + number_2; }
    static int plusMethod(int number_1, int number_2, int number_3) { return number_1 + number_2 + number_3; }
    static double plusMethod( double number_1, double number_2) { return number_1 + number_2; }

    /*
     * Method overloading allows multiple methods with the same name but different paramenters.
     * It´s can simplify the code and avoid repetition of similar methods
     * The type and/or number of parameters determine which method is called
     * 

public class Main {

    public static void main(String[] args) {
        // Cria um objeto da classe Calculadora
        Calculadora calc = new Calculadora();

        // Chama o método soma que recebe dois inteiros
        int resultado1 = calc.soma(3, 5); // resultado1 = 8

        // Chama o método soma que recebe dois doubles
        double resultado2 = calc.soma(3.5, 4.2); // resultado2 = 7.7

        // Chama o método soma que recebe três inteiros
        int resultado3 = calc.soma(2, 4, 6); // resultado3 = 12

        // Imprime os resultados na tela
        System.out.println("Resultado1: " + resultado1);
        System.out.println("Resultado2: " + resultado2);
        System.out.println("Resultado3: " + resultado3);
    }
}
     */
}
