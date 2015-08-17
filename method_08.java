import java.util.Scanner;

public class method_08 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入一個正整數");
		int n = scn.nextInt();
		System.out.print(fun1(n));
	}
	public static int fun1(int n) {
		int sum = 0;
		for (int i = 0; i < n; i++) {
			int h = 1;
			for (int j = 0; j < i; j++) {
				h = h * 2;
			}
			sum = sum + 2 * h;
		}
		return sum;
	}
}