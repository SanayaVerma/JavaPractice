//WAP to print even numbers and odd numbers from an array of n integers
package arrays;
import java.io.*;
import java.util.Scanner;
public class evenOddArray
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Input the size of the array");
        System.out.print("n = ");
        int n = sc.nextInt();
        
        //Declaring evenOdd array
        int[] evenOdd = new int[n];
        
        //Initializing values in evenOdd array
        System.out.println("Input " + n + " integers values in array evenOdd");
        for(int i=0; i<evenOdd.length; i++)
        {
            System.out.print("evenOdd[" + i + "] = ");
            evenOdd[i] = sc.nextInt();
        }
        
        //Finding and printing even/odd numbers in an array
        System.out.println("Value\teven/odd");
        for(int i=0; i<evenOdd.length; i++)
        {
            if(evenOdd[i]%2==0)
            {
                System.out.println(evenOdd[i] + "\teven");
            }
            else
            {
                System.out.println(evenOdd[i] + "\todd");
            }
        }
    }
}
/*Input the size of the array
n = 10
Input 10 integers values in array evenOdd
evenOdd[0] = 2
evenOdd[1] = 4
evenOdd[2] = 6
evenOdd[3] = 5
evenOdd[4] = 4
evenOdd[5] = 21
evenOdd[6] = 35
evenOdd[7] = 78
evenOdd[8] = 96
evenOdd[9] = 100
Value	even/odd
2	even
4	even
6	even
5	odd
4	even
21	odd
35	odd
78	even
96	even
100	even*/