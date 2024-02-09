package OOP_Interfaces.src;

interface Motor { // Por padrão, uma interface é public e abstract, ou seja, não precisa colocar essas palavras reservadas.
                // Por padrão, as variáveis de interface são public, static e final.

    public abstract String getModelo();
    public abstract String getFabricante();
    // Esses métodos não tem corpo, ou seja, não tem implementação. Eles podem ter comportamentos diferentes dependendo da classe que os implementa.
    // Uma interface pode ter apenas métodos e constantes, não pode ter atributos, construtores ou métodos com corpo, os métodos devem ser public, sendo assim, o modificador de acesso de um método herdado de uma interface deve ser public.
    // Exemplo de constantes: 
    //          public static final String nome = "Joao";
    // Sempre coloque o final na frente do tipo, pois assim torna ela uma constante, ou seja, não pode ser alterada.
}
