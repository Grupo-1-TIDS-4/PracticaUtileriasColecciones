import java.util.Scanner;

public class ContarPalabra {
    public static void main(String[] args) throws Exception {
        
         
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una frase: ");
        String frase = scanner.nextLine(); 

        int cantidadPalabras = contarPalabras(frase); 

      
        System.out.println("La frase contiene " + cantidadPalabras + " palabra(s).");

        scanner.close(); 

        
    }

    public static int contarPalabras(String frase) {
        String fraseModificada = frase.trim();

        if (fraseModificada.isEmpty()) {
            return 0;
        }

        String[] palabras = fraseModificada.split(" ");

        return palabras.length;
    }
}
