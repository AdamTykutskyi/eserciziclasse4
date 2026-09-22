//Un archivio contiene i titoli dei film, il genere di ciascun film e la quantità di copie disponibili. 
// Chiedi all’utente il titolo di un film e verifica se è presente nell’archivio.
//  Se il film è presente, visualizza il suo genere e la quantità di copie disponibili; altrimenti comunica che il film non è presente
import java.io.*;
public class es6{
    public static void main (String[] args) throws Exception{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("quanti film?");
        int n = Integer.parseInt(input.readLine());
        String titoli[]= new String [n];
        String[] generi = new String[n];
        int[] copieDisponibili = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Inserisci il titolo del film " + (i + 1) + ": ");
            titoli[i] = input.readLine();
            System.out.print("Inserisci il genere del film " + (i + 1) + ": ");
            generi[i] = input.readLine();
            System.out.print("Inserisci la quantità di copie disponibili per il film " + (i + 1) + ": ");
            copieDisponibili[i] = Integer.parseInt(input.readLine());
        }

        System.out.print("Inserisci il titolo del film: ");
        String titoloInserito = input.readLine();

        boolean trovato = false;
        for (int i = 0; i < titoli.length; i++) {
            if (titoli[i].equalsIgnoreCase(titoloInserito)) {
                System.out.println("Genere: " + generi[i]);
                System.out.println("Copie disponibili: " + copieDisponibili[i]);
                trovato = true;
                break;
            }
        }

        if (!trovato) {
            System.out.println("Il film non è presente nell'archivio.");
        }
    }
}