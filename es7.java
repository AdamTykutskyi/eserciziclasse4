//Un'azienda possiede due array paralleli contenenti rispettivamente il nome e il cognome dei propri dipendenti.
//  Chiedi all'utente di inserire un nome e verifica se è presente nell'archivio. 
// Se il nome è presente, visualizza nome e cognome di tutti i dipendenti che hanno quel nome.
//  Se invece non è presente, visualizza un messaggio che lo comunichi.  
import java.io.*;
public class es7 {
    public static void main (String[] args) throws Exception {
        BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
        int i=0;
        int n;
        String dip;
        int b=0;
        System.out.println("Dammi il numero dei dipendenti");
        n=Integer.parseInt(input.readLine());
        String nome[]=new String [n];
        String cogn[]=new String [n];
        for(i=0;i<n;i++){
            System.out.println("dammi il nome del dipendente in posizione: "+i);
            nome[i]=input.readLine();
            System.out.println("Dammi il cognome del dipendente in posizione: " +i);
            cogn[i]=input.readLine();
        }
        System.out.println("quale dipendente vuoi controllare?");
        dip=input.readLine();
        for(i=0;i<n;i++){
            if (dip.equals(nome[i])) {
                b++;
                
            }

        }
        if(b>0){
            System.out.println("Il dipendente di nome " + dip + " è presente nell'archivio.");
            for(i=0;i<n;i++){
            if (dip.equals(nome[i])) {
                System.out.println("Il dipendente in posizione " + i + " è: " + nome[i] + " " + cogn[i]);

                
            }
        }

        }
        else{
            System.out.println("Il dipendente di nome " + dip + " non è presente nell'archivio.");
    }
}
}