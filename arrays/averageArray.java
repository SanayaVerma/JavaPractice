package arrays;
import java.io.*;
import java.util.Scanner;
public class averageArray
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        double sum=0.0;
        double[] average = new double[10];
        
        System.out.println("Input 10 double values in an array");
        for(int i=0; i<average.length; i++)
        {
            average[i]=sc.nextDouble();
            sum+=average[i];
        }
        
        System.out.println("Values in the given array are");
        for(int i=0; i<average.length; i++)
        {
            System.out.print(average[i] + "\t");
        }
        
        double avg=sum/10;
        
        System.out.println("\nSum of the above elements = " + sum + "\nAverage of the above elements = " + avg);
    }
}
/*Input 10 double values in an array
1.1
2.2
3.3
4.4
5.5
6.6
7.7
8.8
9.9
10.10
Values in the given array are
1.1	2.2	3.3	4.4	5.5	6.6	7.7	8.8	9.9	10.1	
Sum of the above elements = 59.6
Average of the above elements = 5.96*/