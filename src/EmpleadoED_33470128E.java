
import java.util.*;

/**
 *
 * @author Gabriel Castell_33470128E
 * @version 1.0
 */
public class EmpleadoED_33470128E {

    
    static final double FACTOR_HORA_EXTRA = 1.2;
    private String nombreCompleto, dni;
    private double salarioBasePorHora = 10.56;
    
    /**
     * @param nombreCompleto Nombre del empleado en mayusculas
     * @param dni Dni del empleado con letra en mayuscula y sin guion
     */
    
    public EmpleadoED_33470128E(String nombreCompleto, String dni) {
        this.nombreCompleto = nombreCompleto;
        this.dni = dni;
    }
 
    /**
     * @param horasExtra Nos indica el numero de horas al mes a la baja en numero entero
     * @return La suma del salario mas el sueldo por horas realizadas.
     */
    public double getSalarioEsteMes(int horasExtra) {
        double cantidadExtra, salarioFinal;
        cantidadExtra = horasExtra * this.salarioBasePorHora *
        FACTOR_HORA_EXTRA;
        salarioFinal=this.salarioBasePorHora * 40 * 4 + cantidadExtra;
        salarioFinal=(double)Math.round(salarioFinal * 100d) / 100d;
        return salarioFinal;
    }
    
// Este método no lo comentaremos con JavaDoc
    
    public static void main(String[] args) {
        EmpleadoED_33470128E emp = new EmpleadoED_33470128E ("GABRIEL CASTELL",
        "33470128E");
        int horasExtra = 2;
        System.out.println("El salario de " + emp.nombreCompleto + " este mes será de " + emp.getSalarioEsteMes(horasExtra) 
        + " euros, al hacer " + horasExtra + " + horas extra."); 
        
    }    
       
}