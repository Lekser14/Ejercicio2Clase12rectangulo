import java.util.Scanner;

public class Ejercicio2 {
    //TODO Ejercicio
        /*
         * Ejercicio 
         * - Crear la funcion superficieRectangulo, ingresa como parámetros dos lados
         * y devuelve el calculo de superficie.
         * 
         * - Crear la funcion perimetroRectangulo, ingresa como parámetros dos lados
         * y devuelve el calculo devuelve el perimetro.
         * 
         */


    static int Perimetro(int lado1, int lado2){
        int perimetro;
        perimetro = (lado1+lado2)*2;
        return perimetro;
}

    static int Superficie(int lado1, int lado2){
        int superficie;
        superficie = (lado1*lado2);
        return superficie;
}
    public static void main(String[] args) {
        

        System.out.println("Ingrese el lado 1: ");
        int lado1=new Scanner(System.in).nextInt();
        System.out.println("Ingrese el lado 2: ");
        int lado2=new Scanner(System.in).nextInt();
        
                
        Perimetro(lado1, lado2);
        System.out.println(("El perimetro es:") +Perimetro(lado1, lado2));
        Superficie(lado1, lado2);
        System.out.println(("La superficie es:") +Superficie(lado1, lado2));

       

    }
}