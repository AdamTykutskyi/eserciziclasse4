//1. Crea un vettore di N elementi, chiedi due valori A e B.§
//  Elimina dal vettore tutti i numeri compresi tra A e B. stampa il nuovo vettore. 
// Esempio: V = [2, 5, 8, 3, 10, 6, 1] A = 3   B = 8 Nuovo = [2, 10, 1] 
import java.io.*;
public class es13{
    public static void main(String args[]) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int n,x,y,i=0,cont=0;
        System.out.println("Quanto grande vuoi fare il vettore?");
        n=Integer.parseInt(input.readLine());
        System.out.println("metti due numeri; eliminerai tutti i numeri compresi tra i due");
        x=Integer.parseInt(input.readLine());
        y=Integer.parseInt(input.readLine());
        int vet[]=new int[n];
        for(i=0;i<n;i++){
            System.out.println("Dammi il numero in pos " +i);
            vet[i]=Integer.parseInt(input.readLine());

        }
        int j=0;
        for(i=0;i<n;i++){
            if(vet[i]>x && vet[i]<y){
                cont++;
            }
        }
        int n2=n-cont;
        int vet2[]=new int[n2];
        for(i=0;i<n;i++){
            
            if(vet[i]>x && vet[i]<y){
                
        }
        else{
            vet2[j]=vet[i];
            j++;
        }
}

System.out.println("il vettore vecchio è: ");
for(i=0;i<n;i++){
    System.out.println(vet[i]);
}
System.out.println("il vettore nuovo è: ");
for(j=0;j<n2;j++){
    System.out.println(vet2[j]);
}

}}