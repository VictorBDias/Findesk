/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author ld_si
 */
public class Dia implements Serializable{
    private int idDia;

    public int getIdDia() {
        return idDia;
    }

    public void setIdDia(int idDia) {
        this.idDia = idDia;
    }

    public Dia(int idDia) {
        this.idDia = idDia;
    }
    
    public Dia() {
        this.idDia = 0;
    }
    
    
    
}
