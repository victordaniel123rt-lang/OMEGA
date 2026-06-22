package dgtic.core.congaDeBingo;

import java.util.*;


public class LaCongaDeBingo {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int contador =1;
        Set<int[]> lml = new HashSet<>();
        int n = sc.nextInt();
        List<int[]> filas = new ArrayList<>();
        for(int i =1; i<=n; i++){
            int a = sc.nextInt();
            int e = sc.nextInt();
            int c = sc.nextInt();
            int[] corgi = new int[3];
            corgi[0]=a; corgi[1]=e; corgi[2]=c;
            filas.add(corgi);
        }

        for(int i=0; i< filas.size(); i++){
            int[] l = filas.get(i);
            for(int j =i+1; j< filas.size(); j++){
                int[] m = filas.get(j);
                if(m[0]>l[0] && m[1]>l[1] && m[2]>l[2]){
                   contador++;
                   lml.add(m);
                   filas.remove(m);
                   break;
                }
            }
        }
        if(lml.isEmpty()) contador=0;

        System.out.println(contador);
    }
}
