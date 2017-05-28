/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author alulab14
 */
public class GestorAlumno {
    private ArrayList <Alumno> alumnos;
    private ArrayList <Alumno> alumnosAux;
    
    public GestorAlumno(){
        alumnos = new ArrayList<Alumno>();
        alumnosAux = new ArrayList<Alumno>();
        leerAlumnos();        
    }
    
    protected void finalize ()  {
        guardarAlumno();
    }
    
    public void insertarAlumno(String nombres, String ape_pat, String ape_mat){
        Alumno A = new Alumno(nombres, ape_pat, ape_mat);
        getAlumnos().add(A);
    }
    
    public void insertarAlumnoAux(String nombres, String ape_pat, String ape_mat){
        Alumno A = new Alumno(nombres, ape_pat, ape_mat);
        getAlumnosAux().add(A);
    }
    
    private void guardarAlumno(){
        //PASAR AL ARCHIVO - LLAMAR AL FINAL
    }
    
    private void leerAlumnos(){
        //LEER ARCHIVO
    }        

    public ArrayList <Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList <Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public ArrayList <Alumno> getAlumnosAux() {
        return alumnosAux;
    }

    public void setAlumnosAux(ArrayList <Alumno> alumnosAux) {
        this.alumnosAux = alumnosAux;
    }
    
    
}
