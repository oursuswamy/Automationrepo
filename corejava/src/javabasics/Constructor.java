package javabasics;

class Constructor {
	int a;
	float b;
	Constructor(int x, float y)
	{
		a=x;
		b=y;
		System.out.println(a);
		System.out.println(b);
	}

//public class Const{
	public static void main(String[] args) {
		Constructor obj=new Constructor(10,30);
		Constructor obj1=new Constructor(10,30);
		
		// TODO Auto-generated method stub

	}
}


