public class ContadorVocales {

    public static int vowelCounter(String palabra) {
        int contador = 0;
        palabra = palabra.toLowerCase(); // Para hacer la comparación sin distinguir mayúsculas/minúsculas

        for (int i = 0; i < palabra.length(); i++) {
            char c = palabra.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contador++;
            }
        }

        return contador;
    }

    public static void main(String[] args) {
        String palabra = "Programación";
        int cantidadVocales = vowelCounter(palabra);
        System.out.println("La palabra \"" + palabra + "\" tiene " + cantidadVocales + " vocales.");
    }
}