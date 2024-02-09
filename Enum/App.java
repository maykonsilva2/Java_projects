package Enum;

import Enum.Pizza.PizzaStatus;

public class App {
    public static void main(String args[]) {
        Pizza testPz = new Pizza();

        testPz.setStatus(PizzaStatus.READY);

        if(testPz.getStatus() == PizzaStatus.READY) {
            System.out.println("Pizza ready!");
        } else {
            System.out.println("Pizza is being prepared");
        }
    }
}
