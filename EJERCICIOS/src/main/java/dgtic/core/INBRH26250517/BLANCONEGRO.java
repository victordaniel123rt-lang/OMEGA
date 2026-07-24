package dgtic.core.INBRH26250517;

import java.util.Scanner;

public class BLANCONEGRO {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String entrada = sc.nextLine().toLowerCase();
        String[] partes = entrada.split(" ");
        String comando = partes[0];
        int x = Integer.parseInt(partes[1]);
        char letra = comando.charAt(0);
        int y = letra-96;
        int valor = x+y;
        if(valor>16){System.exit(0);}
        if(valor%2==0){
            System.out.print("NEGRO");
        }else {
            System.out.print("BLANCO");
        }
    }
}
