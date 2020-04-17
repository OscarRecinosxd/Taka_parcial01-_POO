package com.OARA.x00128519;

public class Main {

    public static void main(String[] args) {
        Empleado Persona = new ServicioProfesional("Oscar Agustin", "Gerente", 3000, 12);
        Empleado Persona1 = new PlazaFija("Josue Arteaga", "Ingeniero informático", 2000, 2);
        Empleado Persona2 = new PlazaFija("Oscar Agustin", "Gerente", 200, 12);

        System.out.println(CalculadoraImpuestos.calcularPago(Persona));
        System.out.println(CalculadoraImpuestos.mostrarTotales());

        System.out.println(CalculadoraImpuestos.calcularPago(Persona1));
        System.out.println(CalculadoraImpuestos.mostrarTotales());

        System.out.println(CalculadoraImpuestos.calcularPago(Persona2));
        System.out.println(CalculadoraImpuestos.mostrarTotales());





    }
}
