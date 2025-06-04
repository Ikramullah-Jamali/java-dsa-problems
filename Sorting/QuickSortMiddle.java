
class QuickSortMiddle
{
	
	public static void main(String [] args)
	
	{
		
	   int[] arr={15,9,7,13,12,16,4,18,11};
	   int leng=arr.length;
	   
	   QuickSortMiddle qsm=new QuickSortMiddle();
	   qsm.quickSort(arr,0,leng-1);
	   System.out.print("Sorted array: ");
	   qsm.printArray(arr);
	}
	int partition(int[] arr, int low, int high)
	{
   		int pivot = arr[(low + high) / 2];
    	int i = low, j = high;

    	while (i <= j)
    	{
        	while (arr[i] < pivot)
        	{
        	    i++;
       		}
        	while (arr[j] > pivot)
        	{
        	    j--;
        	}
        	if (i <= j)
        	{
        	    int temp = arr[i];
        	    arr[i] = arr[j];
        	    arr[j] = temp;

        	    i++;
        	    j--;
        	}
    	}
    	return i;
	}
	void quickSort(int[] arr,int low,int high)
	{
		if(low<high)
		{
			int pi=partition(arr,low,high);
			quickSort(arr,low,pi-1);
			quickSort(arr ,pi,high);
		}
	}
	void printArray(int[] arr)
	{
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
	}
}
 

