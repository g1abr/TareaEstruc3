/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciospractica;

import java.util.Random;
import java.util.Stack;

/**
 *
 * @author Gabriela
 */
public class EjerciciosPractica {

   public static void main(String[] args) {
        // Usar la clase Pila
        Pila pila = new Pila(9);
        Random rand = new Random();

        // Agregar 5 valores numéricos aleatorios
        for (int i = 0; i < 5; i++) {
            int valorAleatorio = rand.nextInt(100); // Valores aleatorios entre 0 y 99
            pila.apilar(valorAleatorio);
            System.out.println("Agregado: " + valorAleatorio);
        }

        // Mostrar el tamaño actual de la pila
        System.out.println("Tamaño actual de la pila: " + pila.tamano());

        // Borrar un dato
        Integer valorDesapilado = pila.desapilar();
        System.out.println("Desapilado: " + valorDesapilado);

        // Indicar nuevamente el tamaño actual
        System.out.println("Nuevo tamaño actual de la pila: " + pila.tamano());

        // Mostrar la cantidad de datos que se pueden agregar a la pila
        System.out.println("Capacidad restante: " + pila.capacidadRestante());

        // Mostrar los elementos actuales de la pila
        pila.mostrarPila();

        // Parte 2: Uso de la clase Stack
        Stack<Integer> pila1 = new Stack<>();
        Stack<Integer> pila2 = new Stack<>();

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
