//Costruisci un vettore di dimensione N e calcola e
//  stampa  il prodotto di tutti gli elementi dell'array.
import java.io.*;
public class es4 {
    public static void main (String[] args) throws Exception{
        BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
        int i=0;
        int n;
        System.out.println("Dammi n");
        n = Integer.parseInt(input.readLine());
        int x[] = new int[n];
        for (i=0; i<n; i++){
            System.out.println("Dammi il valore in posizione " + i);
            x[i] = Integer.parseInt(input.readLine());
        }
        System.out.println("i numeri sono:");
        for(i=0; i<n; i++){
            System.out.println(x[i]);
        }
        int prodotto = 1;
        for(i=0; i<n; i++){
            prodotto *= x[i];
        }
        System.out.println("Il prodotto di tutti gli elementi e': " + prodotto);
    }
}
