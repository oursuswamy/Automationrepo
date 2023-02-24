package javabasics;

public class Palamdrom {
	
	public static void main(String[] args) {
		int num=121;
		int orig_num=num;
		int rem=0;
		int rev=0;
		while(num >0)
		{
			rem=num%10;
			rev=(rev*10)+rem;
			num=num/10;
		}
		if(orig_num==rev)
		{
			System.out.println("Is polindrom"); 
		}
		else
		{
			System.out.println("not polindrom");
		}
	}
}

