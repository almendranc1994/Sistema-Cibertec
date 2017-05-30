/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alulab14
 */
public class GestorAlumno {
    private ArrayList <Alumno> alumnos;
    private ArrayList <Alumno> alumnosAux;
    
    public GestorAlumno() throws IOException{
        alumnos = new ArrayList<Alumno>();
        alumnosAux = new ArrayList<Alumno>();
        leerAlumnos();        
    }
    
    protected void finalize() throws IOException  {
        guardarAlumno();
    }
    
    public void insertarAlumno(int codigo, String nombres, String ape_pat, String ape_mat, int dia, int mes, int anho){
        Alumno A = new Alumno(codigo, nombres, ape_pat, ape_mat, dia, mes, anho);
        getAlumnos().add(A);
    }
    
    public void insertarAlumnoAux(int codigo, String nombres, String ape_pat, String ape_mat, int dia, int mes, int anho){
        Alumno A = new Alumno(codigo, nombres, ape_pat, ape_mat, dia, mes, anho);
        getAlumnosAux().add(A);
    }
    
    public Alumno buscarAlumno(int codigo){ 
        for(Alumno a : alumnos){
            if(a.getCodigo() == codigo){
                return a;
            }
        }
        return null;
    }
    
    private void guardarAlumno() throws IOException{
        File file = new File("bdALUMNO.txt");
        file.delete();
        FileWriter write = new FileWriter("bdALUMNO.txt");
        for(Alumno a: alumnos){
            String linea = a.obtenerLineaDeli();
            write.write(linea);
        }
        write.close();
    }
    
    private void leerAlumnos() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("bdALUMNO.txt"));
        String linea = null;
        String codigoA, nombreA, apePatA, apeMatA, diaA, mesA, anhoA, codigoCarreraA;
        int codigo, dia, mes, anho, codigoC;
        while((linea = br.readLine()) != null){
            String[] values = linea.split(",");            
            codigoA = values[0];
            codigo = Integer.valueOf(codigoA);
            nombreA = values[1];
            apePatA = values[2];
            apeMatA = values[3];
            diaA = values[4];
            dia = Integer.valueOf(diaA);
            mesA = values[5];
            mes = Integer.valueOf(mesA);
            anhoA = values[6];
            anho = Integer.valueOf(anhoA);
            insertarAlumno(codigo, nombreA, apePatA, apeMatA, dia, mes, anho);
        }       
        br.close();
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
