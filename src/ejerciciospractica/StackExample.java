/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciospractica;

import java.util.Random;
import java.util.Stack;

/**
 *
 * @author Gabriela
 */
public class StackExample {
    
      public static void main(String[] args) {
        Stack<Integer> pila1 = new Stack<>();
        Stack<Integer> pila2 = new Stack<>();
        Random rand = new Random();

        // Agregar 7 datos a la primera pila
        for (int i = 0; i < 7; i++) {
            int valorAleatorio = rand.nextInt(100); // Valores aleatorios entre 0 y 99
            pila1.push(valorAleatorio);
            System.out.println("Pila 1 - Agregado: " + valorAleatorio);
        }

        // Transferir datos a la segunda pila en orden inverso
        while (!pila1.isEmpty()) {
            int valor = pila1.pop();
            pila2.push(valor);
        }

        // Mostrar datos de la segunda pila
        System.out.print("Pila 2 - Elementos en orden inverso: ");
        for (Integer valor : pila2) {
            System.out.print(valor + " ");
        }
        System.out.println();
      }
    
}
