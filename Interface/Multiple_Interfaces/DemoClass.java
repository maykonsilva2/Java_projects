package Interface.Multiple_Interfaces;

public class DemoClass implements FirstInterface, SecondeInterface {
    @Override
    public void myMethod() {
        System.out.println("Some text...");
    }
    @Override
    public void myOtherMethod() {
        System.out.println("Some other text...");
    }
}

// NOTE: Java não suporta herança múltipla, mas pode ser alcançada com interfaces, porque a classe pode implementar várias interfaces.
// Para implementar várias interfaces, separe-as com vírgulas: