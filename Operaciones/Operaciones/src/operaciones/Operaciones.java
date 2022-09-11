/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones;

/**
 *
 * @author Piedad
 */
public class Operaciones {

    public static void main(String[] args) {
        int numero_uno =10;
        int numero_dos = 2;
        int resultado = 0;
        
        resultado= numero_uno + numero_dos;
        System.out.println("El resultado de " +numero_uno +" más " +numero_dos +" es: "+resultado);
        System.out.println("El resultado de la suma es: "+resultado);

        
        resultado= numero_uno - numero_dos;
        System.out.println("El resultado de " +numero_uno +" menos " +numero_dos +" es: "+resultado);
        System.out.println("El resultado de la resta es: "+resultado);
        
        resultado= numero_uno * numero_dos;
        System.out.println("El resultado de multiplicar " +numero_uno +" por " +numero_dos +" es: "+resultado);
        System.out.println("El resultado de la multiplicación es: "+resultado);

        resultado= numero_uno/ numero_dos;
        System.out.println("El resultado de dividir " +numero_uno +" entre " +numero_dos +" es: "+resultado);
        System.out.println("El resultado de la división es: "+resultado);
        
    }
    
}
