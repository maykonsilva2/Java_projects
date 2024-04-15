package com.api.parkingcontrol.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.io.Serializable;

@Entity
@Table(name="TB_PARKING_SPOT")
public class ParkingSpotModel implements Serializable {
    public static  final long serialVersionUID = 1L;
}

/*
    #############    JPA  (Java Persistence API) ##################
- O JPA (Java Persistence API) é uma especificação padrão do Java para mapeamento objeto-relacional (ORM). Ele permite
que os desenvolvedores trabalhem com bancos de dados relacionais usando objetos Java.
O JPA simplifica a persistência de dados, permitindo que você modele suas entidades (objetos) e as relacione com tabelas no banco de dados.
A Anotação @Entity:
A anotação @Entity marca uma classe como uma entidade no contexto do JPA. Uma entidade representa uma tabela armazenada em um banco de dados.
Cada instância de uma entidade representa uma linha na tabela.

- O nome da tabela no banco de dados é especificado usando a anotação **@Table**

-O campo `id` é marcado com **@Id**, indicando que é a chave primária da entidade.
    - O valor da chave primária é gerado automaticamente usando a estratégia **GenerationType.IDENTITY**.


    ################## Serializable  e Serial version UID #########################
Serializable:
- A interface Serializable em Java é usada para marcar uma classe como serializável. Isso significa que os objetos dessa
classe podem ser convertidos em uma sequência de bytes e, posteriormente, restaurados a partir desses bytes.
Quando uma classe implementa a interface Serializable, ela concorda em seguir as regras de serialização do Java.

A serialização é útil quando você deseja salvar o estado de um objeto em um arquivo ou transmiti-lo pela rede.
No seu exemplo, a classe ParkingSpotModel implementa Serializable.
Serial Version UID:


-O número de versão serial (Serial Version UID) é um identificador único associado a uma classe serializável.
    Quando um objeto é serializado, o Java inclui o Serial Version UID no fluxo de bytes.
    Durante a desserialização, o Java verifica se o Serial Version UID no fluxo de bytes corresponde ao UID da classe local.
    Se os UIDs não coincidirem, ocorrerá uma exceção InvalidClassException.
    Definir manualmente o UID é uma boa prática para evitar problemas de compatibilidade entre diferentes versões da classe.

No código , o valor 1L é usado como o Serial Version UID para a classe ParkingSpotModel.
Em resumo, a interface Serializable permite que objetos sejam convertidos em bytes e vice-versa, enquanto o Serial Version
UID ajuda a garantir a compatibilidade durante a desserialização. Se você não especificar um UID, o Java gerará automaticamente
um com base na estrutura da classe, mas é recomendável definir manualmente para maior controle.
* */
