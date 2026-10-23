//Crea un vettore di N numeri interi.
//  Calcola la media del vettore e crea un nuovo vettore contenente solamente i numeri maggiori della media
import java.io.*;
public class es18 {
    public static void main(String[] args)throws Exception{
        BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
        int N;
        double k=0;
        System.out.println("quanto grande il vettore?");
        N=Integer.parseInt(input.readLine());
        int[] v=new int[N];
        int i=0;
        int conta=0;
        Double media=0.0;
        for(i=0;i<N;i++){
            System.out.println("inserisci il numero in posizione "+i);
            v[i]=Integer.parseInt(input.readLine());
            conta=conta+v[i];
        }
        k=N;
        media=conta/k;
        System.out.println("la media del vettore è: "+media);
        int x=0;
        for(i=0;i<N;i++){
            if(v[i]>media){
                x++;
            }
        }   
        int v2[]=new int[x];
        int j=0;
        for(i=0;i<N;i++){
            if(v[i]>media){
                v2[j]=v[i];
                j++;


    }

}
System.out.print("il nuovo vettore con i numeri più grandi della media è: ");
for(j=0;j<x;j++){
    System.out.print(v2[j]);
}
}   
}
