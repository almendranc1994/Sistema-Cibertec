/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Alumno;
import Modelo.GestorAlumno;
import java.util.ArrayList;

/**
 *
 * @author alulab14
 */
public class SistemaControlador {
    GestorAlumno gestorAlumno;

    public SistemaControlador() {
        gestorAlumno = new GestorAlumno();
    }
    
    public void insertarAlumno(String nombres, String ape_pat, String ape_mat){
        gestorAlumno.insertarAlumno(nombres, ape_pat, ape_mat);
        insertarAlumnoAux(nombres, ape_pat, ape_mat);
    }       
    
    public void insertarAlumnoAux(String nombres, String ape_pat, String ape_mat){
        gestorAlumno.insertarAlumnoAux(nombres, ape_pat, ape_mat);
    }  
    
    public ArrayList<Alumno> obtenerListaAux(){
        return gestorAlumno.getAlumnosAux();
    }
    
}
