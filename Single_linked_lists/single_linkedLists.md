
Referencias:
    link: https://github.com/LuisAraujo/Estrutura-de-Dados-em-Java#4---listas-simplesmente-encadeada
    link: https://saulo.arisa.com.br/wiki/index.php/Listas_Encadeadas_Simples

##  Entenda o que é uma lista encadeada
Listas Simplesmente Encadeadas são uma estrutura de dados que permite armazenar e manipular uma sequência de elementos de forma dinâmica, ou seja, sem precisar definir um tamanho fixo para ela. Cada elemento da lista é chamado de nó ou célula, e contém um valor e um ponteiro para o próximo nó da lista. O primeiro nó da lista é chamado de cabeça, e o último nó da lista é chamado de cauda. A cauda aponta para um valor nulo, indicando o fim da lista.

Para criar uma lista simplesmente encadeada em Java, podemos usar uma classe genérica chamada No, que representa um nó da lista. Essa classe tem dois atributos: valor e next. O atributo valor armazena o dado do nó, que pode ser de qualquer tipo (por isso usamos o parâmetro <T>). O atributo next armazena o endereço do próximo nó da lista, que é outro objeto da classe No. A classe No também tem um construtor que recebe um valor como parâmetro e o atribui ao atributo value, e inicializa o atributo next como null. Além disso, a classe No tem um método setNext que recebe um objeto da classe No como parâmetro e o atribui ao atributo next.

Veja um exemplo de código da classe No:

```
// Primeiro, definimos uma classe chamada No, que representa uma célula da lista
    public class No<T> {
        private T valor; // O valor da célula, que nesse caso é uma string
        private No next; // O endereço da próxima célula, que é outro objeto da classe No

        public No(T value) {
        this.value = value; // O construtor recebe um valor como parâmetro e o atribui ao atributo value
        this.next = null; // Inicialmente, o ponteiro é nulo
        }

    //Este método define o próximo nó da lista encadeada
        public void setNext(No<T> value) {
            this.next = value; // O método setNext recebe um objeto da classe No como parâmetro e o atribui ao atributo next
        }
    }

```


Depois, criamos três objetos da classe No dentro da classe main principal, cada um com um valor diferente
```
    No celula1 = new No(); // Criamos a primeira célula
    celula1.valor = "Bing"; // Colocamos o valor "Bing" nela
    No celula2 = new No(); // Criamos a segunda célula
    celula2.valor = "AI"; // Colocamos o valor "AI" nela
    No celula3 = new No(); // Criamos a terceira célula
    celula3.valor = "Web"; // Colocamos o valor "Web" nela
```
Agora, precisamos ligar as células entre si, usando os endereços
```
    celula1.proximo = celula2; // Fazemos a primeira célula apontar para a segunda
    celula2.proximo = celula3; // Fazemos a segunda célula apontar para a terceira
    celula3.proximo = null; // Fazemos a terceira célula apontar para NULL
```
Pronto, temos uma lista encadeada com três células: celula1 -> celula2 -> celula3 -> NULL


Vamos criar um metodo que imprime os valores da lista encadeada dentro da classe No:

    ```
        public void printList() {
            String listLinked = "";
            No aux = this; // Criamos uma variável auxiliar que aponta para o primeiro nó da lista
            while (aux != null) { // Enquanto não chegar no último nó, avançar na lista
                listLinked += aux.value + " -> "; // Imprime o valor do nó atual
                aux = aux.next; // Atualiza a variável auxiliar para apontar para o próximo nó da lista
            }
            System.out.println(listLinked + "NULL"); // Imprime a lista e o  NULL no final da lista
        }
    ```


## INSERCAO NO INICIO DA LISTA

Inserir um elemento no início da lista significa colocar uma nova célula na primeira posição da lista, empurrando as outras células para trás. Para fazer isso, precisamos seguir três passos:

1º Criar a nova célula com o valor que queremos inserir. Podemos usar o construtor da classe No para isso, passando o valor como parâmetro.

2º Fazer a nova célula apontar para a primeira célula da lista original. Para isso, usamos o atributo proximo da nova célula e atribuímos a ele o valor da referência inicio, que guarda o endereço da primeira célula da lista original.

3º Fazer a referência inicio apontar para a nova célula. Para isso, atribuímos à referência inicio o valor da referência no, que guarda o endereço da nova célula.
Veja o exemplo de código abaixo:

Criamos uma classe Lista que tem uma referência inicio do tipo No
```
class Lista<T> {
    No inicio; // Referência para o início da lista

    // Definimos o método inserirInicio, que recebe um objeto da classe No como parâmetro
   public  void inserirInicio(No no) {
        no.proximo = inicio; // Fazemos a nova célula apontar para a primeira célula da lista original
        inicio = no; // Fazemos a referência inicio apontar para a nova célula
    }
}
```

Dentro da classe No Criamos um construtor
```
class No<T> {
    private T value; // O valor da célula
    private No proximo; // O ponteiro da próxima célula

//Construtor que recebe um valor como parâmetro e o atribui ao atributo value
    public No(T value) {
        this.value = value;
    }
}
```

Criamos um objeto da classe Lista dentro da classe main principal
```
Lista lista = new Lista();

// Inserimos três células na lista, usando o método inserirInicio
lista.inserirInicio(new No("Web")); // A lista fica: Web -> NULL
lista.inserirInicio(new No("AI")); // A lista fica: AI -> Web -> NULL
lista.inserirInicio(new No("Bing")); // A lista fica: Bing -> AI -> Web -> NULL
```
OBS: Por causa do construtor da classe No, agora passamos os valores como parametro quando istanciamos um objeto da classe No. Antes do construtor faziamos:
        No celula1 = new No();
        celula1.value = "Bing";



## INSERCAO NO FIM DA LISTA

Uma lista encadeada é uma estrutura de dados que armazena uma sequência de elementos chamados nós. Cada nó tem um valor e um ponteiro que aponta para o próximo nó da lista. O primeiro nó da lista é chamado de início e o último nó é chamado de fim. O fim da lista é indicado por um ponteiro nulo.

Para inserir um novo nó no final da lista, precisamos fazer três passos:

Criar o novo nó com o valor desejado;
Percorrer a lista até encontrar o último nó, que é aquele que tem o ponteiro proximo nulo;
Fazer o ponteiro proximo do último nó apontar para o novo nó.
Veja um exemplo de código em Java que faz isso:

// Classe genérica que representa um nó da lista
class No<T> {
    T valor; // Valor armazenado no nó
    No proximo; // Ponteiro para o próximo nó

    // Construtor que recebe o valor do nó
    public No(T valor) {
        this.valor = valor;
        this.proximo = null; // Inicialmente, o ponteiro é nulo
    }
}



// Classe genérica que representa uma lista encadeada
class Lista<T> {
    No<T> inicio; // Ponteiro para o início da lista

    // Construtor que cria uma lista vazia
    public Lista() {
        this.inicio = null; // Inicialmente, o início é nulo
    }

    // Método que insere um nó no final da lista
    public void inserirNoFinal(T valor) {
        No<T> novo_no = new No<T>(valor); // Cria o novo nó com o valor desejado
        // Se a lista estiver vazia, inserir no início
        if (inicio == null) {
            inicio = novo_no;
            return;
        }
        // Criar uma variável auxiliar para percorrer a lista
        No<T> auxiliar = inicio;
        // Enquanto não chegar no último nó, avançar na lista
        while (auxiliar.proximo != null) {
            //atualizamos a variável auxiliar para apontar para o próximo nó da lista. Para isso, usamos o atributo proximo da variável auxiliar.
            auxiliar = auxiliar.proximo;
        }
        // Fazer o ponteiro proximo do último nó apontar para o novo nó
        auxiliar.proximo = novo_no;
    }
}

@params  definimos a classe No que representa um nó da lista.
@params  Definimos o construtor da classe No que recebe o valor do nó como parâmetro. Esse construtor atribui esse valor ao atributo valor e inicializa o atributo proximo com null, indicando que não há nenhum outro nó após esse.


@params definimos a classe Lista que representa uma lista encadeada.
@params definimos o construtor da classe Lista que cria uma lista vazia. Esse construtor inicializa o atributo inicio com null, indicando que não há nenhum nó na lista.
@params definimos o método inserirNoFinal que recebe o valor do nó a ser inserido no final da lista como parâmetro. Esse método cria um novo nó com esse valor e o insere na lista seguindo os três passos descritos anteriormente.
@params Variável auxiliar : A variável No<T> auxiliar  é uma referência a um objeto da classe No<T>. Isso significa que ela aponta para um espaço na memória onde está armazenado um objeto da classe No<T>
@params NO if da classe Lista verificamos se a lista está vazia, ou seja, se o atributo inicio é null. Se for, inserimos o novo nó no início da lista, fazendo o atributo inicio apontar para ele. Em seguida, retornamos do método, pois não há mais nada a fazer.
@params criamos uma variável auxiliar para percorrer a lista. Essa variável recebe o valor do atributo inicio, ou seja, aponta para o primeiro nó da lista.
@params iniciamos um laço while que se repete enquanto a variável auxiliar não chegar no último nó da lista. Para saber se chegamos no último nó, verificamos se o atributo proximo da variável auxiliar é null. Se não for, significa que ainda há outro nó após esse.


# # INSERINDO DE FORMA ORDENADA # # 
- A inserção ordenada em lista encadeada é uma operação que insere um novo nó na lista de forma que ele seja mantido em ordem crescente, de acordo com o valor armazenado no nó.
-Para realizar a inserção ordenada, precisamos percorrer a lista até encontrar o nó anterior ao local onde o novo nó deve ser inserido. Em seguida, configuramos o ponteiro proximo do nó anterior para apontar para o novo nó.

código: 
public void inserirNoMeio(T valor) {
  No novo_no = new No(valor);

  // No início, o auxiliar aponta para o primeiro nó da lista
  No<T> auxiliar = primeiro;
  No<T> auxiliar2 = null;

  // Enquanto o auxiliar não for nulo e o valor do auxiliar for menor ou igual ao valor do novo nó
  while (auxiliar != null && auxiliar.obterValor().compareTo(novo_no.obterValor()) == -1) {
    // Avançamos o auxiliar para o próximo nó
    auxiliar2 = auxiliar
    auxiliar = auxiliar.obterProximo();
  }

  // O auxiliar agora aponta para o nó anterior ao local onde o novo nó deve ser inserido

  // Configuramos o ponteiro `proximo` do auxiliar2 para apontar para o novo nó, mas antes verifica-se se  a lista está vazia. Se estiver, o novo nó é inserido no início da lista.

    if(this.primeiro == null){
        this.primeiro = novo_no;
    } 
    else{
        novo_no.proximo = null;
        auxiliar2.proximo = novo_no;
    }
}

@params compareTo() -> Um valor: 0 se a cadeia de caracteres for igual à outra cadeia de caracteres.
< 0 se a cadeia for lexicograficamente menor que a outra cadeia > 0 se a cadeia for lexicograficamente maior que a outra cadeia
@params variavel auxiliar2 -> A linha auxiliar2.proximo = novo_no; configura o ponteiro proximo do auxiliar2 para apontar para o novo nó. Isso faz com que o novo nó seja inserido na posição correta, independentemente de ele ser maior que todos os outros nós da lista.


@params WHILE -> O loop while() verifica se o auxiliar é diferente de nulo e se o valor do auxiliar é menor ou igual ao valor do novo nó. Se for o caso, o auxiliar é atualizado para apontar para o próximo nó.

No final da execução do loop, o auxiliar aponta para o nó anterior ao local onde o novo nó deve ser inserido.

A linha auxiliar.proximo(novo_no); configura o ponteiro proximo do auxiliar para apontar para o novo nó. Isso faz com que o novo nó seja inserido na lista, na posição correta.

Explicação didática

Imagine que a lista esteja ordenada da seguinte forma:

1
2
3
4
5
Para inserir o valor 6, precisamos percorrer a lista até encontrar o nó anterior ao local onde o novo nó deve ser inserido. No caso, o valor 6 deve ser inserido depois do valor 5. Portanto, o auxiliar deve apontar para o nó com o valor 5.

1
2
3
4
(5)
6
O loop while() irá executar as seguintes etapas:

O auxiliar é inicializado com o valor da variável primeiro, que é o primeiro nó da lista. Portanto, o auxiliar aponta para o nó com o valor 1.
O valor do auxiliar, 1, é menor ou igual ao valor do novo nó, 6. Portanto, o auxiliar é atualizado para apontar para o próximo nó.
O auxiliar agora aponta para o nó com o valor 2.
O valor do auxiliar, 2, é menor ou igual ao valor do novo nó, 6. Portanto, o auxiliar é atualizado para apontar para o próximo nó.
...
O auxiliar agora aponta para o nó com o valor 5.
O valor do auxiliar, 5, é menor que o valor do novo nó, 6. Portanto, o loop while() termina.
Após a execução do loop, o auxiliar aponta para o nó com o valor 5. Portanto, o novo nó deve ser inserido logo após o nó 5.

A linha auxiliar.proximo(novo_no); configura o ponteiro proximo do auxiliar para apontar para o novo nó. Isso faz com que o novo nó seja inserido na lista, na posição correta.

ATENCAO: 
Agora vamos imaginar que a lista possui nós e o meu nó é menor que o primeiro nó. Por exemplo, em uma lista: 2,3,5 e 6 (em ordem) eu desejo inseri o 1. O nosso loop iria parar na primeira comparação, pois "auxiliar.obterValor().compareTo(novo_no.obterValor() )" retornaria 1. Isso nos levaria a entrar no else e aí encontramos mais um problema, pois novo_no.proximo não poderia ser null. Ele deveria ser, na verdade primeiro. 

public void inserirNoMeio(T valor) { 
    No novo_no = new No(valor);

	No<T> auxiliar = primeiro;
	No<T> auxiliar2 = null;
	
	while((auxiliar != null) && ( auxiliar.obterValor().compareTo(novo_no.obterValor() )) == -1  )
	{
		auxiliar2 = auxiliar;
		auxiliar = auxiliar.proximo();
	}

 	if(this.primeiro == null) { 
		this.primeiro = novo_no;
	else{
        // antes o novo_no.proximo = null recibia nulo. 
		novo_no.proximo = this.primeiro
		auxiliar2.proximo = novo_no;
	}
}


ANTECAO:
Agora pense na última ocasião, onde a minha lista possui nós e eu quero inserir no meio de dois nós. Por exemplo, inserir o 4 (entre o 3 e o 5). Neste caso, auxiliar estaria em 5 e auxiliar2 em 3. Logicamente que o próximo do auxiliar2 será novo_no e o próximo de novo_no será 5.
Isso não seria possível com "novo_no.proximo = this.primeiro". 

 Então posso trocar "novo_no.proximo = this.primeiro" para "novo_no.proximo = auxiliar" e isso funcionaria nos dois caso: inserir antes de todos e no meio de dois nós.
O problema é que, caso o auxiliar seja o primeiro nó, auxiliar2 será null e isso ocasionaria um erro. Além disso, se queremos inserir no início, o "ponteiro" do primeiro deverá ser atualizado. Então vamos adicionar esse trecho: 
else if(auxiliar == this.primeiro) {		
		novo_no.inserirProximo(this.primeiro);
		this.primeiro = novo_no;
}

o código fica assim no final.


   public void inserirNoMeio(T  valor) {
	No<T> novo_no = new No<T>(valor);

	No<T> auxiliar = primeiro;
	No<T> auxiliar2 = null;
	
	while((auxiliar != null) && ( auxiliar.obterValor().compareTo(novo_no.obterValor() )) == -1  )
	{
		auxiliar2 = auxiliar;
		auxiliar = auxiliar.proximo();
	}

 	if(this.primeiro == null) { 
		this.primeiro = novo_no;
	}else if(auxiliar == this.primeiro) {	
		novo_no.proximo = this.primeiro;
		this.primeiro = novo_no;
	}else{
		novo_no.proximo = auxiliar; 
		auxiliar2.proximo = novo_no;
	}	 
}

Explicacao do código:
o código resolve esses problemas 

Problema 1: Inserção no início da lista

    A linha if(this.primeiro == null) { this.primeiro = novo_no; } verifica se a lista está vazia. Se estiver, o novo nó é inserido no início da lista.

    A linha novo_no.proximo = auxiliar; configura o ponteiro proximo do novo nó para apontar para o auxiliar. Isso significa que o novo nó será inserido antes do auxiliar, que é o primeiro nó da lista.

Problema 2: Inserção no meio da lista

    A linha else if(auxiliar == this.primeiro) { novo_no.inserirProximo(this.primeiro); this.primeiro = novo_no; } verifica se o auxiliar é o primeiro nó da lista. Se for, o novo nó é inserido no início da lista.

    A linha novo_no.inserirProximo(this.primeiro); configura o ponteiro proximo do novo nó para apontar para o primeiro nó da lista. Isso significa que o novo nó será inserido antes do primeiro nó da lista.

    A linha this.primeiro = novo_no; atualiza o ponteiro primeiro para apontar para o novo nó. Isso significa que o novo nó se torna o primeiro nó da lista.

Problema 3: Inserção no final da lista

    A linha else{ novo_no.proximo = auxiliar; auxiliar2.proximo = novo_no; } configura o ponteiro proximo do novo nó para apontar para o auxiliar. Isso significa que o novo nó será inserido após o auxiliar.

    A linha auxiliar2.proximo = novo_no; configura o ponteiro proximo do auxiliar2 para apontar para o novo nó. Isso significa que o novo nó se torna o próximo nó do auxiliar2.


# # Buscando na Lista # # 
 */