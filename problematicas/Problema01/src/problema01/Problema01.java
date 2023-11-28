/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int edad;
        double estatura;
        int sumaed = 0;
        double sumaes = 0;
        int contador = 0;
        String reporte = "";
        String nombre;
        String posicion;
        String opcion;
        double promedad;
        double promestatura;
        boolean bandera = true;
        String acumulacion = "";

        while (bandera) {
            System.out.println("Ingrese el nombre del jugador: ");
            nombre = entrada.nextLine();

            System.out.println("Ingrese la posicion en el campo: ");
            posicion = entrada.nextLine();

            System.out.println("Ingrese la edad del jugador: ");
            edad = entrada.nextInt();

            System.out.println("Ingrese la estatura del jugador: ");
            estatura = entrada.nextDouble();

            sumaed = sumaed + edad;
            sumaes = sumaes + estatura;

            contador = contador + 1;

            acumulacion = acumulacion + edad + "\n";

            reporte = String.format("%s%d. %s -%s-, edad %d, %.2f\n", reporte,
                    contador, nombre, posicion, edad, estatura);

            entrada.nextLine();
            System.out.println("Digite el numero 5, si desea terminar");
            opcion = entrada.nextLine();

            if (opcion.equals("5")) {
                bandera = false;
            }

        }

        promedad = (double) sumaed / contador;
        promestatura = sumaes / contador;

        reporte = String.format("%sListado de Edades\n%sPromedio de edades: "
                + "%.2f\nPromedio de estaturas: %.2f", reporte, acumulacion,
                promedad, promestatura);
        System.out.printf("%s\n", reporte);
        {
        }
    }

}
