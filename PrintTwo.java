import java.util.Scanner;

public class PrintTwo
{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);


		System.out.print("请输入您要打印的三角形行数：");
		int o = input.nextInt();

		
		for(int i=1;i<=o;i++){
			for(int z=o;z>=i;z--){
				System.out.print(" ");
			}
			for(int x=1;x<=i;x++){
				System.out.print("*");
			}
			if(i>=2){
				for(int c=1;c<=i-1;c++){
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
	}
}