/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practicalab;

/**
 *
 * @author HP
 */
public enum Numeros {
    UNO("1"),
    DOS("2"),
    TRES("3"),
    CUATRO("4"),
    CINCO("5"),
    SEIS("6"),
    SIETE("7"),
    OCHO("8"),
    NUEVE("9"),
    CERO("0");
    
   private Numeros(String numero){
       this.numero=numero;
   }
   private String numero;
   
   public String getNumero(){return numero;}
}
