
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
public class ejercicio4 {
    public static void main (String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        int nd,lg;
        float kl,pro,esta,peaje,tt;
        
        System.out.print("cuantos dias de viaje fueron: \n");
        nd = entrada.nextInt();
        
        System.out.print("cuantos kilometros condujo por dia: \n");
        kl = entrada.nextFloat();
        
        System.out.println("cuanto costo el litro de gaolina: \n");
        lg = entrada.nextInt();
        
        pro = (kl * lg) / nd;
        
        System.out.print("cuanto costo el pago por estacionamiento por dia: \n");
        esta = entrada.nextFloat();
        
        System.out.println("cuanto fue el costo del peaje: ");
        peaje = entrada.nextInt();
        
        kl = (esta + lg) * nd;
        peaje = peaje * nd;
        
        tt = kl + pro + peaje;
        
        System.out.println("el promedio de kilemetros por litro de gasolina es: "+pro);
        System.out.print("el total a gastar por "+nd+" dias de vaije es: "+tt+"\n");
        
        
    }
}
