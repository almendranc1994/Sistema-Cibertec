/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;

import Controlador.*;
import Vistas.*;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author alulab14
 */
public class Sistema {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws IOException {
        SistemaControlador S = new SistemaControlador();
        new MenuAlumnos(S).setVisible(true);
        
        // TODO code application logic here
    }
    
}
