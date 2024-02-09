I'll try to explain the subject of fields, methods, and constructors in enums in a way that a beginner in programming can understand. 

Enums are a special type of class that can have a fixed set of values. For example, we can define an enum called PizzaStatus that has three possible values: ORDERED, READY, and DELIVERED. These values are called enum constants, and they are separated by commas.

```java
public enum PizzaStatus {
    ORDERED,
    READY,
    DELIVERED
}
```

We can use enums to represent the state of an object, such as a pizza order. For example, we can create a class called Pizza that has a field called status of type PizzaStatus. We can also define methods that set and get the status of the pizza.

```java
public class Pizza {

    private PizzaStatus status;

    public void setStatus(PizzaStatus status) {
        this.status = status;
    }

    public PizzaStatus getStatus() {
        return this.status;
    }
}
```

We can create an instance of the Pizza class and assign it one of the enum constants as its status. For example, we can create a pizza object called testPz and set its status to READY.

```java
Pizza testPz = new Pizza();
testPz.setStatus(PizzaStatus.READY);
```

We can also compare the status of the pizza object with the enum constants using the == operator or the equals method. For example, we can check if the pizza is ready by comparing its status with PizzaStatus.READY.

```java
if (testPz.getStatus() == PizzaStatus.READY) {
    // do something
}

if (testPz.getStatus().equals(PizzaStatus.READY)) {
    // do something
}
```

However, enums can do more than just hold values. They can also have fields, methods, and constructors, which makes them very powerful.

Fields are variables that belong to each enum constant. For example, we can add a field called timeToDelivery to the PizzaStatus enum that stores the estimated time to deliver the pizza in minutes.

```java
public enum PizzaStatus {
    ORDERED,
    READY,
    DELIVERED;

    private int timeToDelivery;

    public int getTimeToDelivery() {
        return timeToDelivery;
    }

    public void setTimeToDelivery(int timeToDelivery) {
        this.timeToDelivery = timeToDelivery;
    }
}
```

We can access and modify the fields of each enum constant using the dot operator. For example, we can set the time to delivery for each pizza status as follows:

```java
PizzaStatus.ORDERED.setTimeToDelivery(5);
PizzaStatus.READY.setTimeToDelivery(2);
PizzaStatus.DELIVERED.setTimeToDelivery(0);
```

We can also get the time to delivery for each pizza status using the getter method:

```java
System.out.println(PizzaStatus.ORDERED.getTimeToDelivery()); // prints 5
System.out.println(PizzaStatus.READY.getTimeToDelivery()); // prints 2
System.out.println(PizzaStatus.DELIVERED.getTimeToDelivery()); // prints 0
```

Methods are functions that belong to each enum constant. They can be abstract or concrete, and they can override methods from the Object class or from interfaces. For example, we can add three abstract methods to the PizzaStatus enum that check if the pizza is ordered, ready, or delivered.

```java
public enum PizzaStatus {
    ORDERED,
    READY,
    DELIVERED;

    private int timeToDelivery;

    public abstract boolean isOrdered();

    public abstract boolean isReady();

    public abstract boolean isDelivered();

    // other methods omitted for brevity
}
```

We need to provide an implementation for each abstract method in each enum constant using an anonymous class. For example, we can implement the isOrdered method for ORDERED as follows:

```java
ORDERED {
    @Override
    public boolean isOrdered() {
        return true;
    }
},
```

Similarly, we can implement the other methods for each enum constant as follows:

```java
READY {
    @Override
    public boolean isReady() {
        return true;
    }
},
DELIVERED {
    @Override
    public boolean isDelivered() {
        return true;
    }
},

```

- NOTE: o que fazem esses parâmetros numéricos (5) (2) (0) e porque em seguida tem { } chamando as funções. Esses parâmetros são usados para inicializar o campo timeToDelivery de cada valor enum. Eles representam o tempo estimado em minutos para entregar a pizza de acordo com o status do pedido. Por exemplo, o valor enum ORDERED tem o parâmetro 5, que significa que uma pizza com esse status leva cerca de 5 minutos para ser entregue.

Os { } depois dos parâmetros são usados para definir uma classe anônima para cada valor enum. Uma classe anônima é uma forma de criar uma subclasse sem dar um nome explícito. Ela serve para implementar ou sobrescrever métodos específicos para cada valor enum. Por exemplo, o valor enum ORDERED tem uma classe anônima que sobrescreve o método isOrdered, que retorna verdadeiro se o status é ORDERED.

Portanto, cada valor enum é na verdade uma instância de uma subclasse de PizzaStatus, que tem um campo timeToDelivery e um método isOrdered específicos. O mesmo vale para os outros valores enum, que têm seus próprios parâmetros, campos e métodos.


We can use these methods to check the state of each pizza status without using if or switch statements. For example, we can check if a pizza status is ready by calling the isReady method on it.

```java
PizzaStatus status = PizzaStatus.ORDERED;
System.out.println(status.isReady()); // prints false

status = PizzaStatus.READY;
System.out.println(status.isReady()); // prints true
```

Constructors are special methods that are used to initialize each enum constant. They are always private and cannot be invoked explicitly. They are invoked automatically when the enum constants are created. For example, we can add a constructor to the PizzaStatus enum that takes an int parameter and assigns it to the timeToDelivery field.

```java
public enum PizzaStatus {
    ORDERED,
    READY,
    DELIVERED;

    private int timeToDelivery;

    // constructor
    PizzaStatus(int timeToDelivery) {
        this.timeToDelivery = timeToDelivery;
    }

    // other methods omitted for brevity
}

```

We can specify the value of the timeToDelivery parameter for each enum constant in parentheses after the constant name. For example, we can assign 5 minutes to ORDERED, 2 minutes to READY, and 0 minutes to DELIVERED as follows:

```java
This code is AI-generated. Review and use carefully. Visit our FAQ for more information.

public enum PizzaStatus {
    ORDERED(5),
    READY(2),
    DELIVERED(0);

    private int timeToDelivery;

    // constructor
    PizzaStatus(int timeToDelivery) {
        this.timeToDelivery = timeToDelivery;
    }

    // other methods omitted for brevity
}
```

This way, we don’t need to call the setTimeToDelivery method for each enum constant separately. The constructor will do it for us automatically.




## Explicação do trecho com comentarios na linhas:
O código é sobre uma classe chamada Pizza que representa um pedido de pizza e tem um campo chamado status que é do tipo PizzaStatus. PizzaStatus é um tipo especial de classe chamado enum, que pode ter um conjunto fixo de valores. Neste caso, os valores possíveis são ORDERED, READY e DELIVERED, que representam as etapas do pedido de pizza.

```Java
public class Pizza {

    private PizzaStatus status; // declara um campo privado chamado status do tipo PizzaStatus
    public enum PizzaStatus { // define um tipo enum chamado PizzaStatus
        ORDERED (5){ // define um valor enum chamado ORDERED com um parâmetro 5
            @Override // indica que o método abaixo sobrescreve um método da classe pai ou de uma interface
            public boolean isOrdered() { // define um método que retorna verdadeiro se o status é ORDERED
                return true;
            }
        },
        READY (2){ // define um valor enum chamado READY com um parâmetro 2
            @Override
            public boolean isReady() { // define um método que retorna verdadeiro se o status é READY
                return true;
            }
        },
        DELIVERED (0){ // define um valor enum chamado DELIVERED com um parâmetro 0
            @Override
            public boolean isDelivered() { // define um método que retorna verdadeiro se o status é DELIVERED
                return true;
            }
        };

        private int timeToDelivery; // declara um campo privado chamado timeToDelivery do tipo int

        public boolean isOrdered() {return false;} // define um método padrão que retorna falso se o status é ORDERED

        public boolean isReady() {return false;} // define um método padrão que retorna falso se o status é READY

        public boolean isDelivered(){return false;} // define um método padrão que retorna falso se o status é DELIVERED

        public int getTimeToDelivery() { // define um método que retorna o valor do campo timeToDelivery
            return timeToDelivery;
        }

        PizzaStatus (int timeToDelivery) { // define um construtor que recebe um parâmetro do tipo int e atribui ao campo timeToDelivery
            this.timeToDelivery = timeToDelivery;
        }
    }

    public boolean isDeliverable() { // define um método que retorna verdadeiro se o status da pizza é READY
        return this.status.isReady();
    }

    public void printTimeToDeliver() { // define um método que imprime na tela o tempo estimado para entregar a pizza
        System.out.println("Time to delivery is " + 
          this.getStatus().getTimeToDelivery());
    }
    
    // Methods that set and get the status variable.
}
```
O trecho de código abaixo demonstra como isso funciona:

```Java
@Test // indica que o método abaixo é um teste unitário
public void givenPizaOrder_whenReady_thenDeliverable() { // define um método de teste que verifica se uma pizza está pronta para ser entregue quando seu status é READY
    Pizza testPz = new Pizza(); // cria uma instância da classe Pizza chamada testPz
    testPz.setStatus(Pizza.PizzaStatus.READY); // atribui o valor enum READY ao campo status de testPz
    assertTrue(testPz.isDeliverable()); // verifica se o método isDeliverable de testPz retorna verdadeiro
}
```