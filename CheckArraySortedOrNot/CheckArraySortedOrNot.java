
import java.util.Scanner;

class CheckArraySortedOrNot
{
    public static void main(String [] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter size of Array:");
        int size=s.nextInt();
        int temp=0;
        int arr[]=new int[size];
        System.out.println("Enter "+size+" elements for Array:");
        for(int i=0;i<size;i++)
        {
            arr[i]=s.nextInt();
        }
        for(int i=0;i<size;i++)
        {
            System.out.println(arr[i]);
        }
        for(int i=0;i<size-1;i++)
        {
            if(arr[i]>arr[i+1])
            {
                temp++;
            }
        }
        if(temp>0)
        {
            System.out.println("Array is not sorted.");
        }
        else 
        {
            System.out.println("Array is sorted.");
        }
        s.close();
    }
} 
