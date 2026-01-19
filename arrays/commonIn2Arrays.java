package arrays;
import java.io.*;
public class commonIn2Arrays
{
    public static void main(String args[])
    {
        int[] A = {2, 3, 4, 7, 8, 9};
        int[] B = {2, 3, 5, 6, 7, 10};
        
        System.out.println("Elements in Array A are");
        for(int i=0; i<A.length; i++)
        {
            System.out.print(A[i] + "\t");
        }
        
        System.out.println("\nElements in Array B are");
        for(int i=0; i<B.length; i++)
        {
            System.out.print(B[i] + "\t");
        }
               
        System.out.println("\nElements common in Array A and B are");
        for(int i=0; i<A.length; i++)
        {
            for(int j=0; j<B.length; j++)
            {
                if(A[i]==B[j])
                {
                    System.out.print(B[j] + "\t");
                }
            }
        }
    }
}
/*Elements in Array A are
2	3	4	7	8	9	
Elements in Array B are
2	3	5	6	7	10	
Elements common in Array A and B are
2	3	7*/