

class BinarySearch
{
	public static void main(String [] args)
	{
		int[] arr={2,5,7,8,10,13,16,18,20,23,25};
		int search=16;
		int li=0;            // li=least index
		int hi=arr.length-1;   // hi=highest index
		int mi=(li+hi)/2;    // mi=middle index
		 
		 while(li<=hi)
		 {
			 if(arr[mi]==search)
	 	    {
		       System.out.println("element is at "+mi+" index position.");
			   break;
		    }
		     else if (arr[mi]<search)
		    {
		       li=mi+1;
		    }
		     else
		    {
			   hi=mi-1;
		    }
		 
		       mi=(li+hi)/2;
		 }
		 if(li>hi)
		 { 
	        System.out.println("element is not found.");
		 }
		 
	}
}
