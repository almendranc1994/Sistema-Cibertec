/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Alumno;
import Modelo.GestorAlumno;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author alulab14
 */
public class SistemaControlador {
    GestorAlumno gestorAlumno;

    public SistemaControlador() throws IOException {
        gestorAlumno = new GestorAlumno();
    }
    
    public void insertarAlumno(int codigo, String nombres, String ape_pat, String ape_mat, int dia, int mes, int anho){
        gestorAlumno.insertarAlumno(codigo, nombres, ape_pat, ape_mat, dia, mes, anho);
        insertarAlumnoAux(codigo, nombres, ape_pat, ape_mat, dia, mes, anho);
    }       
    
    public void insertarAlumnoAux(int codigo, String nombres, String ape_pat, String ape_mat, int dia, int mes, int anho){
        gestorAlumno.insertarAlumnoAux(codigo, nombres, ape_pat, ape_mat, dia, mes, anho);
    }  
    
    public ArrayList<Alumno> obtenerListaAux(){
        return gestorAlumno.getAlumnosAux();
    }
    
    private void guardarAlumnos() throws IOException{
        //gestorAlumno;
    }
    
    public Alumno buscarAlumno(int codigo){
        return gestorAlumno.buscarAlumno(codigo);
    }
    
}
