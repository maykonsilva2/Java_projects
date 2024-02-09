Uma classe abstrata é uma classe que não pode ser instanciada, ou seja, não podemos criar objetos a partir dela. Uma classe abstrata serve como um modelo para outras classes que podem herdar seus atributos e métodos. Uma classe abstrata pode ter métodos abstratos e concretos. Um método abstrato é um método que é declarado sem uma implementação, ou seja, sem um corpo. Um método concreto é um método que tem uma implementação, ou seja, um corpo.

No exemplo acima, a classe Animal é uma classe abstrata que tem um método abstrato chamado animalSound() e um método concreto chamado sleep(). O método animalSound() não tem um corpo, pois cada animal pode emitir um som diferente. O método sleep() tem um corpo, pois todos os animais dormem de forma semelhante.

Como a classe Animal é abstrata, não é possível criar um objeto dela:

Java
This code is AI-generated. Review and use carefully. Visit our FAQ for more information.
```java
Animal meuObj = new Animal(); // vai gerar um erro

```
Para acessar a classe abstrata, ela deve ser herdada por outra classe. Vamos converter a classe Animal que usamos no capítulo de Polimorfismo para uma classe abstrata:

Java
This code is AI-generated. Review and use carefully. Visit our FAQ for more information.

```java
// Classe abstrata
abstract class Animal {
  // Método abstrato (não tem corpo)
  public abstract void animalSound();
  // Método concreto (tem corpo)
  public void sleep() {
    System.out.println("Zzz");
  }
}

// Subclasse (herda da classe Animal)
class Porco extends Animal {
  public void animalSound() {
    // O corpo do método animalSound() é fornecido aqui
    System.out.println("O porco faz: wee wee");
  }
}

class Main {
  public static void main(String[] args) {
    Porco meuPorco = new Porco(); // Cria um objeto Porco
    meuPorco.animalSound(); // Chama o método abstrato
    meuPorco.sleep(); // Chama o método regular
  }
}

```
Lembre-se do capítulo de Herança que usamos a palavra-chave extends para herdar de uma classe.

No código acima, criamos uma subclasse chamada Porco que herda da classe abstrata Animal. A subclasse deve fornecer a implementação do método abstrato animalSound(). Se não fizer isso, a subclasse também será abstrata e não poderá ser instanciada.

###  :warning: NOTE: Como e quando usar classes abstratas e métodos abstratos?
- Para alcançar segurança - escondendo certos detalhes e mostrando apenas os detalhes importantes de um objeto.
- Abstraction pode ser usado também com Interfaces.