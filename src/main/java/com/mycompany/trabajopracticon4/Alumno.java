/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabajopracticon4;

import java.util.HashSet;


public class Alumno {
    
    private int legajo;
    private String apellido;
    private String nombre;
    private HashSet<Materia>materia = new HashSet<>();

    public Alumno() {
    }

    public Alumno(int legajo, String apellido, String nombre) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
        
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void agregarMateria(Materia m){
       materia.add(m);
        /*if(materia.contains(m)){
            System.out.println("Ya esta inscripto en esta materia");
        }else{
            materia.add(m);
            System.out.println("La materia fue agregada con exito");
        }*/
    }
    
    public int cantidadMaterias(){
        return materia.size();
    }

    public HashSet<Materia> getMateria() {
        return materia;
    }

    public void setMateria(HashSet<Materia> materia) {
        this.materia = materia;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.legajo;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alumno other = (Alumno) obj;
        return this.legajo == other.legajo;
    }

    @Override
    public String toString() {
        return this.apellido+"  "+this.nombre;
    }
    
      
    
    
}
