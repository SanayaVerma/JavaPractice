package arrays;
import java.io.*;
import java.util.Scanner;
public class prime10ValuesArray
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
        
        System.out.println("\nPrime numbers in array are");
        boolean flag=false;
        for(int i=0; i<numbers.length; i++)
        {
            flag=false;
            
            for(int j=2; j<=numbers[i]/2; j++)
            {
                if(numbers[i]%j==0)
                {
                    flag=true;
                    break;
                }
            }
            
            if(flag==false)
            {
                    System.out.print(numbers[i] + "\t");
            }
        }
    }
}
/*Input 10 elements in the array
1
2
3
4
5
6
7
8
9
19
Elements in array are
1	2	3	4	5	6	7	8	9	19	
Prime numbers in array are
1	2	3	5	7	19	*/