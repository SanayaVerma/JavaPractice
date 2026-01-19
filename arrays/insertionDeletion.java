//WAP to delete a value in a given array and insert values from an array.
package arrays;
import java.io.*;
import java.util.Scanner;
public class insertionDeletion
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Input the size of the array");
        System.out.print("size = ");
        int size = sc.nextInt();        
        
        int[] numbers = new int[size];
        
        System.out.println("Input the elements of the array");
        for(int i=0; i<numbers.length; i++)
        {
            numbers[i]=sc.nextInt();
        }
        
        //Deleting value from the array.
        System.out.println("Input the position of the element to be deleted");
        System.out.print("position = ");
        int position = sc.nextInt();
        for(int i=position; i<=numbers.length-2; i++)
        {
            numbers[i]=numbers[i+1];
        }   
        
        System.out.println("Modified elements of array numbers after deleting a value are");
        for(int i=0; i<numbers.length-1; i++)
        {
            System.out.print(numbers[i] + "\t");
        }
        
        //Inserting value at a given position in the array.
        System.out.println("\nInput the element and its position to be inserted");
        System.out.print("element = ");
        int element = sc.nextInt();
        System.out.print("position = ");
        position = sc.nextInt();
        for(int i=numbers.length-1; i>position; i--)
        {
            numbers[i]=numbers[i-1];
        }
        numbers[position]=element;
        
        System.out.println("Modified elements of array numbers after inserting a value are");
        for(int i=0; i<numbers.length; i++)
        {
            System.out.print(numbers[i] + "\t");
        }
    }
}
/*Input the size of the array
size = 6
Input the elements of the array
11
2
25
14
72
45
Input the position of the element to be deleted
position = 2
Modified elements of array numbers after deleting a value are
11	2	14	72	45	
Input the element and its position to be inserted
element = 25
position = 3
Modified elements of array numbers after inserting a value are
11	2	14	25	72	45h*/