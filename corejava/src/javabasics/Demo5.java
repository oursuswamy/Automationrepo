package javabasics;
//with return type and with parameters
public class Demo5 {
	public int sum(int x,int y) {
		int a=x;
		int b=y;
		int res=a+b;
		return(res);
		}
	public static void main(String[] args) {
		Demo5 obj=new Demo5();
		int total=obj.sum(100,200);
		System.out.println(total);

	}

}
