import java.util.Scanner;

public class method_04 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入3個整數");
		int x = scn.nextInt();
		int y = scn.nextInt();
		int z = scn.nextInt();
		System.out.print("最大公因數" + fun1(x, y, z));
	}

	public static int fun1(int x, int y, int z) {

		if (x < y) {
			int v1 = x;
			x = y;
			y = v1;
		}
		if (y < z) {
			int v1 = y;
			y = z;
			z = v1;
		}
		if (x < z) {
			int v1 = x;
			x = z;
			z = v1;
		}
		int r = 0;
		while (y != 0) {
			r = x % y;
			x = y;
			y = r;
		}
		while (z != 0) {
			int w = r % z;
			r = z;
			z = w;
		}
		return r;
	}
}
