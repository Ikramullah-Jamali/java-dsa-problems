
// Bubble Sort program for sorting String arrays alphabetically

class BubbleSort2   /*  String type Array   */
{

   public static void main(String [] args)

       {
 
           String[] a={"ikram","rehan","umair","shoaib"};
            String temp;
            for(int i=0;i<a.length;i++)
             {
                int flag=0;
                for(int j=0;j<a.length-1-i;j++) // Inner loop to compare adjacent elements
                  {
                      if(a[j].compareTo(a[j+1])>0)
                         {  
                             // Swap if current string is lexicographically greater
                             temp=a[j];
                             a[j]=a[j+1]; 
                             a[j+1]=temp;
                             flag=1;
                          }
                  } 
                 // If no swaps happened, the array is sorted
                 if (flag==0)
                        {break;}
             } 
             // Print sorted array
             for(int i=0;i<a.length;i++) 
             {
                 System.out.print(a[i]+" ");
             }
             
     }
}
             