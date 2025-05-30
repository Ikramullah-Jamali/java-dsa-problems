

class LinearSearchString
{
	public static void main(String [] args)
	{
		String []arr={"inam","hamid","shakeel","basit","farhan"};
		
		String item="farhan";
		int temp=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].equals(item))
			{
			   System.out.println("item is present in "+i+" index position.");
			   temp=temp+1;
			   break;
			}
		}
		if(temp==0)
		{
			System.out.println("item is not present in list.");
		}
		
	}
}
