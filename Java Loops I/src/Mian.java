import java.util.Scanner;

public class Mian {
public static void main(String[] args) {
	int i,n=10,y;
	
	Scanner scan = new Scanner(System.in);
	
	int s = scan.nextInt();
	
	for(i=1 ;i<=n ;i++) {
		
		y=(i*s);
		
		System.out.println(+s+" "+"X"+" "+i+" "+"="+" "+y);
}
}
}