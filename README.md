# Questão Teórica

## Questão 04

Um array de primitivos guarda os valores diretamente. Um array de objetos guarda referências (endereços) que apontam para objetos em outro lugar da memória.

a ) O array de primitivos é criado no heap e cada posição já contém o próprio valor, todas começam com o valor padrão do tipo 0 para `int`, 0.0 para `double`, false para `boolean`. A memória fica contígua e pronta para uso assim que o array é criado.

No array de objetos ao criar o array, só se aloca espaço para as referências, e todas começam como null, nenhum objeto existe ainda, cada objeto precisa ser criado separadamente e ocupa seu próprio espaço no heap, e a posição do array apenas aponta para ele. Ou seja, o array funciona como uma lista de "ponteiros".

b ) 1. NullPointerException: como as posições começam como `null`, usar um elemento que ainda não foi instanciado quebra o programa. Antes de acessar, é preciso garantir que o objeto foi criado ou verificar se a posição não é `null`.

2. Índice fora do limite: vale para qualquer array. Os índices vão de 0 até tamanho menos 1, e acessar fora disso gera `ArrayIndexOutOfBoundsException`.

3. Cópia rasa: copiar um array de objetos (por exemplo, com `clone()`) copia só as referências, não os objetos. Os dois arrays passam a apontar para os mesmos objetos, então alterar um objeto por um array reflete no outro.

4. Comparação com `==`: compara referências, ou seja, se são o mesmo objeto, e não se têm o mesmo conteúdo. Para comparar o conteúdo, deve-se usar o método `equals()`.
