
package proyecto06;

public class Proyecto06 {

    public static void main(String[] args) {
        // resolucion del Ejercicio
        int var1 = 81;
        int var2 = 9;
        int var3 = 3;
        int var4 = 10;
        int var5 = 1;
        double var6 = (Math.sqrt(var1) + var2)/var3;
        boolean resultado1;
        resultado1 = var6 == var2;
        boolean resultado2;
        resultado2 = var4 >= var5;
        boolean resultadoFinal;
        resultadoFinal = resultado1 && resultado2;
        System.out.println("El resultado es: " + resultadoFinal);
        //corregido por Rafaella Palacios
    }
    
}
