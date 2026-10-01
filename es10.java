//devo costrire un vx con n numeri
//devo visualizzare in un altro vettore solo i valori negativi
import java.io.*;
public class es10{
    public static void main (String args [])throws Exception{
        BufferedReader input=new BufferedReader (new InputStreamReader(System.in));
        int i=0;
        int n;
        int b=0;
        System.out.println("Dammi il numero dei valori da inserire");
        n=Integer.parseInt(input.readLine());
        int valori[]=new int [n];
        for(i=0;i<n;i++){
            System.out.println("dammi il valore in posizione: "+i);
                        valori[i]=Integer.parseInt(input.readLine());
            if(valori[i]<0){
                b++;
            }
        }
        int negativi[]=new int [b];
        int j=0;
        for(i=0;i<n;i++){
            if(valori[i]<0){
                negativi[j]=valori[i];
                j++;
            }
        }
        System.out.println("I valori negativi sono: ");
        for(i=0;i<b;i++){
            System.out.println(negativi[i]);
        }

    }
}