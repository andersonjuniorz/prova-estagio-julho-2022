package prova;

import java.util.Scanner;

/*
 * Nome: Anderson Júnior
 * Questão 5: Escreva um programa que inverta os caracteres de um string.
 */

public class InversaoChars {

    public static void imprimirArrays(char palavra[], char arr[]) {

        System.out.println("Palavra digitada: ");
        for (int i = 0; i < palavra.length; i++) {
            System.out.print(palavra[i]);
        }

        System.out.println("\n Palavra invertida:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }

    public static char[] inverter(char palavra[]) {
        char[] aux = new char[palavra.length];
        int j = 0;

        for (int i = palavra.length - 1; i >= 0; i--) {
            aux[j] = palavra[i];
            j++;
        }
        return aux;
    }

    public static void main(String[] args) {
        Scanner lendo = new Scanner(System.in);
        String exit = "N";

        do {
            System.out.println("Por favor, Digite uma palavra/frase: ");
            String str = lendo.nextLine();
            char palavra[] = str.toCharArray();

            char arr[] = inverter(palavra);
            imprimirArrays(palavra, arr);

            System.out.println("Deseja invertar uma outra palavra? - S ou N");
            exit = lendo.nextLine();

        } while (!exit.equals("n") && !exit.equals("N"));

        System.out.println("Programa finalizado com sucesso!");
    }
}