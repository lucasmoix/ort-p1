
package ejercicio10_guia1;


public class Matematica {
    
    public static double sumarPorcentaje(double a, double b){
        return a+calcularPorcentaje(a,b);
    }
    public static double calcularPorcentaje(double a,double b){
        return (a*b)/100;
    }
}
