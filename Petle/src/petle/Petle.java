package petle;

import java.util.Scanner;

public class Petle {

    public static void zadanie1() {

        Scanner in = new Scanner(System.in);

        int liczba = 0;
        do {
            System.out.println("Podaj liczbe: ");
            liczba = in.nextInt();
        } while (liczba < 0);

        for (int b = 1; b <= liczba; b += 2) {

            System.out.println(">" + b);

        }
    }
    
    public static void zadanie2() {
       Scanner in = new Scanner(System.in);

        System.out.println("Podaj liczbe 1:");
        int liczba1 = in.nextInt();

        int liczba2 = 0;
        do {
            System.out.println("Podaj liczbe 2: ");
            liczba2 = in.nextInt();
        } while (liczba1 > liczba2);

        int i = liczba1;
        int suma = 0;
        int j = liczba2;

        do {
            suma = i + suma;

            i++;

        } while (i <= j);

        System.out.println(">" + suma);
        suma = 0;
        i = liczba1;

        while (i <= j) {

            suma = suma + i;
            i++;
        }
        System.out.println(">" + suma);

       
        suma = 0;

        for (i = liczba1;  i <= j;  i++ ) {
           
            suma = suma + i;

        }
        System.out.println(">" + suma);
    }   
        public static void zadanie3() {
            
        Scanner in = new Scanner(System.in);
        int liczba = 0;
        do {
            System.out.println("Podaj liczbe: ");
            liczba = in.nextInt();
        } while (liczba < 0);
        int potega = 0;
        
        for(int i=1; i<liczba; i= i*2){        
                      
        System.out.println(">"+ i);
  
}
        }  
    
    


    public static void main(String[] args) {
            
       Scanner in = new Scanner(System.in);
        int liczba = 0;
        do {
            System.out.println("Podaj liczbe: ");
            liczba = in.nextInt();
        } while (liczba < 0);
        
        
        
  
}
}
}