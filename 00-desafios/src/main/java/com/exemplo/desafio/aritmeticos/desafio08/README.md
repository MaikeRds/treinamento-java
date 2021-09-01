# Desafio - Uniformes de final de ano

O professor Girafales organizou a confecção de um uniforme para as turmas 
da escola para comemorar o final do ano. Após algumas conversas, ficou 
decidido com os alunos que eles poderiam escolher a cor do uniforme entre 
branco ou vermelho. Assim sendo, Girafales precisa de sua ajuda para organizar 
as listas de quem quer o uniforme em cada uma das turmas, relacionando estas 
camisetas pela cor, tamanho (P, M ou G) e por último pelo nome.

## Entrada
Cada caso de teste inicia com um valor **N**, (1 ≤ **N** ≤ 60) inteiro e positivo, 
que indica a quantidade de uniformes a serem feitas para aquela turma. 
As próximas **N***2 linhas contém informações de cada um dos uniformes 
(serão duas linhas de informação para cada uniforme). A primeira linha 
irá conter o nome do estudante e a segunda linha irá conter a cor do 
uniforme ("branco" ou "vermelho") seguido por um espaço e pelo tamanho 
do uniforme "P" "M" ou "G". A entrada termina quando o valor de **N** for 
igual a zero (0) e esta valor não deverá ser processado.

## Saída
Para cada caso de entrada deverão ser impressas as informações ordenadas 
pela cor em ordem ascendente, seguido pelos tamanhos em ordem descendente 
e por último por ordem ascendente de nome, conforme o exemplo abaixo.

Exemplo de Entrada | Exemplo de Saída
------------------ | -----------------
9                  | branco P Cezar Torres
Maria Jose         | Mo
branco P           | branco P Maria Jose
Mangojata Mancuda  | branco M JuJu Mentina
vermelho P         | branco G Adabi Finho
Cezar Torres Mo    | branco G Severina
branco P           | Rigudinha
Baka Lhau          | vermelho P Amaro
vermelho P         | Dinha
JuJu Mentina       | vermelho P Baka Lhau
branco M           | vermelho P Carlos
Amaro Dinha        | Chade Losna
vermelho P         | vermelho P Mangojata
Adabi Finho        | Mancuda
branco G           |
Severina Rigudinha |
branco G           |
Carlos Chade Losna |
vermelho P         |
0                  |
 
