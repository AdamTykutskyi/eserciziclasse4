//Costruisci un array di N elementi e calcola 
// la somma degli elementi che si trovano agli indici pari.
import java.io.*;
public class es5 {
    public static void main (String[] args)throws Exception{
        BufferedReader input =new BufferedReader( new InputStreamReader(System.in)); 
        int i=0;
        int n;
        System.out.println("Dammi n");
        n = Integer.parseInt(input.readLine()); 
        int x[] = new int[n];
        for (i=0; i<n; i++){
            System.out.println("Dammi il valore in posizione " + i);
            x[i] = Integer.parseInt(input.readLine());
        }
        int somma = 0;
        for(i=0; i<n; i+=2){
            somma += x[i];
        }
        System.out.println("La somma degli elementi che si trovano agli indici pari e': " + somma);
        
    }
    
}
