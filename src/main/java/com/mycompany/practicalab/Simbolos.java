package com.mycompany.practicalab;

public enum Simbolos {

   LLAVE_ABIERTA("{"),
   LLAVE_CERRADA("}"),
   CORCHETE_ABIERTO("["),
   CORCHETE_CERRADO("]"),
   PUNTOYCOMA(";"),
   COMA(",");
   
   private Simbolos(String simbolo){
       this.simbolo=simbolo;
   }
   private String simbolo;
   
   public String getSimbolo(){return simbolo;}
     
}
