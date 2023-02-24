package javabasics;
//with return type and without parameters
public class Demo3 {
	public int sum() {
	int a=10;
	int b=20;
	int res=a+b;
	return (res);
	//System.out.println(return);
	}

	public static void main(String[] args) {
		Demo3 obj=new Demo3();
		 int total=obj.sum();
		System.out.println(total);
		
		// TODO Auto-generated method stub

	}

}
