import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu DNI para saber la letra: ");
        int dni = sc.nextInt();
        sc.nextLine();
        int dniLetra = calcularLetraDNI(dni);
        char letraDNI = mostrarLetraDNI(dniLetra);
        System.out.println("La letra del DNI " + dni + " es " + letraDNI);


        sc.close();
    }
    public static int calcularLetraDNI(int i){
        i = i % 23;
        return i;
    }


    public static char mostrarLetraDNI(int i){
        char[] letra = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 
        'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        
        return letra[i];
    }
}
