public class ContarPalabra {
    public static void main(String[] args) throws Exception {
        
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
