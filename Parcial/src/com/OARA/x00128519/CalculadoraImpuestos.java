package com.OARA.x00128519;

 public class CalculadoraImpuestos {
    private static double totalRenta;
    private static double totalISSS;
    private static double totalAFP;


    private CalculadoraImpuestos() {
    }

    public static double calcularPago(Empleado empleado){
        totalRenta=0;
        totalISSS=0;
        totalAFP=0;
        if(empleado instanceof ServicioProfesional){
            totalRenta= 0.1*(empleado.getSalario());
            return empleado.getSalario()-totalRenta;
        }
        else{
            double Restante;
            totalAFP = 0.0625 * (empleado.getSalario());
            totalISSS = 0.03 * (empleado.getSalario());
            Restante=(empleado.getSalario())-totalAFP-totalISSS;

            if(Restante >= 0.01 && Restante <= 472){
                return Restante;
            }
            else if(Restante >= 472.01 && Restante <= 895.24){
                totalRenta = 0.1*(Restante-472)+17.67;
                return (Restante-totalRenta);
            }
            else if(Restante >= 985.25 && Restante <=2038.10){
                totalRenta = 0.2*(Restante-895.24)+60;
                return (Restante-totalRenta);
            }
            else if (Restante >= 2038.11 ){
                totalRenta = 0.3*(Restante-2038.10)+288.57;
                return (Restante-totalRenta);
            }
            return 0;
        }
    }

    public static String mostrarTotales(){
        return "Renta " + totalRenta + " ISSS " +totalISSS + " AFP " + totalAFP;
    }
}
