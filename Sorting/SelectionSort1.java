
// Java program to sort an integer array using Selection Sort
class SelectionSort1  
{

   public static void main(String [] args)

     {
 
        int [] a={38,52,9,18,6,62,13};
        int min, temp=0;
        for (int i=0;i<a.length;i++)
            {
                min=i;
               for(int j=i+1;j<a.length;j++)
                  {
                     if(a[j]<a[min])
                     {
                        min=j;
                     }
                  }
               temp=a[i];
               a[i]=a[min];
               a[min]=temp;
            }
            System.out.print("Sorted array: ");
            for (int value : a) 
            {
               System.out.print(value + " ");
            }
     }
}