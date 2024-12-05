/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problemas;

/**
 *
 * @author reroes
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            double fahrenheit = 20;
        double incremento = 4;
        double acumulador = 0;
        double celsius;

     for (int i = 0; i <= 20; i++) {
            celsius = (fahrenheit - 32) * 5 / 9;
            acumulador = acumulador + celsius;  

            System.out.printf("Operación(%d) Fahrenheit: %.2f ===> "
                    + "Celsius: %.2f\n", i, fahrenheit, celsius);

            fahrenheit = fahrenheit + incremento;  
        }

        System.out.println("\nAcumulador de Celsius: " + acumulador);
    }
}

    
    

