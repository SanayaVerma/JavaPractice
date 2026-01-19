//WAP to find the factorial of the index and store it as the value at that index.
package arrays;
import java.io.*;
import java.util.Scanner;
public class factorialIndex
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int factorial=1;
        
        System.out.println("Input the size of an array");
        System.out.print("size = ");
        int size = sc.nextInt();
        
        int[] numbers = new int[size];
        
        System.out.println("Elements in array numbers are");
        System.out.println("0");
        for(int i=1; i<numbers.length; i++)
        {
            factorial=1;
            for(int j=i; j>0; j--)
            {
                factorial*=j;
            }
            numbers[i] = factorial;
            System.out.println(numbers[i]);
        }
    }
}
/*Input the size of an array
size = 6
Elements in array numbers are
0
1
2
6
24
120*/