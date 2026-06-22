package dgtic.core.ejercicios.SistemaPedidos;

import java.util.Scanner;

public class Sistema2P0 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuantos productos deseas registrar?");
        int n= sc.nextInt();
        Producto[] productos = new Producto[n];
        String producto="";
        double precio =0,subtotal=0, total = 0, descuento =0;
        int cantidad=0;
        sc.nextLine();
        for(int i=0; i<productos.length; i++){
            System.out.println("Nombre del producto: ");
           producto=sc.nextLine();
            do{
                System.out.println("Precio del producto: ");
                precio = sc.nextDouble();
                if(precio<0){
                    System.out.println("No se pueden ingresar valores negativos");
                }
            }while(precio<0);
            do{
                System.out.println("Cantidad");
                cantidad = sc.nextInt();
                if(cantidad<=0){
                    System.out.println("Debes ingresar al menos un producto");
                }
            }while(cantidad<=0);
            sc.nextLine();
            productos[i]=new Producto(producto,precio,cantidad);

        }


        for(int j =0; j<productos.length; j++){
            subtotal = subtotal + productos[j].calcularSubTotal();
        }

        if(subtotal > 1000){
            descuento=subtotal*(0.10);
        } else if (subtotal>500 && subtotal <=1000) {
            descuento = subtotal*(0.05);
        }
        total=subtotal-descuento;

        for(int k =0; k<productos.length; k++){
            System.out.println("Producto " + (k+1) +" : " + productos[k].getProducto() );
            System.out.println("Precio: " + productos[k].getPrecio());
            System.out.println("Cantidad: " + productos[k].getCantidad());
            System.out.println();
        }
        System.out.println("Subtotal: " + subtotal);
        System.out.println("Descuento: " + descuento);
        System.out.println("Total final: " + total);



    }
    }

