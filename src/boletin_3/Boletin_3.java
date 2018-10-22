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
public class Boletin_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Consumo Consumo = new Consumo(); //creo objeto consumo con todos los valores a 0
         Consumo.setLitros(50f);
         Consumo.setPGas(1.5f);
         
         Consumo Consumo1=new Consumo (100f,10f,150f,1.4f); //creo objeto con los valores ya dados
         System.out.println("El consumo medio será de "+ Consumo1.consumoMedio()+ " litros");   
         System.out.println("El consumo de euros será de "+ Consumo1.consumoEuros()+ " euros");
         System.out.println("El tiempo empleado será de "+ Consumo1.Tiempo());
         Consumo1.setLitros(15f);
         System.out.println("velocidade media é igual a "+ Consumo1.getVMed()+" kilometos/hora");
    
    }
    
}
