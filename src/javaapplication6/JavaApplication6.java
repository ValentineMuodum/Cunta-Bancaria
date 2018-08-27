/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

/**
 *
 * @author Estudiante
 */
import java.util.Scanner;
public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lectura= new Scanner(System.in);
        System.out.println("Ingrese el numero de la cuenta");
        int cuenta=lectura.nextInt();
        System.out.println("Ingrese la clave");
        int clave=lectura.nextInt();
        System.out.println("Ingrese dueno");
        String dueno=lectura.next();
        System.out.println("Saldo");
        double saldo=lectura.nextDouble();
        Cuenta c1 = new Cuenta(cuenta,clave,dueno,saldo);
        
        System.out.println("Numero " + c1.getNumero());
        System.out.println("Clave " + c1.getClave());
        System.out.println("Dueno " + c1.getDueno());
        System.out.println("Saldo " + c1.getSaldo());
        System.out.println("Global" + Cuenta.global);
        c1.setClave(56878);
        System.out.println("Clave" + c1.getClave());    
    }
    
}
