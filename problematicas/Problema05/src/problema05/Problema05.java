/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema05;

/**
 *
 * @author Usuario
 */
public class Problema05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int limite = 15;
        int numerador = 1;
        int denominador = 3;
        String signo;
        String cadena = "1 ";
        int contador = 1;

        do {
            if (contador % 2 == 0) {
                signo = "+ ";
            } else {
                signo = "- ";
            }

            cadena = String.format("%s%s%d/%d ",
                    cadena, signo, numerador, denominador);
            denominador = denominador + 2;
            contador = contador + 1;
        } while (denominador <= limite);

        System.out.println(cadena);

    }
}
