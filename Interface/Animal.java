package Interface;

interface Animal {
    public void animalSound(); // você não precisa usar a palavra-chave abstract ou public, pois todos os métodos da interface são abstract e public por padrão.
    public abstract void sleep(); // Mas, se você quiser deixar claro que os métodos são abstract, você pode usar o modificador abstract explicitamente 
}
