

class LinearSearchInteger
{
   public static void main(String [] args)
   {
      int arr[]={5,9,2,8,1,4};
	  int item=6;
	  int temp=0;
	  for(int i=0;i<arr.length;i++)
	  {
		  if(arr[i]==item)
		  {
			  System.out.println("item is Present at "+i+" index position");
			  temp=temp+1;
		  }
	  }
	  if(temp==0)
	  {
		  System.out.println("item is not found in list");
	  }
   }
}