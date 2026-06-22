package dgtic.core.ejercicios.SistemaPedidos;

import java.util.Scanner;

public class SistemaDePedidos {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuantos productos deseas registrar?");
        int n= sc.nextInt();
        sc.nextLine();
        double p=0;
        int c=0;
        String[] arr1 = new String[n];
        double[] arr2 = new double[n];
        double subtotal=0, total = 0, descuento =0;
        int[] arr3 = new int[n];
        for(int i=0; i<n; i++){
            System.out.println("Nombre del producto: ");
            arr1[i]=sc.nextLine();
            do{
                System.out.println("Precio del producto: ");
                p = sc.nextDouble();
                if(p<0){
                    System.out.println("No se pueden ingresar valores negativos");
                }else{
                    arr2[i]=p;
                }
            }while(p<0);
           do{
               System.out.println("Cantidad");
               c = sc.nextInt();;
               sc.nextLine();
               if(c==0){
                   System.out.println("Debes ingresar al menos un producto");
               }else {
                   arr3[i]=c;
               }
           }while(c==0);

        }
        for(int j =0; j<n; j++){
            subtotal = subtotal + (arr2[j]*arr3[j]) ;
        }

        if(subtotal > 1000){
        descuento=subtotal*(0.10);
        total = subtotal-descuento;
        } else if (subtotal>500 && subtotal <=1000) {
            descuento = subtotal*(0.05);
            total=subtotal-descuento;
        }else {
            total=subtotal;
        }

        for(int k =0; k<n; k++){
            System.out.println("Producto " + k +1+ " : " + arr1[k]);
            System.out.println("Precio: " + (int)arr2[k]);
            System.out.println("Cantidad: " + arr3[k]);
            System.out.println();
        }
        System.out.println("Subtotal: " + (int)subtotal);
        System.out.println("Descuento: " + (int)descuento);
        System.out.println("Total final: " + (int)total);



    }

}
