import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	int q =scan.nextInt();
	for(int i = 0 ; i<q;i++)
	
	{
		int a =scan.nextInt();
		int b =scan.nextInt();
		int n =scan.nextInt();
		
		for(int j=0;j<n;j++){
			
			a =a+(b*((int)Math.pow(2, j)));
			
			
			System.out.print(a+" ");
		}
		System.out.println();
	}
	scan.close();
}
}