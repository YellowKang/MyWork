import java.util.Scanner;

public class PrintOne
{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("��������Ҫ��ӡ��������");
		int o = input.nextInt();
		System.out.print("��������Ҫ��ӡ��������");
		int p = input.nextInt();

		
		System.out.println("��Ҫ��ӡ�������ǣ�" + o + ",��Ҫ��ӡ�������ǣ�" + p + "������ͼ��ʾ��");
		System.out.println();
		System.out.println();
		System.out.println();
		for(int i=1;i<=o;i++){
			for(int z=1;z<=p;z++){
				System.out.print("*");
			}
			System.out.println();
		}

		
	}
}