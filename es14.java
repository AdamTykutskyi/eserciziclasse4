//Crea un vettore di N elementi, crea un nuovo vettore contenente solo i numeri positivi e pari.
import java.io.*;
public class es14 {
    public static void main(String[] args) throws Exception{
        BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
        int n;
        System.out.println("quanto grande il vettore 1?");
        n=Integer.parseInt(input.readLine());

        int[] vettore = new int[n];
        int quanti = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Inserisci l'elemento " + (i + 1) + ":");
            vettore[i] = Integer.parseInt(input.readLine());
            if (vettore[i] > 0 && vettore[i] % 2 == 0) {
                quanti++;
            }
        }

        int[] positiviPari = new int[quanti];
        int iPosPari = 0;
        for (int i = 0; i < n; i++) {
            if (vettore[i] > 0 && vettore[i] % 2 == 0) {
                positiviPari[iPosPari] = vettore[i];
                iPosPari++;
            }
        }

        System.out.println("Numeri positivi e pari:");
        for (int i = 0; i < quanti; i++) {
            System.out.println(positiviPari[i]);
        }
    }
}
