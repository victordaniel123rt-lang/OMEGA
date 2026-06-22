package dgtic.core.Omega;

import java.util.Scanner;

public class PagoHoras {
    public static Scanner sc= new Scanner(System.in);
    public static int x=sc.nextInt();
    public static double y=sc.nextDouble();
    public static double sueldo=0;
    public static double seg=0;

    public static void main(String args[]){
        if(x>=0 && x<=70 && y>0  && y<=45){
            if(x<=40){
                sueldo=cuarenta();
            }else if(x>40 && x<=50){
                sueldo=MasCuarenta();
            }else if(x>50){
                sueldo=MasCincuenta();
            }
            System.out.println(sueldo);
        }

    }

    public static Double cuarenta(){
        sueldo = x*y;
        return sueldo;
    }

    public static Double MasCuarenta(){
        seg=(int) (x/Math.pow(10, (int)Math.log10(x)-1))%10;
        sueldo=40*y+seg*((y*1.5));
        return sueldo;
    }

    public static Double MasCincuenta(){
        seg=(int) (x/Math.pow(10, (int)Math.log10(x)-1))%10;
        sueldo=40*y+10*((y*1.5))+seg*(((40*y)*2));
        return sueldo;
    }


}
