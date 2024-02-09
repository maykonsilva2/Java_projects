package Stack_data_structure.src;

public class Stack<T> {
    private T[] arrayStack;
    private int topOfStack;

    @SuppressWarnings("unchecked")
    public Stack(int sizeMax)
    {
        this.arrayStack = (T[]) new Object[sizeMax];
        this.topOfStack = -1;
    }

    public T[] getArrayStack() { return this.arrayStack; }
    public int getTopOfStack() { return this.topOfStack; }
    
    public boolean IsEmpty() { return this.topOfStack == -1;}
    public boolean IsFull() { return this.topOfStack == this.arrayStack.length -1;}

    public boolean push(T element)
    {
        if(!this.IsFull())
        {
            this.topOfStack++;
            this.arrayStack[this.topOfStack] = element;
            return true;
        }
        return false;
    }

    public T pop()
    {
        if(!this.IsEmpty())
        {
            return this.arrayStack[topOfStack--];
        }

        return null;
    }

}

/*
 * reference link: http://www.bosontreinamentos.com.br/estruturas-de-dados/como-implementar-uma-pilha-em-java-usando-arrays/
 * reference link: https://github.com/LuisAraujo/Estrutura-de-Dados-em-Java
    
 @param  <T> é um tipo genérico que pode representar qualquer tipo de objeto. Ele é usado para criar classes que podem funcionar com diferentes tipos de dados sem precisar reescrever o código para cada tipo. Por exemplo, a classe PilhaV<T> pode ser usada para criar uma pilha de inteiros, uma pilha de strings, uma pilha de clientes, etc. O tipo <T> é especificado quando se cria uma instância da classe PilhaV<T>, como no exemplo abaixo:
 Criando uma pilha de inteiros PilhaV<Integer> pilhaInt = new PilhaV<Integer>();
Criando uma pilha de strings PilhaV<String> pilhaStr = new PilhaV<String>();
As classes genéricas permitem que o código seja mais reutilizável, seguro e fácil de manter.

@param  T[] significa um array de elementos do tipo T, que é o tipo genérico da classe. Isso significa que o array pode armazenar objetos de qualquer tipo que seja especificado quando se cria uma instância da classe PilhaV<T>.

@param o valor -1 ao atributo topOfStack significa que a pilha está inicialmente vazia, pois não há nenhum elemento na posição -1
@param O topo da pilha é sempre a última posição ocupada pelo vetor. Assim, se você tem 2 itens na pilha, o toOfStack é 1
@param      return this.arrayStack[topOfStack--];     Isso é chamado de decremento pós-fixado, que significa que o valor da variável é retornado  antes de ser decrementado. Se você quisesse fazer o decremento antes de retornar o elemento, você poderia usar o operador de decremento -- antes da variável topo. Isso é chamado de decremento pré-fixado, que significa que o valor da variável é decrementado antes de ser retornado ex: return this.arrayStack[--topOfStack];

@param (T[]) new Object[sizeMax]; cria um vetor do tipo Objetc e faz o cast (conversão) para o tipo T
 */
