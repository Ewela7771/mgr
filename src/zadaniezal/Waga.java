/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadaniezal;

/**
 *
 * @author Ewelina
 */
public class Waga {
    private double[] wagi;
     
    public Waga(int n){
       wagi = new double[n];
       
       for(int i=0; i<n; i++){
           wagi[i] = -1 + 2*Math.random(); // losujemy wagi z przedzialu (-1,1)
           System.out.print("wagi pocztakowe: \t" + wagi[i] + "\n");
       }
    }
    
    
    public void setWagi (double[] wartosc){
        this.wagi = wartosc;
    }
    
    public double[] getWagi(){
        return wagi;
    }
}
