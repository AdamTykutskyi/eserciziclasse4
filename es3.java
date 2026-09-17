//Costruisci un array di dimensione N e 
// controllo se e' presente il valore 10 e in che 
// posizione si trova
import java .io.*;
public class es3{
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
        boolean trovato = false;
        for(i=0; i<n; i++){
            if (x[i] == 10){


                System.out.println("Il valore 10 e' presente in posizione " + i);
                trovato = true;
            }
        }
        if (trovato == false){
            System.out.println("Il valore 10 non e' presente");  
        }
    }
}

