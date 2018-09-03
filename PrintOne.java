import java.util.Scanner;

public class PrintOne
{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("请输入您要打印的行数：");
		int o = input.nextInt();
		System.out.print("请输入您要打印的列数：");
		int p = input.nextInt();

		
		System.out.println("您要打印的行数是：" + o + ",您要打印的列数是：" + p + "。如下图所示：");
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