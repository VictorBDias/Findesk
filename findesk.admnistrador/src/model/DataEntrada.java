/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ld_si
 */
public class DataEntrada {
    private Data data;

    public Data getDataEntrada() {
        return data;
    }

    public void setDataEntrada(Data dataEntrada) {
        this.data = dataEntrada;
    }

    public DataEntrada(Data dataEntrada) {
        this.data = dataEntrada;
    }
    public DataEntrada() {
        this.data = new Data();
    }
    
}
