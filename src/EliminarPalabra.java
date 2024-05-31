import java.util.Scanner;
import java.util.Stack;

public class EliminarPalabra 
{

    public static void main(String[] args) throws Exception 
    {
         Scanner scanner = new Scanner(System.in);

        Stack<String> Stack_Palabras = new Stack<>();

        System.out.print("Ingresa un texto con muchas palabras:");
        String texto = scanner.nextLine();

        // Dividir el texto en palabras
        String[] palabras = texto.split(" ");

        // Agregar las frases al stack
        for (String palabra : palabras) {
            Stack_Palabras.push(palabra);
        }
        
    }
}
