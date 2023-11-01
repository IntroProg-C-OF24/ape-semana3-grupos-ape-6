
package proyecto08;

public class Proyecto08 {

  
    public static void main(String[] args) {
        // Resolucion del Ejercicio
        int var1 = 10;
        int var2 = 9;
        int var3 = 20;
        int var4 = 500;
        int var5 = 2;
        int var6 = 3;
        int var7 = 200;
        int var8 = 50;
        int var9 = 51;
        double var10 = ((var1 * var2) + var3 - (var4 / var5) + Math.pow(var6, 2));
        double var11 = (var8 - var8 + var9);
        boolean resultado1 = var10 >= var7;
        boolean resultado2 = var8 >= var11;
        boolean resultadoFinal = resultado1 || resultado2;
        System.out.println("El resultado es: " + resultadoFinal);
        //Ejercicio 06 corregido por Rafaella Palacios
    }
    
}
