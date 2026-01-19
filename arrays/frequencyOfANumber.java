package arrays;
import java.io.*;
import java.util.Scanner;
public class frequencyOfANumber
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Input the size of an array");
        System.out.print("size = ");
        int size = sc.nextInt();
        
        int[] numbers = new int[size];
        
        System.out.println("Input the elements of the array");
        for(int i=0; i<numbers.length; i++)
        {
            numbers[i]=sc.nextInt();
        }
        
        System.out.println("Input an element to find its frequency in an array");
        System.out.print("element = ");
        int element = sc.nextInt();
        int count=0;
        for(int i=0; i<numbers.length; i++)
        {
            if(element==numbers[i])
            {
                count++;
            }
        }
        
        System.out.println("The frequency of " + element + " in array numbers is " + count);
    }
}
/*Input the size of an array
size = 6
Input the elements of the array
1
2
3
2
5
2
Input an element to find its frequency in an array
element = 2
The frequency of 2 in array numbers is 3*/