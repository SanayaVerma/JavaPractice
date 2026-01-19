package arrays;
import java.io.*;
import java.util.Scanner;
public class printPalindromeArray
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int[] numbers = new int[10];
        
        System.out.println("Input 10 elements in the array");
        for(int i=0; i<numbers.length; i++)
        {
            numbers[i] = sc.nextInt();
        }
        
        System.out.println("Elements in array are");
        for(int i=0; i<numbers.length; i++)
        {
            System.out.print(numbers[i] + "\t");
        }
        
        System.out.println("\nPalindrome numbers in array are");
        int digit;
        int number=0;
        for(int i=0; i<numbers.length; i++)
        {
            int j=numbers[i];
            number=0;
            
            while(j!=0)
            {
                digit=j%10;
                
                number=(number*10)+digit;
                
                j/=10;
            }
            
            if(numbers[i]==number)
            {
                System.out.print(numbers[i] + "\t");
            }
        }
    }
}
/*Input 10 elements in the array
5
43
121
56
61
22
34
17
232
545
Elements in array are
5	43	121	56	61	22	34	17	232	545	
Palindrome numbers in array are
5	121	22	232	545	*/