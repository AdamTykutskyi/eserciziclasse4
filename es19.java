//Crea un vettore di N numeri interi. Crea un nuovo vettore senza gli zeri 
// se sono presenti altrimenti il nuovo vettore è uguale al primo e trova il minimo tra gli elementi rimasti.
import java.io.*;
public class es19 {
    public static void main(String[] args)throws Exception{
        BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
        int N;
        System.out.println("quanto grande il vettore?");
        N=Integer.parseInt(input.readLine());
        int[] v=new int[N];
        int i=0;
        for(i=0;i<N;i++){
            System.out.println("inserisci il numero in posizione "+i);
            v[i]=Integer.parseInt(input.readLine());


        }
        for(i=0;i<N;i++){
            if(v[i]==0){
                int x=0;
                for(i=0;i<N;i++){
                    if(v[i]!=0){
                        x++;
                    }
                }   
                int v2[]=new int[x];
                int j=0;
                for(i=0;i<N;i++){
                    if(v[i]!=0){
                        v2[j]=v[i];
                        j++;
                    }
                }
                int min=v2[0];
                for(j=1;j<x;j++){
                    if(v2[j]<min){
                        min=v2[j];
                    }
                }
                System.out.println("il nuovo vettore senza zeri è: ");
                for(j=0;j<x;j++){
                    System.out.print(v2[j]+" ");
                }
                System.out.println("\nil minimo tra gli elementi rimasti è: "+min);
                break;
            }
        }
    }

}
