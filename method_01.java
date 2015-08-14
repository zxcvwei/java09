import java.util.Scanner;
public class method_01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入一串數字(每個數字為0~9)");
		String a=scn.nextLine();
		System.out.print(fun1(a/*a為使用者輸入的字串*/));
		//列印出丟到fun1運算之後  得到return sum(回傳的東西)
		/*char b [] = a.toCharArray();
		int aa[]=new int[b.length];
		for(int i=0;i<b.length;i++){
			aa[i]=b[i]-'0';
		}此段可在主程式運算
		在主程式運算就不需要fun1*/
		
	}
	
	public static int/*int回傳的東西*/ fun1(String ss){
		//String ss是從外面丟進來運算的東西
		char b [] = ss.toCharArray();//字串轉字元
		int sum = 0;
		int aa[]=new int[b.length];//b.length為長度||aa[]有b.length的長度
		//int aa[] = new int [4]--->aa[]有四個位子
		for(int i=0;i<b.length;i++){
			aa[i]=b[i]-'0';//char b[]為字元  以ASCII換算  'a'=97 97-32=65 65='A'
			sum= sum+aa[i];
		}
		return sum;
	}
}
