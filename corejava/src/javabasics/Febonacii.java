package javabasics;

public class Febonacii {

	public static void main(String[] args) {
		int a=0;
		int b=1;
		
		System.out.println(a + " " + b);
	
		for(int i=1;i<=10;i++)
		{
			int res=a+b;
			System.out.println("  "+res);//0 1,1,2,3,5,8,13,21,34,55,89
			a=b;
			b=res;
		}

	}

}
