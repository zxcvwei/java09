import java.util.Scanner;
public class method_01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("�п�J�@��Ʀr(�C�ӼƦr��0~9)");
		String a=scn.nextLine();
		System.out.print(fun1(a/*a���ϥΪ̿�J���r��*/));
		//�C�L�X���fun1�B�⤧��  �o��return sum(�^�Ǫ��F��)
		/*char b [] = a.toCharArray();
		int aa[]=new int[b.length];
		for(int i=0;i<b.length;i++){
			aa[i]=b[i]-'0';
		}���q�i�b�D�{���B��
		�b�D�{���B��N���ݭnfun1*/
		
	}
	
	public static int/*int�^�Ǫ��F��*/ fun1(String ss){
		//String ss�O�q�~����i�ӹB�⪺�F��
		char b [] = ss.toCharArray();//�r����r��
		int sum = 0;
		int aa[]=new int[b.length];//b.length������||aa[]��b.length������
		//int aa[] = new int [4]--->aa[]���|�Ӧ�l
		for(int i=0;i<b.length;i++){
			aa[i]=b[i]-'0';//char b[]���r��  �HASCII����  'a'=97 97-32=65 65='A'
			sum= sum+aa[i];
		}
		return sum;
	}
}
