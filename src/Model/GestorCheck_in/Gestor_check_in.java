/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.GestorCheck_in;

/**
 *
 * @author equipo aereostars
 */
public class Gestor_check_in {
    Check_in check_in = new Check_in();
    Pase_abordar pase;

    public Pase_abordar hacerCheckin(int id, int opcion){
        pase = check_in.realizarCheckIn(id, opcion);
        return pase;
    }
}
