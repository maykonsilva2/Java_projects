package Java_Sintaxe_Ex;

import OOP_Interfaces.src.Carro;

public class App {
    public static void main(String[] args) {
        Carro volvo = new Carro("Volvo 2023");

        volvo.setId("0001");
        volvo.setFabricante("Fiat");
        volvo.setModelo("2023");

        System.out.println("Id: " + volvo.getId() + " Model:" + volvo.getModelo());

    }
}