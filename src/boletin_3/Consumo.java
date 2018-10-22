/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_3;

/**
 *
 * @author slorenzorodriguez
 */
public class Consumo {
    //atributos
    private float km;
    private float litros;
    private float vMed;
    private float pGas;
    //constructores 
    public Consumo (){ //sin parámetros 
    }
    
    public Consumo (float a, float b, float c, float d){ //con parámetros
        km = a;
        litros = b;
        vMed = c;    
        pGas = d;        
    }  
    //
    public void setKm(float a){
        km=a;
    }
    public float getKm(){
        return km;
    }
    public void setVMed(float c){
        vMed=c;
    }
    public float getVMed(){
        return vMed;
    }
    public float Tiempo(){
        float tiempo = km/vMed;
        return tiempo;
    }
    public void setLitros(float b){
        litros=b;
    }
    public float getLitros(){
        return litros;
    }
    public void setPGas(float d){
        pGas= d;
    }
    public float getPGas (){
        return pGas;
    }
    public float consumoMedio(){
        float consumoMedio = (km/100)*litros;
        return consumoMedio;
    }
    public float consumoEuros(){
        float consumoEuros = pGas*(km/100*litros);
        return consumoEuros;
    }
}
