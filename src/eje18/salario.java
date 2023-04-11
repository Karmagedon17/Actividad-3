package eje18;

public class salario {
    public static double salarioBruto(double a,double b){
        double bruto = a*b;
        return bruto;
    }
        public static double salarioNeto(double a,double b,double c){
        double neto = (a*b)-(c/100*(a*b));
        return neto;
        }
}
