package javabasics;

public class OddandEve {

	public static void main(String[] args) {
		int ecount=0;
		int ocount=0;
		for(int i=1;i<=20;i++)
		{
			if(i%2==0)
		
		{
		System.out.println(i + "is even");
		ecount++;
		}
		else
	{
		System.out.println(i + "is odd");
		ocount++;
	}
		}
		System.out.println("no of even numbers:"+ ecount);
		System.out.println("no of odd numbers:"+ ocount);
	}
}


