/*
 * Ingrese desde el teclado una lista de estudiantes con sus nombres
 */
package calificaciones1;

import java.util.Scanner;

/**
 *
 * @author Scrappy Doo Coco
 */
public class Calificaciones1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n; // Numero de estudiantes.
        String [] nom = new String[50]; // Nombres de los estudiantes
        float [] nota = new float[50]; // Notas finales
        n = lectura(nom, nota);
        System.out.println("Calificaciones ingresadas: ");
        escritura(n, nom, nota);
        clasifica(n, nom, nota);
        System.out.println("Calificaciones ordenadas por nombre: ");
        escritura(n, nom, nota);
    }
    
    public static int lectura(String[] nm, float [] nt) {
        int na;
        String x;
        final String Termina = "FIN";
        Scanner sc = new Scanner(System.in);
        for (na = 0; ; na ++) {
            System.out.print("Nombre(" + (na + 1) + ") (terminar lectura = " + Termina + "): ");
            x = sc.nextLine();
            if (x.equalsIgnoreCase(Termina)) break;
            nm[na] = x;
            System.out.print("Nota de " + x + " = " );
            nt[na] = sc.nextFloat();
            sc.nextLine(); // Limpia el buffer de lectura
        }
        return na;
    }

    public static void escritura(int n, String[] nm, float [] nt) {
        System.out.println("NOMBRE          NOTA      OBSERVACION");
        for (int i = 0; i < n; i ++)
            System.out.println(nm[i] + "   " + nt[i] + "   " + (nt[i] < 14 ? "REPRUEBA" : "APRUEBA"));
        System.out.println();
    }

    public static void clasifica(int n, String[] nm, float [] nt) {
        int i, j;
        for (i = 0; i < n - 1; i ++)
           for (j = i + 1; j < n; j ++)
               if (nm[i].compareToIgnoreCase(nm[j]) > 0) {
                   String xnm = nm[i];
                   float xnt = nt[i];
                   nm[i] = nm[j];
                   nt[i] = nt[j];
                   nm[j] = xnm;
                   nt[j] = xnt;
               }
    }
}
