import java.util.Scanner;

public class method_05 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("½Ð¿é¤Jx");
		float x = scn.nextFloat();
		if (x < -1) {
			System.out.println(fun1(x));
		} else if (-1 <= x && x <= 1) {
			System.out.println(fun2(x));
		} else {
			System.out.println(fun3(x));
		}
	}
	public static float fun1(float x) {
		float y;
		return y = 3 * x * x;
	}
	public static float fun2(float x) {
		float y;
		return y = x * x * x + 3 * x - 3;
	}
	public static float fun3(float x) {
		float y;
		return y = 2 * x + 3;
	}
}
