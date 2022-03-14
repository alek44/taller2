/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */

public class ejercicio2 {
    
    public static void main(String[] args) {
        int num1 = 7, num2 = 5, num3 = 8;
        float sum, prom, prod, coci, modu;
        sum = num1 + num2 + num3;
        prom = sum/3;
        prod = num1 * num2 * num3;
        coci = num1 / num2 / num3;
        modu = (num1 % num2 % num3);
         
         System.out.printf("El suma es: "+sum+"\n");
         System.out.printf("el promedio es: "+prom+"\n");
         System.out.printf("El producto es: "+prod+"\n");
         System.out.printf("El modulo es: "+modu+"\n");
         
         
    }
}

