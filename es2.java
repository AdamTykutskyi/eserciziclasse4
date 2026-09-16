//costruire un vettore dove nelle dimensione pari mettere 6 e nelle dimensioni dispari 0
import java.io.*;
public class es2 {
    public static void main (String[] args) throws Exception{
        BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
        int i=0;
        int n;
        System.out.println("Dammi n");
        n = Integer.parseInt(input.readLine());
        int x[]= new int[n];
        for (i=0; i<n; i++){
            if (i%2==0){
                x[i]=6;
            }else{
                x[i]=0;
            }
        }
    }
    
}
