//Elabore um algoritmo que leia as notas de uma classe com 10 participantes durante 4 bimestres de um ano. As 4 notas de cada participante serão armazenadas em uma linha de uma matriz de números reais, logo cada linha da matriz serão as notas de um participante. Em um vetor de números reais, armazene as médias de cada participante e exiba as médias de cada um na tela.

package vetoresMatrizes;

import java.util.Locale;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex04MediasMatriz {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// Matriz para armazenar as notas
		float[][] notas = new float[10][4];

		// Vetor para armazenar as médias
		float[] medias = new float[10];

		// Ler as notas
		for (int i = 0; i < 10; i++) {
			System.out.println("Notas do aluno " + (i + 1) + ": ");
			for (int j = 0; j < 4; j++) { // Bimestre
				System.out.print("Digite a nota do bimestre " + (j + 1) + ": ");
				notas[i][j] = sc.nextFloat();
			}
		}

		// Calcular as médias dos alunos
		for (int aluno = 0; aluno < 10; aluno++) {
			float soma = 0;
			for (int bimestre = 0; bimestre < 4; bimestre++) {
				soma += notas[aluno][bimestre];
			}
			medias[aluno] = soma / 4;
		}

		// Criar um formato para exibir as saídas com uma casa decimal
		DecimalFormat df = new DecimalFormat("#0.0");

		// Exibir as médias dos alunos com uma casa decimal
		for (int aluno = 0; aluno < 10; aluno++) {
			System.out.println("Média do aluno " + (aluno + 1) + ": " + df.format(medias[aluno]));
		}
		  sc.close();
	}

}
