package arrays;
import java.io.*;
import java.util.Scanner;
public class inputValues
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        //Declaring an integer array of 8 elements
        int[] numbers = new int[8];
        
        //Initializing an array of 8 elements
        System.out.println("Input 8 integers in array numbers");
        
        //Array index runs from 0 to n-1
        for(int i=0; i<numbers.length; i++)
        {
            System.out.print("numbers[" + i + "] = ");
            numbers[i] = sc.nextInt();
            System.out.println();
        }
        
        //Displaying values in an array
        System.out.println("Elements in array are");
        
        for(int i=0; i<numbers.length; i++)
        {
            //System.out.println("numbers[ " + i + "] = " + numbers[i]);
            System.out.println(numbers[i]);
        }
    }
}
/*Input 8 integers in array numbers
numbers[0] = 2

numbers[1] = 3

numbers[2] = 4

numbers[3] = 5

numbers[4] = 6

numbers[5] = 7

numbers[6] = 8

numbers[7] = 9

Elements in array are
2
3
4
5
6
7
8
9
*/