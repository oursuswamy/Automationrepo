package javabasics;

public class Addingtwoarry {

	public static void main(String[] args) {
		int a[][]= {{1,2},{3,4}};
		int b[][]= {{4,5},{5,6}};
		int res[][]=new int[2][2];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				res[i][j]=a[i][j]+b[i][j];
			}
		}
		System.out.println();
		

	}

}
