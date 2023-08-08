/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practicalab;


import javax.swing.JTextArea;

/**
 *
 * @author HP
 */
public class Lexica {
   
    public static String car_Simbolos ="Simbolos: ";
    public static String numerosEnteros ="Numeros enteros: ";
    public static String numerosDecimales="Numeros decimales: ";
    public static String id="Id: ";
    public static String errores="Errores:  ";
    
    
  
    String caracter;
    String porcion="";
     String simbolo;
     
   
  
    public void verificarTexto(String texto, JTextArea areatexto){
        
        int i=0;
        while(i<texto.length()){
            caracter=texto.substring(i, i+1);
            try{
                if(caracter.equals(" ")){
                    System.out.println(porcion);
                   
                        for(int j=0; j<porcion.length();j++){
                            simbolo=porcion.substring(j, j+1);
                           
                            for(Simbolos simbolos: Simbolos.values()){
                                if(simbolo.equals(simbolos.getSimbolo())){
                                    if(simbolo.substring(0, 1).equals(simbolos.getSimbolo())){
                                        car_Simbolos = car_Simbolos + simbolo +", ";
                                        System.out.println(j);
                                        j++;
                                    }else{
                                        car_Simbolos = car_Simbolos + simbolo +", ";
                                        
                                    }
                                    
                                }
                                else{/*no hacer nada*/}
                                 
                            }
                             if(!porcion.substring(0, 1).chars().allMatch(Character::isDigit)&&j+1==1 && !porcion.substring(0, 1).equals(".")){
                                    System.out.println(j); 
                                    id=id+porcion+", ";
                                     j++;
                                     System.out.println(j);
                                }else if(porcion.substring(0, 1).equals(".")||porcion.substring(porcion.length()-1, porcion.length()).equals(".")){
                                    if(j==0){
                                       errores=errores + porcion +", ";
                                    }else{}
                                }
                            
                            for(Numeros numeros: Numeros.values()){
                                if(simbolo.equals(numeros.getNumero())){
                                   if(porcion.substring(0, porcion.length()).chars().allMatch(Character::isDigit)&&j==0){
                                       numerosEnteros=numerosEnteros+porcion +", ";
                                   }
                                  
                               }else{/*no hacer nada*/}
                            }
                            if(simbolo.equals(".")){
                                if(porcion.substring(0, j-1).chars().allMatch(Character::isDigit)){
                                    if(porcion.substring(j+1, porcion.length()).chars().allMatch(Character::isDigit)){
                                        numerosDecimales=numerosDecimales + porcion+", ";
                                    }else{
                                        errores=errores+porcion+", ";
                                    }
                                }
                            }
                           
                        }
                    porcion="";
                }else if(i+1==texto.length()){
                  porcion=porcion+texto.substring(i, i+1);
                  System.out.println(porcion);
                        for(int j=0; j<porcion.length();j++){
                            simbolo=porcion.substring(j, j+1);
                            for(Simbolos simbolos: Simbolos.values()){
                                if(simbolo.equals(simbolos.getSimbolo())){
                                    if(porcion.substring(0, 1).equals(simbolos.getSimbolo())){
                                         car_Simbolos = car_Simbolos + simbolo +"";
                                         j++;
                                    }else{
                                         car_Simbolos = car_Simbolos + simbolo +"";
                                    } 
                                }
                                else{/*no hacer nada*/}
                            }
                             if(!porcion.substring(0, 1).chars().allMatch(Character::isDigit)&&j+1==1&& !porcion.substring(0, 1).equals(".")){
                                     id=id+porcion+"";
                                     j++;
                                }else if(porcion.substring(0, 1).equals(".")||porcion.substring(porcion.length()-1, porcion.length()).equals(".")){
                                    if(j==0){
                                       errores=errores + porcion +"";
                                    }else{}
                                }
                            
                            for(Numeros numeros: Numeros.values()){
                                if(simbolo.equals(numeros.getNumero())){
                                   if(porcion.substring(0, porcion.length()).chars().allMatch(Character::isDigit)&&j==0){
                                       numerosEnteros=numerosEnteros+porcion +" ";
                                   }
                                  
                               }else{/*no hacer nada*/}
                            }
                            if(simbolo.equals(".")){
                                if(porcion.substring(0, j-1).chars().allMatch(Character::isDigit)){
                                    if(porcion.substring(j+1, porcion.length()).chars().allMatch(Character::isDigit)){
                                        numerosDecimales=numerosDecimales + porcion+" ";
                                    }else{
                                        errores=errores+porcion +" ";
                                    }
                                }
                            }
                            
                        }
                    porcion="";
                }else{
                    porcion=porcion+caracter;
                }
            }catch(NullPointerException e){
                System.out.println("Error ");
            }catch(StringIndexOutOfBoundsException e){
                System.out.println("No hay un siguiente");
            }
           
            
            /* caracter=texto.substring(i, i+1);
            for(Simbolos simbolos: Simbolos.values()){
            if(caracter.equals(simbolos.getSimbolo())){
            car_Simbolos = car_Simbolos + caracter +" ";
            }else{
            //System.out.println("No se encontró simbolos " + caracter );
            }
            }
            for(Numeros numeros: Numeros.values()){
            if(caracter.equals(numeros.getNumero())){
            
            }else{
            
            }
            }
            
            esNumero = caracter.chars().allMatch( Character::isDigit );
            ultimoNumero=texto.substring(texto.length()-1, texto.length()).chars().allMatch(Character::isDigit);*/
            
            
            i++;
        }
       
            
            areatexto.setText(areatexto.getText() +"La longitud del texto es: " + texto.length()+"\n");
            areatexto.setText(areatexto.getText() + car_Simbolos +"\n");
            areatexto.setText(areatexto.getText() + numerosEnteros +"\n");
            areatexto.setText(areatexto.getText() + numerosDecimales +"\n");
            areatexto.setText(areatexto.getText() + id +"\n");
            areatexto.setText(areatexto.getText() + errores +"\n");
            areatexto.setText(areatexto.getText() + "|-----------------------------------------------|\n\n");
        
    }
   
}




 /*try{
              if(esNumero==true ){
              if(ultimoNumero==true){
              if(!texto.substring(texto.length()-2, texto.length()-1).equals(".")){
              numerosEnteros=numerosEnteros +caracter +" ";
              System.out.println(texto.substring(i-1, i));
              }else{
              
              }
              
              }else if(ultimoNumero==false){
              if(!texto.substring(i-1, i).equals(".")&&!texto.substring(i+1, i+2).equals(".")){
              numerosEnteros=numerosEnteros +caracter +" ";
              System.out.println(texto.substring(i-1, i) +", " + texto.substring(i+1, i+2));
              }else{
              
              }
              }
              }else if(caracter.equals(".")){
              if(texto.substring(i-1, i).chars().allMatch( Character::isDigit )==true &&texto.substring(i+1,i+2 ).chars().allMatch( Character::isDigit )==true ){
              numerosDecimales=numerosDecimales + texto.substring(i-1, i+2) +" ";
              }
              }
              
              }catch(StringIndexOutOfBoundsException e){
              System.out.println("No hay mas caracteres despues de: " + caracter);
              }*/
