import java.util.Scanner;

public class PrintThree
{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);


		System.out.print("请输入您要打印的多少以内的偶数：");
		int o = input.nextInt();

		
		for(int i = 0;i<=o;i++){
			if(i%2 == 0){
				System.out.print(i + "\t");
			}
		}
		
	}
}