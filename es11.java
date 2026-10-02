//1.  Costruire un vettore di lunghezza N. Crea un nuovo vettore contenente solamente i numeri pari.
import java.io.*;
public class es11{
    public static void main (String[] args) throws Exception{
        BufferedReader tastiera = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Inserisci la lunghezza del vettore: ");
        int N = Integer.parseInt(tastiera.readLine());
        int[] vettore = new int[N];
        for(int i=0; i<N; i++){
            System.out.print("Inserisci il numero " + (i+1) + ": ");
            vettore[i] = Integer.parseInt(tastiera.readLine());
        }
        int count = 0;
        for(int i=0; i<N; i++){
            if(vettore[i] % 2 == 0){
                count++;
            }
        }
        int[] pari = new int[count];
        int j = 0;
        for(int i=0; i<N; i++){
            if(vettore[i] % 2 == 0){
                pari[j] = vettore[i];
                j++;
            }
        }
        System.out.print("I numeri pari sono: ");
        for(int i=0; i<pari.length; i++){
            System.out.print(pari[i] + " ");
        }
    }
}