import java.util.Scanner;

public class method_03 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("�п�J2�Ӿ��");
		int x = scn.nextInt();
		int y = scn.nextInt();
		System.out.print("�̤j���]��" + fun1(x, y));
	}
	public static int fun1(int x, int y) {
		while (y != 0) {
			int r = x % y;
			x = y;
			y = r;
		}
		return x;
	}
}
