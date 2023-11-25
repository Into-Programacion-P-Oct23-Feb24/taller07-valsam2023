/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;

/**
 *
 * @author Usuario
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int numero = 0;
        int numero_limite = 110;
        int contador = 2;
        String presentar = "";

        while (numero < numero_limite) {
            numero = numero + contador;
            contador = contador + 2;
            presentar = String.format("%s\n%d", presentar, numero);
        }
        System.out.printf("%s\n", presentar);
    }
}


