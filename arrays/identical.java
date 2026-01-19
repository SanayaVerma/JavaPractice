/*Write a program to initialize the following integer arrays. Print a suitable message whether the two array are identical or not.
Make use of Boolean data type to decide whether the two arrays are same or not.
Ar[]={146,236,346,456} and Br={146,236,346,456}*/
package arrays;
import java.io.*;
public class identical
{
    public static void main(String args[])
    {
        //Declaring and initializing Ar array/Br array
        int[] Ar = {146, 236, 346, 456, 403};
        int[] Br = {146, 236, 148, 456};
        
        //Checking if 2 arrays are identical
        boolean flag=true;
        if(Ar.length!=Br.length)
        {
            flag=false;
        }
        else
        {
            System.out.println("Ar\tBr");
            for(int i=0; i<Ar.length; i++)
            {
                System.out.println(Ar[i] + "\t" + Br[i]);
                
                if(Ar[i]!=Br[i])
                {
                    flag=false;
                }
            }
            
            if(flag==true)
            {
                System.out.println("Given 2 arrays are identical");
            }
        }
        
        if(flag==false)
        {
            System.out.println("Given 2 arrays are not identical");
        }
    }
}
/*Ar	Br
146	146
236	236
346	346
456	456
Given 2 arrays are identical

Ar	Br
146	146
236	236
346	148
456	456
Given 2 arrays are not identical

Given 2 arrays are not identical*/