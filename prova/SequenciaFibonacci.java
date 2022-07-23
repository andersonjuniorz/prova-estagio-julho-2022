package prova;

import java.util.Scanner;

/*
 * Nome: Anderson Junior
 * Questao 2: Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será 
 * a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), 
 * escreva um programa na linguagem que desejar onde, informado um número, ele calcule a sequência de Fibonacci e 
 * retorne uma mensagem avisando se o número informado pertence ou não a sequência.
 */
public class SequenciaFibonacci {

    public static void sequenciaFibonacci(int fibonacci[], int max) {
        int atual = 1, anterior = 0, aux = 0;

        for (int i = 0; i < max; i++) {
            fibonacci[i] = aux;
            aux = atual;
            atual = anterior + atual;
            anterior = aux;
        }
    }

    public static void imprimir(int fibonacci[]) {
        for (int i = 0; i < fibonacci.length; i++) {
            System.out.print(fibonacci[i] + " ");
        }
        System.out.println();
    }

    public static int procurarNumero(int fibonacci[], int num) {

        for (int i = 0; i < fibonacci.length; i++) {
            if (num == fibonacci[i]) {
                return i;
            }
        }
        return -1;
    }

    public static void informe(int fibonacci[], int result) {
        if (result != -1) {
            System.out.println("Valor " + fibonacci[result] + " encontrado na posição " + result);
        } else {
            System.out.println("Número não encontrado!");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Por favor, informe o número máximo: ");
        Integer max = input.nextInt();

        System.out.println("Por favor, informe um número desejado: ");
        Integer num = input.nextInt();

        int[] fibonacci = new int[max];

        sequenciaFibonacci(fibonacci, max);
        imprimir(fibonacci);

        int result = procurarNumero(fibonacci, num);
        informe(fibonacci, result);
    }
}