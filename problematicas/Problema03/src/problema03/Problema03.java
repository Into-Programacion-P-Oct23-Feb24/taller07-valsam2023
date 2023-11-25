/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;

/**
 *
 * @author Usuario
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int numero = 1;
        int limite = 37;
        int contador = 1;
        String presentar = "";

        do {
            numero = numero + contador;
            contador = contador + 2;
            presentar = String.format("%s\n%d", presentar, numero);
        } while (numero < limite);
        System.out.printf("%s\n", presentar);
    }

}
