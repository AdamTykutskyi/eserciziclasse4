//Un cliente fa la spesa al supermercato.
//  Il programma deve registrare N prodotti acquistati, inserendo in dei vettori paralleli il nome del prodotto, il prezzo, la quantità. 
// Il programma deve poi calcolare il totale della spesa e alla fine deve chiedere se il cliente possiede la carta fedeltà (true o false).
//  Se possiede la carta, viene applicato uno sconto del 10% sul totale.
import java.io.*;
public class es9{
    public static void main (String args )throws Exception{
        BufferedReader input=new BufferedReader (new InputStreamReader(System.in));
        int i=0;
        int n;
        double totale=0;
        System.out.println("Dammi il numero dei prodotti acquistati");
        n=Integer.parseInt(input.readLine());
        String nome[]=new String [n];
        double prezzoProd[]=new double [n];
        int quantProd[]=new int [n];
        for(i=0;i<n;i++){
            System.out.println("dammi il nome del prodotto in posizione: "+i);
            nome[i]=input.readLine();
            System.out.println("Dammi il prezzo del prodotto in posizione: " +i);   
            prezzoProd[i]=Double.parseDouble(input.readLine());
            System.out.println("Dammi la quantità del prodotto in posizione: " +i);
            quantProd[i]=Integer.parseInt(input.readLine());
            totale=totale+(prezzoProd[i]*quantProd[i]);
    }
}
}
