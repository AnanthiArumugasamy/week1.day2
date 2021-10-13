package week1.day2.assignment_testleaf;
import java.util.Scanner;
class Calculator {
	public int add(int a,int b,int c) {
		int tot=a+b+c;
		return tot;
}
	public int sub(int a,int b) {
		int tot= a-b;
        return tot;
	}
	public double mul(double d1,double d2) {
		double d=d1*d2;
		return d;
	}
	public float divide(float f1,float f2) {
		float f=f1/f2;
		return f;
	}
}
 public class Mycalculator {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Calculator cal=new Calculator();
		System.out.println("1-addition");
		System.out.println("2-subtraction");
		System.out.println("3-multiplication");
		System.out.println("4-Division");
		for (int i=0;  i<=5; i++)
		{
			int n=s.nextInt();
			switch(n) {
		case 1:
			System.out.println("Enter 3 int numbers");
			int a1=s.nextInt();
		    int a2=s.nextInt();
			int a3=s.nextInt();	
			System.out.println(cal.add(a1,a2,a3));
			break;
		case 2:
			System.out.println("Enter 2  int numbers");
			int s1=s.nextInt();
			int s2=s.nextInt();
			System.out.println(cal.sub(s1,s2));
			break;
		case 3:
			System.out.println("Enter 2 double numbers");
			double m1=s.nextDouble();
			double m2=s.nextDouble();
			System.out.println(cal.mul(m1,m2));
			break;
		case 4:
			System.out.println("Enter 2 float numbers");
			float d1=s.nextFloat();
			float d2=s.nextFloat();
			System.out.println(cal.divide(d1,d2));
			break;
			default:
				System.out.println("please enter 1-4");
		}
		
		
	}
}
}

