/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.trabajopracticon4;


public class Colegio {

    public static void main(String[] args) {
        Materia ingles = new Materia(1, "Ingles", 1);
        Materia matematicas = new Materia(2, "Matematicas",1);
        Materia laboratorio = new Materia(3,"Laboratorio",1);
        
        Alumno a1 = new Alumno(1001, "Lopez", "Martin");
        Alumno a2 = new Alumno(1002, "Martinez", "Brenda");
        
        a1.agregarMateria(ingles);
        a1.agregarMateria(matematicas);
        a1.agregarMateria(laboratorio);
        
        a2.agregarMateria(ingles);        
        a2.agregarMateria(matematicas);
        a2.agregarMateria(laboratorio);
        
        a2.agregarMateria(laboratorio);
        
        System.out.println(a1.cantidadMaterias());
        System.out.println(a2.cantidadMaterias());
        
    }
}
