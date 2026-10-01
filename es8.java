//Un archivio contiene due array paralleli che memorizzano il nome di alcune città e il numero di residenti di ciascuna città.
//  Chiedi all'utente di inserire il nome di una città e verifica se è presente nell'archivio.
//  Se la città è presente, visualizza il numero di residenti e calcola la percentuale di residenti della città rispetto al totale dei residenti di tutte le città presenti nell'archivio.
//  Se la città non è presente, visualizza un messaggio che lo comunichi.
import java.io.*;
public class es8 {
    public static void main (String[] args) throws Exception {
        BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
        int i=0;
        int n;
        String citta;
        int b=0;
        System.out.println("Dammi il numero delle città");
        n=Integer.parseInt(input.readLine());
        String nome[]=new String [n];
        int residenti[]=new int [n];
        for(i=0;i<n;i++){
            System.out.println("dammi il nome della città in posizione: "+i);
            nome[i]=input.readLine();
            System.out.println("Dammi il numero di residenti della città in posizione: " +i);
            residenti[i]=Integer.parseInt(input.readLine());
        }
        System.out.println("quale città vuoi controllare?");
        citta=input.readLine();
        for(i=0;i<n;i++){
            if (citta.equals(nome[i])) {
                b++;
                
            }

        }
        if(b>0){
            System.out.println("La città di nome " + citta + " è presente nell'archivio.");
            for(i=0;i<n;i++){
            if (citta.equals(nome[i])) {
                System.out.println("La città in posizione " + i + " ha: " + residenti[i] + " residenti.");
                int totaleResidenti = 0;
                for (int j = 0; j < n; j++) {
                    totaleResidenti += residenti[j];
                }
                double percentuale = ((double) residenti[i] / totaleResidenti) * 100;
                System.out.printf("La percentuale di residenti della città rispetto al totale è: %.2f%%\n", percentuale);
                
            }
        }

        }
        else{
            System.out.println("La città di nome " + citta + " non è presente nell'archivio.");
    }
}
}
