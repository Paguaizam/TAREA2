
package com.mycompany.tarea2;

/**
 *
 * @author Paul Aguaiza-Omar Moreira
 */
public class Tarea2 {

    public static void main(String[] args) {
        var Juan=new Empleado();
        Juan.nombre= "Juan";
        Juan.anioIngreso=2003;
        Juan.horasTrabajadas=160;
        Juan.costoHora=11.50;
         System.out.println("Nombre del empleado1:"+ Juan.nombre +"/" +
                 " Año de ingreso: "+ Juan.anioIngreso +"/" +" Gana "+ Juan.costoHora
                    +" por hora " +"/"+ " Trabajo " +Juan.horasTrabajadas+ " horas.");
        var actualJ=1000d;
        actualJ=Juan.calcularIngresos(2022);
        System.out.println("Ingreso: "+actualJ+" dolares");
        
        var bonoJ=100d;
        bonoJ=Juan.calcularBonoHorasExtra(150);
        System.out.println("Bono: "+bonoJ+" dolares");
        
        var impuestoJ=1000d;
        impuestoJ=Juan.calcularImpuesto(500,1000,2000);
        System.out.println("Impuesto: "+impuestoJ+" dolares");
        
        var valorTotalJ=actualJ+bonoJ-impuestoJ;
        System.out.println("Valor a pagar: "+valorTotalJ+" dolares");
        ////////////////////////////////////////////////////////////////////
        System.out.println("-------------------------------------------------------------");
        var Pablo=new Empleado();
        Pablo.nombre= "Pablo";
        Pablo.anioIngreso=2010;
        Pablo.horasTrabajadas=100;
        Pablo.costoHora=9;
         System.out.println("Nombre del empleado2 : "+ Pablo.nombre +"/" +
                 " Año de ingreso: "+ Pablo.anioIngreso +"/" +" Gana "+ Pablo.costoHora
                    +" por hora " +"/"+ " Trabajo " +Pablo.horasTrabajadas+ " horas.");
         var actualP=1000d;
        actualP=Pablo.calcularIngresos(2022);
        System.out.println("Ingreso: "+actualP+" dolares");
        
        var bonoP=1000d;
        bonoP=Pablo.calcularBonoHorasExtra(150);
        System.out.println("Bono: "+bonoP+" dolares");
        
        var impuestoP=1000d;
        impuestoP=Pablo.calcularImpuesto(500,1000,2000);
        System.out.println("Impuesto: "+impuestoP+" dolares");
        
        var valorTotalP=actualP+bonoP-impuestoP;
        System.out.println("Valor a pagar: "+valorTotalP+" dolares");
        
     //////////////////////////////////////////////////////////////////////////////////////////
     
         System.out.println("-------------------------------------------------------------");
        var Mariana=new Empleado();
        Mariana.nombre= "Mariana";
        Mariana.anioIngreso=2020;
        Mariana.horasTrabajadas=200;
        Mariana.costoHora=5;
         System.out.println("Nombre del empleado3 : "+ Mariana.nombre +"/" +
                 " Año de ingreso: "+ Mariana.anioIngreso +"/" +" Gana "+ Mariana.costoHora
                    +" por hora " +"/"+ " Trabajo " +Mariana.horasTrabajadas+ " horas.");
         var actualM=1000d;
        actualM=Mariana.calcularIngresos(2022);
        System.out.println("Ingreso: "+actualM+" dolares");
        
        var bonoM=1000d;
        bonoM=Mariana.calcularBonoHorasExtra(100);
        System.out.println("Bono: "+bonoM+" dolares");
        
        var impuestoM=1000d;
        impuestoM=Mariana.calcularImpuesto(500,1000,2000);
        System.out.println("Impuesto: "+impuestoM+" dolares");
        
        var valorTotalM=actualM+bonoM-impuestoM;
        System.out.println("Valor a pagar: "+valorTotalM+" dolares");
        
        
        
    }
}
