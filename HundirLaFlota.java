package Arrays;

import java.util.Scanner;

public class HundirLaFlota {
    public static void createShips(int numShips, int[][] shipPlaces) {
        int r1, r2;
        int cont = 0;
    
        while (cont < numShips) {
            r1 = (int) (Math.random()*8); 
            r2 = (int) (Math.random()*8);
            if (shipPlaces[r1][r2] != 1) {
                shipPlaces[r1][r2]=1;
                cont++;
            }
        }
    }
    public static void main(String[] args) {
        Scanner lector = new Scanner (System.in);
        int numerobarcosvivos=8;
        int columna;
        int fila;
        int[][] shipPlaces=new int[8][8];
        createShips(10, shipPlaces);
       
      
    

       while(numerobarcosvivos!=0){

        System.out.println("introduce columna:");
        columna = lector.nextInt();

        System.out.println("introduce fila:");
        fila = lector.nextInt();

        if(shipPlaces[fila][columna]==1){

            System.out.println("DADO");

        }else{

            System.out.println("AGUA");


        }




       }
}
}