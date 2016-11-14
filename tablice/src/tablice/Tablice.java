/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablice;

import java.util.Random;

/**
 *
 * @author student
 */
public class Tablice {

        public static void zadanie1() {
      
        
         int max =0;
         int min=0;
         int suma=0;
         int srednia=0;
        Random Los = new Random();       
        int [] tablica = new int[10];
        for (int i=0; i < tablica.length; i++){
        tablica[i] =(Los.nextInt(21)-10);
       
        if (tablica[i] > max){
        
        max = tablica[i]; 
            
        }
        if(tablica[i] < min){
        
        min = tablica[i];
        
        }
        suma = suma + tablica[i];
        
        srednia = suma /10;          
        
        }
        System.out.println("Max:"+ max);
        System.out.println("Min:"+ min);
        System.out.println("Suma do sredniej"+suma );
        System.out.println("Srednia:"+ srednia);
        
        for (int i = 0; i < tablica.length; i++) {
            System.out.print(tablica[i] + ",");
            
        }
      System.out.println("Od tylu:");
        for (int i = tablica.length - 1 ; i >= 0; i--) {
            
            System.out.print(tablica[i]+",");
        }
            
        }
        
        
    public static void zadanie2() {
      
           Random Los = new Random();       
        int [] tablica = new int[20];
        for (int i=0; i < tablica.length; i++){
        tablica[i] =Los.nextInt(11);
        
       }
        
        int [] powtorki = new int[11];
                
        
        
        for (int i = 0; i < tablica.length; i++) {
            System.out.print(tablica[i]+",");       
           
        }
        System.out.println("<br>Porow:");
             for (int i = 0; i < powtorki.length; i++) {
               
            int el = tablica[i];
            powtorki[el] = powtorki[el] +1; 
            System.out.println(i +":"+powtorki[el]);
        }
        
}
        public static void main(String[] args){ 
 
           Random Los = new Random();       
        int [][] tablica = new int[5][5];
        for (int i=0; i < tablica.length- 1; i++){            
            for (int j = 0; j < tablica[i].length; j++) {
              
                 tablica[i][j] =(Los.nextInt(6)-5);
                
                 
                
            }
}
            for (int j = 0; j < 5; j++) {
                
                for (int k = 0; k < 5; k++) {
                    System.out.println(  tablica[j][k]);
                    
                }
 
                
            }
         
          
       }
}
     
        
    
    

