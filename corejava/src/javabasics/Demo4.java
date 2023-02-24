package javabasics;
//without return type and with parameters
public class Demo4 {
	public void sum(int x,int y) {
		int a=x;
		int b=y;
		int res=x+y;
		System.out.println(res);
	}

	public static void main(String[] args) {
		Demo4 obj=new Demo4();
		obj.sum(20,30);
	

	}

}
