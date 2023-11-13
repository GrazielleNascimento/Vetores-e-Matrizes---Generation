//Dado um vetor contendo 10 números inteiros não ordenados e não repetidos, construa um algoritmo que consiga pesquisar dados no vetor, onde o usuário irá digitar um número e o programa deve exibir na tela a posição deste número no vetor. Caso o número não seja encontrado, a mensagem: “Não foi encontrado!” deve ser exibida na tela. Veja os exemplos abaixo:

package vetoresMatrizes;

import java.util.Scanner;

public class Ex01Posicao {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vetorInt[] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
        int numProcurado;

        System.out.print("Digite o número que você deseja encontrar: ");
        numProcurado = sc.nextInt();
        sc.close();
   ;

        int i;
        boolean numEncontrado = false; // Variável para indicar se o número foi encontrado

        for (i = 0; i < vetorInt.length; i++) {
            if (numProcurado == vetorInt[i]) {
                System.out.print("O número encontrado está na posição: " + i);
                numEncontrado = true;
                break;
            }
        }

        if (!numEncontrado) {
            System.out.println("Número não encontrado!");
        }
    }
}
