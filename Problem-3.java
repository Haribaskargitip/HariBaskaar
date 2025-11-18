import java.util.Scanner;

public class NumberSeries {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a");
		int a=sc.nextInt();
		int terms=(a%2==0)?a-1:a;
		for(int i=1;i<=terms;i++) {
			int odd=(2*i)-1;
			System.out.print(odd);
			if(i!=terms) {
				System.out.print(",");
			}
		}
		sc.close();
	}
}
