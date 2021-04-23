import java.util.Scanner;

public class Practica01 {
    public static void main(String args[]){

        Scanner in = new Scanner(System.in);
        String palabra = "";
        int longitud,j;

        System.out.print("Input: ");
        palabra = in.nextLine();

        //Obtenemos la longitud del arreglo
        longitud = palabra.length();
        //System.out.println("La longitud de la palabra " + palabra + " es: " + longitud);

        //Creamos un arreglo de caracteres
        char[] palabra_invertida = new char[longitud];
        j = longitud-1;

        for (int i = 0; i < longitud; i++){
            //System.out.println("El caracter " + i + " es: " + palabra.charAt(i) + " El valor de j es: " + j);
            palabra_invertida[j] = palabra.charAt(i);
            j--;
        }

        //para convertir nuestro arreglo a un objeto de tipo cadena
        //creamos el objeto string a partir del arreglo
        String cadena = new String(palabra_invertida);
        //se imprime la cadena
        System.out.println("Output: " + cadena);

    }
}
