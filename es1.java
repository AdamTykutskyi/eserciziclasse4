// costruire un vettore di dimensione N e riempirlo di valori interi.
import java.io.*;
public class es1{
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

    }
}

