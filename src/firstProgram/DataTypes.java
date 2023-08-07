package firstProgram;

import java.util.Scanner;

public class DataTypes {
	public static  void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s =sc.nextLine();
		System.out.println("Enter your name : "+s);

		byte b = sc.nextByte();
		System.out.println("Enter your CGPA here from 1 to 10  : "+b);
		short s1 = sc.nextShort();
		System.out.println("Enter your 12th marks : "+s1);
		int i = sc.nextInt();
		System.out.println("Enter your 10th marks : "+i);
		float fi  = sc.nextFloat();
		System.out.println("Enter your height here : "+fi);
		double d = sc.nextDouble();
		System.out.println("Enter your weight here  : "+d);
		long  l1 = sc.nextLong();
		System.out.println("Enter your mobile number : "+l1);
		
		boolean b1 = sc.nextBoolean();
		System.out.println("married or unmarried : "+b1);
		
		//String s =sc.nextLine();
		///System.out.println("Enter your name : "+s);
		sc.close();
	}
	

	
}
