package dgtic.core.TopComprador;

import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Map<String, List<Integer>> montos = new HashMap<>();
        List<Compra> compras = new ArrayList<>();
        List<Compra> ordenados = new ArrayList<>();
        int maximo = 0;
        System.out.println("¿Cuantas compras quieres implementar?");
        int n = sc.nextInt();
        sc.nextLine();
        for(int i =1; i<=n; i++){
            System.out.println("Nombre del cliente: ");
            String nombre = sc.nextLine().toLowerCase();
           System.out.println("Monto: ");
           int monto = sc.nextInt();
           sc.nextLine();

           if(montos.containsKey(nombre)){
               montos.get(nombre).add(monto);
           }else{
               List<Integer> lista = new ArrayList<>();
               lista.add(monto);
               montos.put(nombre,lista);
           }
        }
        for(String nombre : montos.keySet()){
            int total =0;
            List<Integer> compra = montos.get(nombre);
           for(int m : compra){
               total = total + m;
           }
           Compra c = new Compra(total,nombre);
           compras.add(c);
        }
        while(!compras.isEmpty()){
            Compra primero = compras.get(0);
            for(int i=0; i< compras.size(); i++){
                Compra co = compras.get(i);
                if(co.getMonto()>primero.getMonto()) {
                    primero=co;
                }
            }
            ordenados.add(primero);
            compras.remove(primero);
        }

        for(Compra c : ordenados){
            System.out.println(c.getUsuario() + " = " + c.getMonto());
        }
        System.out.println("Resultado: " + ordenados.get(0).getUsuario());




    }


}
