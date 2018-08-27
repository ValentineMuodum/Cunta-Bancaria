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
public class Cuenta {
  private int numero;
  private int clave;
  private String dueno;
  private double saldo; 
  public static int global=10;
public Cuenta(int a, int clave, String dueno, double saldo){
this.numero = a;
this.clave = clave;
this.dueno = dueno;
this.saldo = saldo;
}
public boolean Consignar(double dinero){
    if(dinero>=0){
        this.saldo+=dinero;
        System.out.println("Transaccion Exitosa");
        return true;
    }else{
        System.out.println("Transaccion fallida");
        return false;
    }
}
public boolean retirar(double valor){
    if(valor>0&&valor<this.saldo){
        this.saldo-=valor;
        System.out.println("Transaccion Exitosa");
        return true;
    }else{
        System.out.println("Transaccion fallida");
        return false;
    }
}
public boolean cambiarClave(int nueva){
    if(nueva!=this.clave){
        this.clave=nueva;
        System.out.println("Cambio de clave Exitoso");
        return true;
    }else{
        System.out.println("Cambio de clave Fallido");
    return false;
    }
}

public double consultar(){
    return this.saldo;
}   



public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public String getDueno() {
        return dueno;
    }

    public void setDueno(String dueno) {
        this.dueno = dueno;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }



}