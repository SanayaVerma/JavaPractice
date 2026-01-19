//WAP to input n float values in an array and find their sum
package arrays;
import java.io.*;
import java.util.Scanner;
public class sumOfFloats
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Input the size of an array");
        System.out.print("n = ");
        int n = sc.nextInt();
        
        //Declaring a float array of size n
        float[] sumFloats = new float[n];
        
        //Inputting n values in sumFloats
        System.out.println("Input " + n + " float values in array sumFloats");
        for(int i=0; i<sumFloats.length; i++)
        {
            System.out.print("sumFloats[" + i + "] = ");
            sumFloats[i] = sc.nextFloat();
        }
        
        //Displaying values in sumFloats along with sum of all elements
        System.out.println("Elements in sumFloats are");
        float sum=0;
        for(int i=0; i<sumFloats.length; i++)
        {
            System.out.print(sumFloats[i] + ", ");
            sum+=sumFloats[i];
        }
        System.out.println("\nSum of all the above elements is " + sum);
    }
}
/*Input the size of an array
n = 5
Input 5 float values in array sumFloats
sumFloats[0] = 1.1
sumFloats[1] = 1.2
sumFloats[2] = 1.3
sumFloats[3] = 1.4
sumFloats[4] = 1.5
Elements in sumFloats are
1.1, 1.2, 1.3, 1.4, 1.5, 
Sum of all the above elements is 6.5
*/