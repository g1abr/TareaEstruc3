/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciospractica;
// Main.java
/**
 *
 * @author Gabriela
 */
// Clase Pila que define una pila utilizando un arreglo
public class Pila {
    private final int[] arreglo;  // Arreglo que almacena los elementos de la pila
    private int indice; // Índice para rastrear la posición del próximo elemento a apilar

     // Constructor de la clase Pila que inicializa el arreglo y el índice
    public Pila(int tamaño) {
        arreglo = new int[tamaño]; // Inicializa el arreglo con el tamaño proporcionado
        indice = 0; // Inicializa el índice en 0
    }
    
    public void apilar(int valor) { // Verifica si hay espacio en la pila
        if (indice < arreglo.length) {
            arreglo[indice++] = valor;
        } else {
            System.out.println("La pila está llena. No se puede agregar el valor: " + valor);
        }
    }
       // Método para desapilar un valor de la pila
    public Integer desapilar() {
        if (indice > 0) {
            return arreglo[--indice];
        } else {
            System.out.println("La pila está vacia. No se puede desapilar.");
            return null;
        }
    }
    
    public int tamano() {
        return indice;
    }
    
    public int capacidadRestante() {
        return arreglo.length - indice;
    }
    
    public void mostrarPila() {
        System.out.print("Elementos en la pila: ");
        for (int i = 0; i < indice; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();
    }
}
