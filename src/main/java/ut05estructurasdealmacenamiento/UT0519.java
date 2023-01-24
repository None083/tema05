/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ut05estructurasdealmacenamiento;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author noelia
 */
public class UT0519 {

    /**
     * Crear un programa que, mediante un menú, permita reservar o cancelar
     * asientos de un avión, así como mostrar qué asientos están ocupados y
     * libres actualmente. El avión tendrá 25 filas de 4 asientos cada una.
     */
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        char[][] avion = new char[25][4];

        for (int i = 0; i < avion.length; i++) {

            for (int j = 0; j < avion[i].length; j++) {
                avion[i][j] = 'O';
            }
        }

        int opcion = 0;
        do {
            System.out.println("""
                           -----------------------------------------------------
                                            ESCOJA UNA OPCIÓN
                           -----------------------------------------------------
                                       1 - Reservar asiento
                                       2 - Cancelar reserva
                                       3 - Ver asientos
                                       4 - Salir
                           -----------------------------------------------------
                           """);
            try {
                opcion = teclado.nextInt();
            } catch (InputMismatchException ime) {
                opcion = 5;
                teclado.nextLine();
            }

            int fila;
            int columna;
            switch (opcion) {
                case 1:
                    do {
                        System.out.println("Introduzca el número de la fila entre 1 - 25");
                        try {
                            fila = teclado.nextInt() - 1;
                        } catch (InputMismatchException ime) {
                            fila = 25;
                            teclado.nextLine();
                        }

                    } while (fila < 0 || fila > 24);
                    do {
                        System.out.println("Introduzca el número del asiento entre 1 - 4");
                        try {
                            columna = teclado.nextInt() - 1;
                        } catch (InputMismatchException ime) {
                            columna = 5;
                            teclado.nextLine();
                        }
                    } while (columna < 0 || columna > 3);
                    reservarAsiento(avion, fila, columna);
                    break;
                case 2:
                    do {
                        System.out.println("Introduzca el número de la fila entre 1 - 25");
                        try {
                            fila = teclado.nextInt() - 1;
                        } catch (InputMismatchException ime) {
                            fila = 26;
                            teclado.nextLine();
                        }
                    } while (fila < 0 || fila > 24);
                    do {
                        System.out.println("Introduzca el número del asiento entre 1 - 4");
                        try {
                            columna = teclado.nextInt() - 1;
                        } catch (InputMismatchException ime) {
                            columna = 5;
                            teclado.nextLine();
                        }
                    } while (columna < 0 || columna > 3);
                    cancelarReserva(avion, fila, columna);
                    break;
                case 3:
                    imprimirAvion(avion);
                    break;
                case 4:
                    System.out.println("Hasta luegui <3");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        } while (opcion != 4);

    }

    private static void imprimirAvion(char[][] avion) {

        for (int i = 0; i < avion.length; i++) {

            for (int j = 0; j < avion[i].length; j++) {
                System.out.print(avion[i][j] + " ");
            }
            System.out.println("");
        }
    }

    private static void reservarAsiento(char[][] avion, int fila, int columna) {

        if (avion[fila][columna] == 'O') {
            avion[fila][columna] = 'X';
            System.out.println("Ha reservado su asiento");
        } else {
            System.out.println("Asiento no disponible");
        }
    }

    private static void cancelarReserva(char[][] avion, int fila, int columna) {

        if (avion[fila][columna] == 'X') {
            avion[fila][columna] = 'O';
            System.out.println("Ha cancelado su reserva");
        } else {
            System.out.println("Este asiento no está reservado");
        }
    }

}
