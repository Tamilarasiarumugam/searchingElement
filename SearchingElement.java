package assignments;

public class SearchingElement {
	
	public static void main(String[] args)
	{
		int arr[]={10,20,30,40,50};
		int first=0;
		int last=arr.length-1;
		int mid=(first+last)/2;
		int key=40;
		while(first<=last)
		{
			if(arr[mid]<key)
			{
				first=mid+1;
			}
			else if(arr[mid]==key)
			{
				System.out.println("element found at the index:"+mid);
				break;
			}
			else{
				last=mid-1;
			}
			mid=(first+last)/2;
		}
		if(first>last)
		{
				System.out.println("element not found ");
		}
		
	}
}

