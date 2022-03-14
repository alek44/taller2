/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
public class ejercicio3 {
    public static void main (String[] args) {
        
        double iva=.27,util=.8,preci=8.700;
        double I,U,precito;
        
        I= preci*iva;
        U= preci * util;
        
        precito = preci + I + U;
        
        System.out.printf("El precio final de venta del articulo es = %f%n", precito);
        
    }
}
