/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuatroenraya;

import CuatroRayaControlador.Controlador;
import CuatroRayaModelo.Modelo;
import CuatroRayaVista.MiVentana;

/**
 *
 * @author Lucas
 */
public class CuatroEnRaya {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MiVentana v = new MiVentana();
        Modelo m = new Modelo();
        Controlador c = new Controlador(m, v);
        v.setVisible(true);
        v.setSize(700,750);
        v.setTitle("CUATRO EN RAYA");
    }
    
}