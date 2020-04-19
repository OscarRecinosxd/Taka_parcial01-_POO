package com.OARA.x00128519;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int AuxExtension;
        String AuxNombre, Puesto;
        short MesesContrato;
        double AuxSalario;
        System.out.println("Servicio profesional");

        try {
            System.out.println("Ingrese el nombre de la persona");
            AuxNombre = in.nextLine();

            System.out.println("Ingrese el puesto");
            Puesto = in.nextLine();

            System.out.println("Ingrese el salario");
            AuxSalario = in.nextDouble();
            in.nextLine();

            System.out.println("Ingrese los meses de contrato");
            MesesContrato = in.nextShort();
            in.nextLine();
            System.out.println();
            Empleado Persona = new ServicioProfesional(AuxNombre, Puesto, AuxSalario, MesesContrato);

            System.out.println(Persona.getNombre()+ " Sueldo base " +Persona.getSalario() +" Sueldo líquido "+ CalculadoraImpuestos.calcularPago(Persona));
            System.out.println("Descuentos de "+Persona.getNombre() +": "+ CalculadoraImpuestos.mostrarTotales());
        }catch (InputMismatchException NumeroInvalido){
            System.out.println("Error! ingrese datos válidos");
            in.nextLine();
        }

        System.out.println();
        System.out.println("Plaza fija");

        try{

            System.out.println("Ingrese el nombre de la persona");
            AuxNombre = in.nextLine();

            System.out.println("Ingrese el puesto");
            Puesto = in.nextLine();

            System.out.println("Ingrese el salario");
            AuxSalario = in.nextDouble();
            in.nextLine();

            System.out.println("Ingrese la extensión");
            AuxExtension = in.nextInt();
            in.nextLine();

            Empleado Persona1 = new PlazaFija(AuxNombre, Puesto, AuxSalario, AuxExtension);

            System.out.println(Persona1.getNombre()+ " Sueldo base " +Persona1.getSalario() +" Sueldo líquido "+CalculadoraImpuestos.calcularPago(Persona1));
            System.out.println("Descuentos de "+Persona1.getNombre() +": "+CalculadoraImpuestos.mostrarTotales());

        }catch (InputMismatchException NumeroInvalido){
        System.out.println("Error! ingrese datos válidos");
        }





    }
}
