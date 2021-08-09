# Java Collections

## Módulo 01 - java.util.List

* Implementações que aprenderemos
  * java.util.ArrayList
  * java.util.Vector
* Garante ordem de inserção
* Permite adição, atualização, leitura e remoção sem regras
adicionais.
* Permite ordenação atraves de comparators

## Módulo 02 - java.util.Queue

* Implementações que aprenderemos
  * java.util.LinkedList
* Garante a ordem de inserção
* Permite adição, leitura e remoção considerando a regra
básica de uma fila: Primeiro que entra, primeiro que sai.
* Não permite mudança de ordenação.

## Módulo 03 - java.util.Set

* Implementações que aprenderemos
  * java.util.HashSet
  * java.util.TreeSet
  * java.util.LinkedHashSet
* Por padrão, não garante a ordem
* Não permite itens repetidos
* Permite adição e remoção normalmente.
Não possui busca por item e atualização.
Para leitura, apenas navegação.
* Não permite mudança de ordenação

## Módulo 04 - java.util.Map

* Implementações que aprenderemos
  * java.util.HashMap
  * java.util.TreeMap
  * java.util.HashTable
* Entrada de chave e valor
* Permite valores repetidos, mas não permite repetição do de chave.
* Permite adição, busca por chave ou valor, atualização, remoção e navegação.
* pode ser ordenado

## Módulo 05 - java.util.Comparator

* Implementações que aprenderemos
  * java.util.Comparator - Interface para definir classe com regra de ordenação.
  * java.util.Comparable - Interface para definir regra de ordenação em uma classe
de domínio.
* Algoritimos de ordenação
* Utilizando primariamente em java.util.List
* Permite a ordenação de objetos complexos (criado pelos usuários)

## Módulo 06 - java.util.Optional

* Tratamento para valores que podem ser nulos
* Possui 2 estados
  * Presente
  * Vazio
* Premite que você execute operações em valores
que podem ser nulos sem preocupação com as famosas
NullPointerExceptions

## Módulo 07 - java.util.Stream

* Manipulação de coleções com o paradgima funcional de forma paralela
* Imutável - Não altera a coleção origem, sempre cria uma nova coleção
* Principais funcionalidade
  * Mapping - Retorna uma coleção com mesmo tamanho da origem com os elementos alterados
  * Filtering - Retorna uma coleção igual ou menor que a coleção origem, com os elementos intactos.
  * ForEach - Excuta uma determinada lógica para cada elemento, retornando nada
  * Peek - Executa uma determinada lógica para cada elemento, retornando a própia coleção
  * Grouping - Retorna uma coleção agrupada de acordo com a regra definida