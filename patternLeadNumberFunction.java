/*Design a program to overload the function print as follows:
void print() - to print the following format
1  1  1  1
2  2  2  2
3  3  3  3
4  4  4  4
5  5  5  5

void print(int n) - To check whether the number is a lead number. A lead number is the one whose sum of even digits
are equal to sum of odd digits.
e.g. 3669
odd digits sum = 3 + 9 = 12
even digits sum = 6 + 6 = 12
3669 is a lead number.
*/
package Test;
import java.io.*;
import java.util.Scanner;
public class patternLeadNumberFunction
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Input an integer value for num");
        System.out.print("num = ");
        int num = sc.nextInt();
        print(num);
        
        
        System.out.println("\nThe desired pattern is: ");
        System.out.println();
        print();        
    }
    
    //Pattern Function
    public static void print()
    {
        for(int i=1; i<=5; i++)
        {
            for(int j=1; j<=4; j++)
            {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
    
    //Lead Number Function
    public static void print(int n)
    {
        int num=n;
        int digit;
        int evenSum=0;
        int oddSum=0;
        
        while(n!=0)
        {
            digit=n%10;
            
            if(digit%2==0)
            {
                evenSum+=digit;
            }
            else
            {
                oddSum+=digit;
            }
            
            n/=10;
        }
        
        if(evenSum==oddSum)
        {
            System.out.println(num + " is a Lead Number");
        }
        else
        {
            System.out.println(num + " is not a Lead Number");
        }
    }
}
/*Input an integer value for num
num = 3669
3669 is a Lead Number

The desired pattern is: 

1 1 1 1 
2 2 2 2 
3 3 3 3 
4 4 4 4 
5 5 5 5 

Input an integer value for num
num = 6767
6767 is not a Lead Number

The desired pattern is: 

1 1 1 1 
2 2 2 2 
3 3 3 3 
4 4 4 4 
5 5 5 5 
*/