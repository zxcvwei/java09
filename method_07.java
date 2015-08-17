import java.util.Scanner;
public class method_07 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入一個正整數");
		int n = scn.nextInt();
		System.out.print(fun1(n));
	}
	public static double fun1(int n) {
		int x = 1;
		double sum = 0;
		while (x <= n) {
			sum = sum + (1.0/*轉成小數運算*/ / ((2 * x - 1) * (2 * x)));
			x++;
		}
		/*for(int i=1;i<=n;i++){
			sum = sum + (1-->整數運算 / ((2 * i - 1) * (2 * i)));
		}*/
		return sum;
	}
}
