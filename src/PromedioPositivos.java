import java.util.ArrayList;
import java.util.Scanner;

public class PromedioPositivos {
    public static void main(String[] args) {

        ArrayList<Double> numeros = new ArrayList();
        
        byte eleccion = 1;
        while (eleccion == 1) {
            //pedir el numero
            Scanner sc = new Scanner(System.in);
            System.out.print("Ingrese un numero: ");
            double numero = sc.nextDouble();
            //agregar el numero a la lista
            numeros.add(numero);
            System.out.println("Desea ingresar otro numero? 1.Si 2.No");
            eleccion = sc.nextByte();

        }

        int promedio = 0;
        double suma;
        int positivos = 0;

        if(eleccion == 2){
            
            suma = 0;
            for (double num : numeros) {
                if (num > 0) {
                    suma += num;
                    positivos++;
                    promedio = (int) suma / numeros.size();
                }
            }

            
        }

        System.out.println("El promedio de los numeros es: " + promedio);
        System.out.println("La cantidad de numero positivos es: " + positivos);

        
    }
}
