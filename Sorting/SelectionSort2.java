

// Java program to sort a String array using Selection Sort
class SelectionSort2  
{

   public static void main(String [] args)

   {
 
      String [] a={ "Jamali", "Baloch", "Khan", "Mir" };
      int min;
      String temp=" ";

      for (int i=0;i<a.length;i++)
      {
         min=i;
         for(int j=i+1;j<a.length;j++)
         {
            if(a[j].compareTo(a[min])<0)
            {
               min=j;
            }
         }
         temp=a[i];
         a[i]=a[min];
         a[min]=temp;
      }

      System.out.print("Sorted array: ");
      for (String s : a) 
      {
         System.out.print(s + " ");
      }   
      
   }
}