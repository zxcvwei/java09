import java.util.Scanner;
public class method_02 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入國英數的成績");
		float a=scn.nextFloat();
		float b=scn.nextFloat();
		float c=scn.nextFloat();
		System.out.println(fun1(a,b,c));
		System.out.println(fun2(a,b,c));
	}
	
	public static float fun1(float a,float b,float c){
		float sum = a+b+c;
		return sum;
	}
	public static float fun2(float a, float b,float c){
		float avg = (a+b+c)/3;
		return avg;
	}
	
}
