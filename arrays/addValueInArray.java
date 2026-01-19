//WAP to insert a given element at a given position in an array.
package arrays;
import java.io.*;
import java.util.Scanner;
public class addValueInArray
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int[] ARR = new int[7];
        
        System.out.println("Input 6 values in an array");
        for(int i=0; i<ARR.length-1; i++)
        {
            ARR[i] = sc.nextInt(); 
        }
        
        System.out.println("Input an element and its position (0-6) in an array");
        System.out.print("element = ");
        int element = sc.nextInt();
        System.out.print("position = ");
        int position = sc.nextInt();
        for(int i=6; i>position; i--)
        {
            ARR[i]=ARR[i-1];
        }
        ARR[position]=element;
        
        System.out.println("The array values after inserting the new value are");
        for(int i=0; i<ARR.length; i++)
        {
            System.out.print(ARR[i] + "\t");
        }
    }
}
/*Input 6 values in an array
11
3
25
14
72
45
Input an element and its position (0-6) in an array
element = 2
position = 3
The array values after inserting the new value are
11	3	25	2	14	72	45*/
