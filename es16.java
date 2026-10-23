//Creare e inizializzare un vettore di interi contenente le temperature.
//  Controllare, per ogni temperatura, quante volte compare all'interno del vettore. 
// Creare un nuovo vettore contenente solo le temperature che compaiono almeno 2 volte.
//Esempio
//V[20 22 20 25 23 22 20]
//Nel vettore iniziale:
//20 compare 3 volte;
//22 compare 2 volte;
//25 compare 1 volta;
//23 compare 1 volta.
//Quindi  VF[20 22 20 22 20]
import java.io.*;
public class es16 {
    public static void main(String[] args) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("quante temperature vuoi registrare?");
        int n=Integer.parseInt(input.readLine());;
        int v[]=new int[n];
        int quanti = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Inserisci l'elemento " + (i + 1) + ":");
            vettore[i] = Integer.parseInt(input.readLine());
            if (vettore[i] > 0 && vettore[i] % 2 == 0) {
                quanti++;
            }    }
}
