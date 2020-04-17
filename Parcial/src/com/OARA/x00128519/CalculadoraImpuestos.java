package com.OARA.x00128519;

public class CalculadoraImpuestos {
    private static double totalRenta;
    private static double totalISSS;
    private static double totalAFP;


    private CalculadoraImpuestos() {
        totalRenta=0;
        totalISSS=0;
        totalAFP=0;
    }

    public static double calcularPago(Empleado empleado){
        if(empleado instanceof ServicioProfesional){
            totalRenta= 0.1*empleado.getSalario();
            return empleado.getSalario()-totalRenta;
        }
        else{

            return 0;
        }

    }

    @Override
    public  String toString() {
        return "CalculadoraImpuestos{" +
                "totalRenta=" + totalRenta +
                ", totalISSS=" + totalISSS +
                ", totalAFP=" + totalAFP +
                '}';
    }
}
