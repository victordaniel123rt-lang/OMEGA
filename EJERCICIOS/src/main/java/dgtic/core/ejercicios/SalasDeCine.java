package dgtic.core.ejercicios;

import java.util.Scanner;

public class SalasDeCine {
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
        String[][] sala = {
                {"L", "L", "L", "L", "L", "L", "L", "L"},
                {"L", "L", "R", "R", "L", "L", "L", "L"},
                {"R", "R", "R", "R", "R", "R", "R", "R"},
                {"L", "L", "L", "L", "L", "L", "L", "L"},
                {"L", "R", "L", "L", "L", "R", "L", "L"}
        };

        imprimirSala(sala);
        System.out.println("Indica la fila y el asiento de tu agrado:  ej: 12 (Fila 1 asiento 2)");
        int r = sc.nextInt(); int s = sc.nextInt();
        if(sala[r-1][s-1].equals("R")){
            System.out.println("Ese asiento ya está ocupado");

        }else{
            sala[r-1][s-1]="R";
            System.out.println("Asiento reservado correctamente");
        }



        imprimirSala(sala);
    }

    public static void imprimirSala(String[][] sala){
        //Iterar sobre las filas
        for(int i =0; i<sala.length; i++){
            System.out.print("Fila " + (i+1));
            //Iterar sobre las columnas
            for(int j=0; j<sala[i].length; j++){
                System.out.print(" " + sala[i][j] + " ");
            }
            System.out.println();
        }
    }


}
