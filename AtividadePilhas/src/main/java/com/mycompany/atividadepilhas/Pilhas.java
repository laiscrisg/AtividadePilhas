/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividadepilhas;

/**
 *
 * @author laisg
 */
public class Pilhas {

char[] elementos = new char[100];
    int topo = -1;

    public Pilhas() {
        topo = -1;
    }

    boolean estaVazia() {
        return (topo == -1);
    }

    boolean estaCheia() {
        return (topo == 99);
    }

    void empilhar(char elemento) {

        if (estaCheia()) {
            System.out.println("Erro: Pilha cheia!");
        } else {
            topo = topo + 1;
            elementos[topo] = elemento;
        }
    }

    char desempilhar() {

        if (estaVazia()) {
            System.out.println("Erro: Pilha vazia!");
            return '\0';
        } else {
            char elemento = elementos[topo];
            topo = topo - 1;
            return elemento;
        }
    }
}
    

