package javabasics;

public class Reverese {

	public static void main(String[] args) {
		int num=1234;
		 int rem=0;
		int rev=0;
		while(num!=0)
		{
			rem=num%10;
			rev=(rev*10)+rem;
			num=num/10;
		}
		System.out.println("reverse of given num is:"+rev);
		// TODO Auto-generated method stub

	}

}
