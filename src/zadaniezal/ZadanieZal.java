
package zadaniezal;

public class ZadanieZal {

  
    
    
    
    
    public static void main(String[] args) {
       
    Neuron neuron = new Neuron(10);
    
    Aktywacja aktywacja = new Aktywacja();
    double[][] zbior_treningowy = {{1,2,3},
                                {4,5,6},
                                {7,8,9}};
    double prog = 0.1;
    double blad = 0.0;
   
    
    
    
    while(true){
        
       int licznik =0; 
       Waga waga = new Waga(neuron.getWejscia().length);
       for(int i=0; i<zbior_treningowy.length; i++){
           
           
            double suma = 0.0;
          
            for(int k=0; k<zbior_treningowy[i].length; k++){
                suma += waga.getWagi()[k] * zbior_treningowy[i][k];
                //System.out.print("Suma: " + suma + "\t waga[k]: " + waga.getWagi()[k] + "\t zbior treningowy: "+ zbior_treningowy[i][k] + "\n" );
            }
           
            double wyjscie = aktywacja.funkcjaAktywacji(suma);
          System.out.println("Docelowe wyjscie: " + zbior_treningowy[i][1] + ",\t "
                        + "Obliczone wyjscie: " + wyjscie);
  
       
                blad = zbior_treningowy[i][1] - wyjscie;
                  System.out.print("blad: "+ blad);
                
                if(blad != 0){
                    licznik++;
                }
       
                
                for(int ii=0; ii < zbior_treningowy[i].length; ii++) {
                    waga.getWagi()[ii] += prog * blad * zbior_treningowy[i][ii];System.out.println("Uaktualnione wagi " + waga.getWagi());
                }
       }
                System.out.println("Uaktualnione wagi " + waga.getWagi());
                System.out.println();
                
                if(licznik == 0){
                System.out.println("Koncowe wagi: " + waga.getWagi());
                System.exit(0);
            }
       }
    }
    
   
    }
    

