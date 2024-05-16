package edu20240513;

public class Demo02 {
	public static void main(String[] args) {
		int a = 1;
		a = a + 1;
		System.out.println(a);
		int b = 2;
		b = a + b;
		System.out.println("更改前b的值为； " + b);

		int c = a;
		a = b;
		b = c;

		System.out.println("更改后b的值为； " + b);

	}

}
