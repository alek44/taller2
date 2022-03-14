
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
public class ejercicio5 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
         
        int manzana, piña, pera, naranja, fresas, melon,num,calo;
      
        System.out.println("****ensalada de frutas****");
        
        manzana = 52;
        piña = 55;
        pera = 55;
        naranja = 45;
        fresas = 32;
        melon = 54;
        
        System.out.println("cuantas manzanas comiste?: ");
        num = entrada.nextInt();
        manzana = num * manzana;
        
        System.out.println("cuantas piñas comiste?: ");
        num = entrada.nextInt();
        piña = num * piña;
        
        System.out.println("cuantas peras comiste?: ");
        num = entrada.nextInt();
        pera = num * pera;
        
        System.out.println("cuantas naranjas comiste?: ");
        num = entrada.nextInt();
        naranja = num * naranja;
        
        System.out.println("cuantas fresas comiste?: ");
        num = entrada.nextInt();
        fresas = num * fresas;
        
        System.out.println("cuantas melones comiste?: ");
        num = entrada.nextInt();
        melon = num * melon;
        
        calo = manzana + piña + pera + naranja + fresas + melon;
        
        System.out.println("el numero de calorias es: "+calo);
        
    }
    
}


