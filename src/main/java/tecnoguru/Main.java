package tecnoguru;
/*
Copyright 
 */

public class Main {
    public static void main(String[] args) {

        // Texto que será analisado
        String texto = "Claudiano Particeli Machado";

        // Variável para armazenar cada palavra
        String palavra = "";

        // Variável para armazenar cada caractere
        char caracter;

        // Percorre todo o texto caractere por caractere
        for (int i = 0; i < texto.length(); i++) {

            caracter = texto.charAt(i); // Pega o caractere na posição i

            // Verifica se o caractere é um espaço
            if (caracter == ' ') {

                // Quando encontra espaço, significa fim de uma palavra
                System.out.println("Palavra encontrada: " + palavra);

                palavra = ""; // Reinicia a variável para próxima palavra

            } else {
                // Se não for espaço, adiciona o caractere à palavra
                palavra += caracter;
            }
        }

        // ⚠️ IMPORTANTE:
        // A última palavra não termina com espaço, então precisamos exibir ela fora do loop
        System.out.println("Palavra encontrada: " + palavra);
    }
}