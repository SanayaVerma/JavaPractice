//WAP to find the maximum and minimum values from the elements of an array.
package arrays;
import java.io.*;
import java.util.Scanner;
public class maxMin
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Input the size of the array");
        System.out.print("size = ");
        int size = sc.nextInt();
        
        int[] numbers = new int[size];
        
        System.out.println("Input the elements of array numbers");
        for(int i=0; i<numbers.length; i++)
        {
            numbers[i] = sc.nextInt();
        }
        
        int max=numbers[0];
        int min=numbers[0];
        for(int i=1; i<numbers.length; i++)
        {
            if(numbers[i]>max)
            {
                max=numbers[i];
            }
            else if(numbers[i]<min)
            {
                min=numbers[i];
            }
        }
        
        System.out.println("Elements in the array are");
        for(int i=0; i<numbers.length; i++)
        {
            System.out.print(numbers[i] + "\t");
        }
        
        System.out.println("\nThe maximum value in array numbers is " + max + " and the minimum value is " + min);
    }
}
/*Input the size of the array
size = 10
Input the elements of array numbers
1
5
3
7
6
4
5
2
0
9
Elements in the array are
1	5	3	7	6	4	5	2	0	9	
The maximum value in array numbers is 9 and the minimum value is 0*/