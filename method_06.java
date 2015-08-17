import java.util.Scanner;
public class method_06 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入一個正整數");
		int n = scn.nextInt();
		System.out.print(fun1(n));
		
		
	}
	public static int fun1(int n) {
		int x = 1;
		int sum = 0;
		while(x<=n){
			
			sum = sum + x*(x+1);
			x++;
		}
		return sum;
	}

}
