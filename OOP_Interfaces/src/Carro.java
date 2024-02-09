package OOP_Interfaces.src;

// Uma classe pode implementar mais de uma interface, mas não pode extender mais de uma classe.
// Usa-se a palavra reservada implements para implementar uma interface.
// Para sobrescrever um método de uma interface, usa-se a palavra reservada @Override.
public class Carro implements Veiculo, Motor {

    private String nome;
    private String id;
    private String modelo;
    private String fabricante;

    public Carro(String nome){ 
        this.nome = nome;
    }
    
    // Metodos Veiculo
    @Override
    public String getNome(){ return this.nome; }
    public void setNome(String nome){ this.nome = nome; }
    
    @Override
    public String getId(){ return this.id; }
    public void setId(String id){ this.id = id; }

    // Metodos Motor
    @Override
    public String getModelo(){  return this.modelo; }
    public void setModelo(String modelo){ this.modelo = modelo; }
    
    @Override
    public String getFabricante(){ return this.fabricante; }
    public void setFabricante(String fabricante){ this.fabricante = fabricante; }

    public int getNumRodas(){ return NUMERO_DE_RODAS; } // Acessando a constante da interface Veiculo, não precisa colocar Override.

}
