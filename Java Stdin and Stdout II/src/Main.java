import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		
		  Scanner scan = new Scanner(System.in);
	        
	  //This     
	        int a = scan.nextInt();
	        double b = scan.nextDouble();
	        scan.nextLine();
	        String s= scan.nextLine();   
	        scan.close();
	        
	        System.out.println("String:"+s);
	        System.out.println("Double:"+b);
	        System.out.println("Int:"+a);
	        
	        
	        
	        
	}
	}