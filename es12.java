//2. Chiedi un valore X e crea un nuovo vettore eliminando ogni volta che X compare. Esempio: V = [4, 7, 2, 7, 9, 7]
//X = 7
//Nuovo = [4, 2, 9]
import java.io.*;

public class es12 {
    public static void main(String args[]) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        int n;
        System.out.println("Dammi quanto grande è il vettore");
        n = Integer.parseInt(input.readLine());
        int x[] = new int[n];
        int y[] = new int[n];
        int num, l;
        int i, c = 0;
        System.out.println("Quale numero vuoi escludere?");
        l = Integer.parseInt(input.readLine());
        for (i = 0; i < n; i++) {
            System.out.println("Dammi i numeri nel primo vettore");
            num = Integer.parseInt(input.readLine());
            x[i] = num;
            if (num != l) {
                y[c] = num;
                c++;
            }
        }

        System.out.println("i numeri originali sono:");
        for (i = 0; i < n; i++) {
            System.out.println(x[i]);
        }

        System.out.println("i numeri senza " + l + " sono: ");
        for (i = 0; i < c; i++) {
            System.out.println(y[i]);
        }
    }
}
