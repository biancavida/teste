package vetores;

import java.util.Scanner;


public class Vetores {
    public static void main(String[] args) {
        
        int[] notas = new int[30];
        
        notas[0] = 10;
        notas[1] = 9;

        int resultado = 0; 

        Scanner scan = new Scanner (System.in);

        for (int i=0; i< notas.length; i++) {
            System.out.print ("Insira a " + (i + 1 ) + "a nota: ");
            notas[i] = scan.nextInt();
        }
        for (int i=0; i< notas.length; i++) {
            resultado += notas[i];
        }

        System.out.println("A soma do vetor é" + resultado);
    }
}