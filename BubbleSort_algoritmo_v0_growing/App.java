package BubbleSort_algoritmo_v0_growing;
import java.util.*;

public class App {
    public static void main(String args[])
    {
        int x[] = new int[5];
        int n, i, aux;
        Scanner inputUser = new Scanner(System.in);

        //Input numbers in vector
        for(i=0; i<=4; i++)
        {
            System.out.println("Write the "+(i+1)+"º number: ");
            x[i] = inputUser.nextInt();
        }

        //Sorted in growing order
        for(n=1; n<=5; n++)
        {
            for(i=0; i<=3; i++)
            {
                if(x[i] > x[i+1])
                {
                    aux = x[i];
                    x[i] = x[i+1];
                    x[i+1] = aux;
                }
            }
        }
        // Show the sorted vector
        for(i=0; i<=4; i++)
        {
            System.out.println((i+1)+"º number: "+ x[i]);
        }

        inputUser.close();
    }
    
}
