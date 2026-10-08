//  Costruisci un vettore di N elementi, crea un nuovo vettore eliminando tutti i numeri negativi e mantenendo quelli positivi
import java.io.*;
public class es15 {
    public static void main(String[] args) throws Exception{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int n,cont=0,i=0;
        System.out.println("Quanto grande il vettore");
        n=Integer.parseInt(input.readLine());
        Double vet[]=new Double[n];
        for(i=0;i<n;i++){
            System.out.println("Dammi i numeri nel vettore 1");
            vet[i]=Double.parseDouble(input.readLine());
            if(vet[i]<0){
                cont++;
            }
        }
        int n2=n-cont,j=0;
            Double vet2[]=new Double[n2];
            for(i=0;i<n2;i++){
                if (vet[i]<0) {
                    
                }
                else{
                    vet2[j]=vet[i];
                    j++;
                }
            }
            System.out.println("Il vecchio vettore è: ");
            for(i=0;i<n;i++){
                System.out.println(vet[i]);
            }
            System.out.println("Il nuovo vettore è: ");
            for(j=0;j<n2;j++){
                System.out.println(vet2[j]);
            }
    }
}
