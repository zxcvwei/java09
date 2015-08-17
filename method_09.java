import java.util.Scanner;

public class method_09 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入邊長a");
		float a = scn.nextFloat();
		System.out.println("請輸入邊長b");
		float b = scn.nextFloat();
		System.out.println("請輸入邊長c");
		float c = scn.nextFloat();
		System.out.print(fun1(a, b, c));
		
		// System.out.print(i+" "+j+" "+k);

	}

	public static String fun1(float a1, float b1, float c1) {
		if (a1 * a1 + b1 * b1 == c1 * c1) {
			return "直角三角形";
		} else {
			System.out.println("不是直角三角形");
			for (int i = 0; i < 200; i++) {
				for (int j = 0; j < 200; j++) {
					for (int k = 0; k < 200; k++) {
						if (i * i + j * j == k * k && i + j > k && i<k && j<k&&i<j) {
							System.out.println(i+" "+j+" "+k);
						}
					}
				}
			}
		}
		return "";

	}

}
