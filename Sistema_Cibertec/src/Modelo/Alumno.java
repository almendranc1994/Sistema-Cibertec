/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author alulab14
 */
public class Alumno {
    private int codigo;
    private String ape_pat;
    private String ape_mat;
    private String nombres;
    private int diaNacimiento;
    private int mesNacimiento;
    private int anhoNacimiento;
    private Carrera carrera;
    
    public Alumno(int codigo, String ape_pat, String ape_mat, String nombres, int dia, int mes, int anho){        
        setCodigo(codigo);
        setApe_mat(ape_mat);
        setApe_pat(ape_pat);
        setNombres(nombres);
        setDiaNacimiento(dia);
        setMesNacimiento(mes);
        setAnhoNacimiento(anho);
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {        
        this.codigo = codigo;
    }

    public String getApe_pat() {
        return ape_pat;
    }

    public void setApe_pat(String ape_pat) {
        this.ape_pat = ape_pat;
    }

    public String getApe_mat() {
        return ape_mat;
    }

    public void setApe_mat(String ape_mat) {
        this.ape_mat = ape_mat;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public int getDiaNacimiento() {
        return diaNacimiento;
    }

    public void setDiaNacimiento(int diaNacimiento) {
        this.diaNacimiento = diaNacimiento;
    }

    public int getMesNacimiento() {
        return mesNacimiento;
    }

    public void setMesNacimiento(int mesNacimiento) {
        this.mesNacimiento = mesNacimiento;
    }

    public int getAnhoNacimiento() {
        return anhoNacimiento;
    }

    public void setAnhoNacimiento(int anhoNacimiento) {
        this.anhoNacimiento = anhoNacimiento;
    }
    
    public String obtenerLineaDeli(){
        return getCodigo() + "," + getNombres() + "," + getApe_pat() + "," + getApe_mat() + "," + getDiaNacimiento() + "," + getMesNacimiento() + "," + getAnhoNacimiento();
    }
    
}
