/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea2;

/**
 *
 * @author Paul Aguaiza
 */
public class Empleado {
    String nombre;
    int horasTrabajadas;
    double costoHora;
    int anioIngreso;
    
    public double calcularIngresos(int anioActual){
        var retorno=10000d;
        retorno=(((anioActual-anioIngreso)*0.02*costoHora)+costoHora)*horasTrabajadas;
        return retorno;
    }
    public double calcularBonoHorasExtra(int maximoHorasTrabajadas){
        var retorno=1000D;
        if(this.horasTrabajadas>maximoHorasTrabajadas){
            retorno=this.horasTrabajadas-maximoHorasTrabajadas;
            retorno=(2*this.costoHora)*retorno;
        } else{
            retorno=0d;
        }
        return retorno;
    }
    public double calcularImpuesto(int limite1, int limite2, int limite3){
        var retorno=10d;
        if(this.calcularIngresos(anioIngreso)>=0 && this.calcularIngresos(anioIngreso)<=limite1)
           retorno=0;
        if(this.calcularIngresos(anioIngreso)>=limite1 && this.calcularIngresos(anioIngreso)<=limite2)
           retorno=this.calcularIngresos(anioIngreso)*0.05;
        if(this.calcularIngresos(anioIngreso)>=limite2 && this.calcularIngresos(anioIngreso)<=limite3)
           retorno=this.calcularIngresos(anioIngreso)*0.12;
        if(this.calcularIngresos(anioIngreso)>limite3)
            retorno=0.25*this.calcularIngresos(anioIngreso);
        return retorno;
        
        
    }
}
