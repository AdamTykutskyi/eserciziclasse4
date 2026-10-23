//Crea un vettore di N numeri interi. Crea un nuovo vettore contenente solamente i numeri dispari e calcolare
//  dal nuovo vettore la loro somma dei numeri nelle posizioni pari 
import java.io.*;
public class es17{
    public static void main(String[] args)throws Exception {
        BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
        int N;
        System.out.println("quanto grande il vettore?");
        N=Integer.parseInt(input.readLine());
        int[] v=new int[N];
        int x=0;
        int n2=0;
        int i=0;
        for(i=0;i<N;i++){
            System.out.println("inserisci il numero in posizione "+i);
            v[i]=Integer.parseInt(input.readLine());
            if(v[i]%2==0){
                x++;
            }        

    }
    n2=N-x;
    int v2[]=new int[n2];
    int j=0;
    for(i=0;i<N;i++){
        if(v[i]%2!=0){
            v2[j]=v[i];
            j++;    
}
}
int tot=0;
for(j=0;j<n2;j++){
    if(j%2==0){
        tot=tot+v2[j];
    }
}
System.out.println("la somma dei numeri nelle posizioni pari del nuovo vettore è: "+tot);
}
}
