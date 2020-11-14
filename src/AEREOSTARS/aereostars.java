/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AEREOSTARS;

import Controller.*;

/**
 *
 * @author equipo aereostars
 */
public class aereostars {
    public static void main(String[] args) {
        //Se llama al oyente principal para desplegar a la gui principal
        OPrincipal op = new OPrincipal();
        op.iniciar();
        
        op.frm2.setVisible(true);
    }
}
