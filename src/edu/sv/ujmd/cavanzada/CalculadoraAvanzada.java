package edu.sv.ujmd.cavanzada;

import edu.sv.ujmd.calculadora.calculadora;
import edu.sv.ujmd.cbasica.CalculadoraBasica;
import java.util.Scanner;
import java.lang.Math;

public class CalculadoraAvanzada {

    Scanner teclado = new Scanner(System.in);
    int n1;

    public void menu() {
        int opc;
        boolean salir = false;

        do {
            System.out.println();
            System.out.print("----- Menú Principal -----"
                    + "\n1. POTENCIA"
                    + "\n2. OPUESTO"
                    + "\n3. FACTORIAL"
                    + "\n4. Salir"
                    + "\nIngrese una opción: ");
            opc = teclado.nextInt();

            switch (opc) {
                case 1:
                    potencia();
                    break;
                case 2:
                    opuesto();
                    break;
                case 3:
                    factorial();
                    break;
                case 4:
                    System.out.println();
                    System.out.println("Cerrando el programa...");
                    calculadora.main(null);
                    break;
                default:
                    System.out.println("Error al digitar...");
                    break;
            }

        } while (!salir);
    }

    public void potencia() {
        int numero;
        int potencia;
        System.out.print("Ingrese número: ");
        numero = teclado.nextInt();
        System.out.print("Ingrese la potencia: ");
        potencia = teclado.nextInt();

        System.out.println("La potencia de " + numero + " elevado a  " + potencia + " es igual a " + Math.pow(numero, potencia));
    }

    public void opuesto() {
        int numero;
        int opuesto;
        System.out.print("Ingrese número: ");
        numero = teclado.nextInt();

        opuesto = numero * -1;

        System.out.print("El opuesto de " + numero + " es " + opuesto);

    }

    public void factorial() {
        int numero;
        System.out.print("Ingrese número: ");
        numero = teclado.nextInt();
        int factorial = 1;
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }

        System.out.println("El factorial de " + numero + " es  " + factorial);

    }

    public void ingresaDatos() {
        System.out.print("Ingrese número 1: ");
        n1 = teclado.nextInt();
        teclado.nextLine();
    }

    public static void main(String[] args) {
        CalculadoraAvanzada fc = new CalculadoraAvanzada();
        fc.menu();
    }
}