import java.util.Scanner;
public class method_10 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("½Ð¿é¤J¤@¦r¦ê");
		String a = scn.nextLine();
		System.out.print(fun1(a));
	}
	public static int fun1(String xx) {
		char b[] = xx.toCharArray();
		int sum = 0;
		int aa[] = new int[b.length];
		for (int i = 0; i < b.length; i++) {
			if (b[i] <= '9' && b[i] >= '0') {
				aa[i] = b[i] - '0';
				sum = sum + aa[i];
			}
		}
		return sum;
	}
}
