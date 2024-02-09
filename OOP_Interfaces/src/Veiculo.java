package OOP_Interfaces.src;

public interface Veiculo {//Por padrão, as variáveis de interface são public, static e final.

    int NUMERO_DE_RODAS = 4; // Por padrão, as variáveis de interface são public, static e final(ou seja, não podem ser alteradas, são constantes).

    public abstract String getNome();
    public abstract String getId();
    // Esses métodos não tem corpo, ou seja, não tem implementação. Eles podem ter comportamentos diferentes dependendo da classe que os implementa.
    // Uma interface pode ter apenas métodos e constantes, não pode ter atributos, construtores ou métodos com corpo.
    // Exemplo de constantes: 
    //          public static final String nome = "Joao";
    // Sempre coloque o final na frente do tipo, pois assim torna ela uma constante, ou seja, não pode ser alterada.
//Classe abstract: é uma classe restrita que não pode ser utilizada para criar objetos (para acessá-la deve ser herdada de outra classe). 
//Método abstract: só pode ser usado em uma classe abstrata e não possui corpo. O corpo é fornecido pela subclasse (herdado de).

}
