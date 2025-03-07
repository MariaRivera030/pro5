/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pro5;

/**
 *
 * @author river
 */
public class Pro5 {

    public static void main(String[] args) {
      String[][] datosPersonales = {
            {"Daniel", "Medina", "Electrónica", "TEST"},
            {"Monica", "Jiz", "Computación", "IMSA"},
            {"Carlos", "Ramírez", "Mecatrónica", "ABC Corp"},
            {"Ana", "Perez", "Diseño Grafico", "Freelance"},
            {"Luis", "Gomez", "Software", "TechSolutions"}
        };

        // Imprimir los datos personales
        System.out.println("Datos personales de los compañeros:\n");
        for (int i = 0; i < datosPersonales.length; i++) {
            System.out.println("Nombre: " + datosPersonales[i][0]);
            System.out.println("Apellido: " + datosPersonales[i][1]);
            System.out.println("Carrera: " + datosPersonales[i][2]);
            System.out.println("Lugar de Trabajo: " + datosPersonales[i][3]);
            System.out.println("--------------------------");
        }

        // Arreglo con nombres y notas de estudiantes
        String[] nombresEstudiantes = {"Daniel", "Monica", "Carlos", "Ana", "Luis"};
        int[] notasEstudiantes = {65, 89, 72, 45, 90};

        // Imprimir resultados de aprobación o reprobación
        System.out.println("Resultados académicos:\n");
        for (int i = 0; i < nombresEstudiantes.length; i++) {
            String estado = (notasEstudiantes[i] >= 60) ? "Aprobado" : "Reprobado";
            System.out.println("Nombre: " + nombresEstudiantes[i]);
            System.out.println("Nota: " + notasEstudiantes[i]);
            System.out.println("Estado: " + estado);
            System.out.println("--------------------------");
        }
    }
}
