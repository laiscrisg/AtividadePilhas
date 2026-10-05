/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividadepilhas;

/**
 *
 * @author laisg
 */
import java.util.Scanner;

public class AtividadePilhas {

    public static void main(String[] args) {

        Scanner lista = new Scanner(System.in);

        Pilhas P1 = new Pilhas();

        System.out.println("Digite uma frase:");
        String frase = lista.nextLine();

        System.out.println();
        System.out.println("Frase invertida:");

        for (int i = 0; i < frase.length(); i++) {

            char letra = frase.charAt(i);

            if (letra != ' ') {

                P1.empilhar(letra);

            } else {

                while (!P1.estaVazia()) {
                    System.out.print(P1.desempilhar());
                }

                System.out.print(" ");
            }
        }

        while (!P1.estaVazia()) {
            System.out.print(P1.desempilhar());
        }

    }
}