package firstProgram;
import java.util.Scanner;

//import accessSpecifierANDaccessModifier.PractisePage2;

public class Demo  {
	
	public void Sample4() {
		System.out.println("hello world");
	}
	public void Sample4(int num) {
		System.out.println("hello world");
	}
	public static void main(String[] args) {
		
		String str = "MADAM";
		String reverse = "";
		
		for(int i=str.length()-1;i>=0;i--) {
			char rev = str.charAt(i);
			reverse=reverse+rev;
		}
		System.out.println(reverse);
		if(reverse.equals(str)) {
			System.out.println("PALINDROME STRING");
		}else {
			System.out.println("NON PALINDROME STRING");
		}
		

		
		
		Demo d = new Demo();
		d.Sample4();
		int i=1;
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("HOW MANY STARS DO WANT TO PRINT");
		n =sc.nextInt();
		
		do {
			System.out.print("*");
			i++;
		}while(i<=n);
		sc.close();
		
		
		
		
		//System.out.println("hello world");
//		Demo p4 = new  Demo();
//		p4.Sample4();
//		p4.Sample4();
//		
	
	
		
	}

}
