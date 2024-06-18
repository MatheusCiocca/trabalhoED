A estabilidade em algoritmos de ordenação refere-se à preservação da ordem relativa dos elementos iguais durante a ordenação. Isso é importante quando os elementos têm atributos adicionais além do valor usado para a ordenação.

Exemplo com o Vetor [7, 1, 1, 3, 2]

Bubble Sort: Passo a Passo

Vetor inicial: [7, 1, 1, 3, 2]

1. Primeira Passagem:
   Comparar 7 e 1: Troca [1, 7, 1, 3, 2]
   Comparar 7 e 1: Troca [1, 1, 7, 3, 2]
   Comparar 7 e 3: Troca [1, 1, 3, 7, 2]
   Comparar 7 e 2: Troca [1, 1, 3, 2, 7]

   Estado do vetor: [1, 1, 3, 2, 7]

2.  Segunda Passagem:
   Comparar 1 e 1: Nenhuma troca [1, 1, 3, 2, 7]
   Comparar 1 e 3: Nenhuma troca [1, 1, 3, 2, 7]
   Comparar 3 e 2: Troca [1, 1, 2, 3, 7]
   Comparar 3 e 7: Nenhuma troca [1, 1, 2, 3, 7]

   Estado do vetor: [1, 1, 2, 3, 7]

3. Terceira Passagem:
    Comparar 1 e 1: Nenhuma troca [1, 1, 2, 3, 7]
    Comparar 1 e 2: Nenhuma troca [1, 1, 2, 3, 7]
    Comparar 2 e 3: Nenhuma troca [1, 1, 2, 3, 7]
    Comparar 3 e 7: Nenhuma troca [1, 1, 2, 3, 7]

   Estado do vetor: [1, 1, 2, 3, 7]

4. Quarta Passagem:
    Comparar 1 e 1: Nenhuma troca [1, 1, 2, 3, 7]
    Comparar 1 e 2: Nenhuma troca [1, 1, 2, 3, 7]
    Comparar 2 e 3: Nenhuma troca [1, 1, 2, 3, 7]
    Comparar 3 e 7: Nenhuma troca [1, 1, 2, 3, 7]

   Estado do vetor: [1, 1, 2, 3, 7]

