package tecnoguru;

public class NotasAlunos {
    public static void main(String[] args) {

        // Declaração da matriz (3 alunos x 3 provas)
        double[][] notas = {
                {7.5, 8.5, 6.5}, // Aluno 1
                {8.0, 8.5, 7.5}, // Aluno 2
                {6.0, 7.0, 8.0}  // Aluno 3
        };

        // Percorrendo a matriz
        for (int i = 0; i < notas.length; i++) {
            // i representa o aluno

            double soma = 0;

            for (int j = 0; j < notas[i].length; j++) {
                // j representa a prova

                soma += notas[i][j]; // Soma as notas do aluno
                System.out.println("Aluno " + (i + 1) + " - Prova " + (j + 1) + ": " + notas[i][j]);
            }

            double media = soma / notas[i].length;

            System.out.println("Média do Aluno " + (i + 1) + ": " + media);
            System.out.println("------------------------");
        }
    }
}