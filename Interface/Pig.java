package Interface;

public class Pig implements Animal {
    @Override
    public void animalSound(){
        System.out.println("The pig says: wee wee");
    };
    @Override
    public void sleep(){
        System.out.println("Zzz");
    };
}

// NOTE: Se você não usar @Override, o código ainda funcionará, mas você perderá os benefícios da anotação. Por exemplo, se você digitar errado o nome do método ou mudar o tipo de retorno, o compilador não irá avisá-lo de que você não está sobrescrevendo o método da interface corretamente.
//Ao usar @Override, você está dizendo ao compilador que esses métodos são redefinições dos métodos da interface Animal.
// lembre-se interface não contém um construtor, portanto, você não pode criar um objeto de uma interface.