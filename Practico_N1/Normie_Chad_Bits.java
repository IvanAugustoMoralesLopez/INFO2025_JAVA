// Suma de dos numeros bits
package Practico_N1;

public class Normie_Chad_Bits {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int suma = a + b;
        String tipo = ((suma % 2) == 0) ? "par" : "impar"; //el ? es un "if" y el ":" es un "else"

        System.out.println("La suma da: " + suma + " y es un numero: " + tipo);
        
    }
}