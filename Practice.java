public class Practice
{
	public static void sort(int[] a) //Selection Sort ints: works
	{
		for(int i = 1; i < 4; i++)
		{
			int x = a[i];
			int k = i;
			while(k > 0 && a[k-1] > x)
			{
				a[k] = a[k-1];
				k --;
			}		
			a[k] = x;
			for(int b : a)
			System.out.print(b);
			System.out.println();
		}
	}

	public static void sort(String[] a)//Selection sort for Strings: works
	{
		for(int i = a.length - 1; i > 0; i--)
		{
			int max = i;
			for(int k = 0; k < i; k++)
			{
				if(a[i].compareTo(a[k]) < 0)
					max = k;
			}
			String temp = a[i];
			a[i] = a[max];
			a[max] = temp;
		}
	}

	public static int search(int target, int[] a, int from, int to)
	{
		if(target > a[a.length - 1] || target < a[0])
			return -1;
		int middle = (from + to) / 2;
		if(a[middle] == target)
		  	 return target;
		if(target < a[middle])
			return search(target, a, from, middle - 1);

		if(target > a[middle])
			return search(target, a, middle + 1, to);
		return -1;
	}
	
	public static void sort(int[] a, int i)//recursive sort: works
	{
		if(i > a.length - 1)
			return;
		int x = a[i];
		int k = i;
		while(k > 0 && a[k-1] > x)
		{
			a[k] = a[k-1];
			k --;
		}
		a[k] = x;
		for(int j : a)
			System.out.print(j);
		System.out.println("i = "+i);
		sort(a, i + 1);
	}
	
	public static void main(String[] args)
	{
		int[] a = {3, 0, 2, 1, 4, 10, 5, 8};
		for(int i : a)
					System.out.print(i);
		System.out.println();
		sort(a, 1);
		for(int i : a)
			System.out.print(i);
	}
}	
