
package proyecto10;

public class Proyecto10 {

    public static void main(String[] args) {
        // Resolución del problema 
       int var1 = 25;
        int var2 = 10;
        int var3 = 100;
        int var4 = 5;
        int var5 = 2;
        double var6 = (Math.sqrt(var1) * var2);
        double var7 = (var2 / var4);
        boolean resultado1 = var6 >= var3;
        boolean resultado2 = var7 >= var5;
        boolean resultadoFinal = resultado1 && true || false || resultado2;
        System.out.println("El resultado es: " + resultadoFinal); 
    }
    
}
