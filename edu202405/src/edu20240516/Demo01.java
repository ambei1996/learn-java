package edu20240516;

public class Demo01 {
	public static void main(String[] args) {
		int a;
		a = 10;
		short b = 5;
		long c = 10L;// long类型后面要加L//
		int d;
		d = 3 * b - a;
		System.out.println(d);
		d = (int) c % 3;// 表达式可以赋予变量,等于号前后类型必须一致//
		System.out.println(d);
		float e = 1.5F;// float赋值的时候 数字要加F//
		float f = 3;
		float g = 10;
		e = g / f;
		System.out.println("e的值是" + e);// float最多是小数点后7位
		double h = g / f;
		System.out.println("h的值是" + h);
		/*
		 * 5 1 e的值是3.3333333 h的值是3.3333332538604736
		 */

		double a1 = Math.random();// 随机生成0-1之间的随机数 Math是类 random是方法--静态类
		System.out.println(a1);
		double a2 = Math.round(3.63);// 四舍五入的方法
		System.out.println(a2);
		int a3 = 10 / 4;// =2.5 就是2 即取结果的整数
		System.out.println(a3);
		float a4 = (float) 1.5 / 3;// 左小右大 报错 short<int<long<float<double 小数默认是double
		int a5 = (int) 4.5 / 3;
		System.out.println(a4 + " " + a5);
		
		
		
		
		
	}
}
