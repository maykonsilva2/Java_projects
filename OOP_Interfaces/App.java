package OOP_Interfaces;
import OOP_Interfaces.src.Carro;

public class App {
    public static void main(String args[]){
        Carro carro = new Carro("Fusca");
        carro.setNome("Fusca");
        carro.setId("123");
        carro.setModelo("Fusca");
        carro.setFabricante("Volkswagen");

        System.out.println("Nome: " + carro.getNome());
        System.out.println("Id: " + carro.getId());
        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Fabricante: " + carro.getFabricante());
        System.out.println("Numero de rodas: " + carro.getNumRodas());
    }
}
