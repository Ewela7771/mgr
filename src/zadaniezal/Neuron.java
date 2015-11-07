package zadaniezal;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ewelina
 */
public class Neuron {
    private double[] wejscia;
    //private double[] wyjscia;
    
    Aktywacja akt = new Aktywacja();
    
    
    public Neuron(int n){
        wejscia = new double[n];
       
       for(int i=0; i<n; i++){
           wejscia[i] = 10*Math.random(); // losujemy wartosci z przedzialu (-1,1)
           System.out.print("wejscia: \t" + wejscia[i] + "\n");
       }
    }
    
    public void setWejscia (double[] wartosc){
        this.wejscia = wartosc;
    }
    
    public double[] getWejscia(){
        return wejscia;
    }
    
   /* 
    public void setWyjscia (double[] wartosc){
        this.wyjscia = wartosc;
    }
    
    public double[] getWyjscia(){
        return wyjscia;
    }
    
    public void obliczWyjscie(double[]wejscia, double suma){
        
    }
    */
}
