
package petle;

import java.util.Scanner;


public class Petle {
    
    
    
          public static void zadanie1(){  
        
        Scanner in = new Scanner(System.in);
    
       int liczba = 0; 
       do{
       System.out.println("Podaj liczbe: ");
       liczba = in.nextInt();
     } while(liczba < 0 );  
       
       
       for (int b = 1 ; b <= liczba ; b+=2 ){  
           
           
           
            System.out.println(">" + b);          
                
     
       }
      }

   
    public static void main(String[] args) {
        
        
  
     

           }
    
}
