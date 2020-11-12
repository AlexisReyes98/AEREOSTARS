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
public class Pase_abordar {
    private String destino;
    private String origen;
    private int asiento;
    private String hora_despegue;
    private int num_referencia;

    public Pase_abordar(String destino, String origen, int asiento, String hora_despegue, int num_referencia) {
        this.destino = destino;
        this.origen = origen;
        this.asiento = asiento;
        this.hora_despegue = hora_despegue;
        this.num_referencia = num_referencia;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public int getAsiento() {
        return asiento;
    }

    public void setAsiento(int asiento) {
        this.asiento = asiento;
    }

    public String getHora_despegue() {
        return hora_despegue;
    }

    public void setHora_despegue(String hora_despegue) {
        this.hora_despegue = hora_despegue;
    }

    public int getNum_referencia() {
        return num_referencia;
    }

    public void setNum_referencia(int num_referencia) {
        this.num_referencia = num_referencia;
    }

    @Override
    public String toString() {
        return "Pase_abordar{" + "destino=" + destino + ", origen=" + origen + ", asiento=" + asiento + ", hora_despegue=" + hora_despegue + ", num_referencia=" + num_referencia + '}';
    }
    
}
