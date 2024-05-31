import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class EliminarPalabra 
{

    public static void main(String[] args) throws Exception 
    {
         Scanner scanner = new Scanner(System.in);

        ArrayList<String> APalabras = new ArrayList<>();

        System.out.print("Ingresa un texto con muchas palabras:");
        String texto = scanner.nextLine();

        // Dividir el texto en palabras
        String[] palabras = texto.split(" ");

        // Agregar las frases al stack
        for (String palabra : palabras) {
            APalabras.add(palabra);
        }

            // Eliminar la última palabra ingresada
            APalabras.remove(APalabras.size() - 1);
            System.out.println("Frase resultante: " + String.join(" ", APalabras));
        

        scanner.close();
        
    }
}
