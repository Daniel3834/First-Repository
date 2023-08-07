package firstProgram;

//import java.util.Scanner;

//import java.util.Scanner;

public class WorkOutProblems {
	
	public static void main(String[] args) {

		// PRINTING THE LETTER P

//		String str = "Welcome To Java Program";
//		
//		for(int i=0;i<str.length();i++) {
//			char ch = str.charAt(i);
//			
//			if(ch=='P') {
//				System.out.println("It contains the letter: "+ch);
//			}
//		}

		// UPPER CASE TO LOWER CASE
//String str = "Welcome To Java Program";
//		
//		
//		for(int i=0;i<str.length();i++) {
//			char ch = str.charAt(i);
//			
//			char lower = Character.toLowerCase(ch);
//			System.out.println(lower);
//		}
//		

//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter the word it will give you a reverse for even word: ");
//		
//		String str = sc.nextLine();
//		
//		String reverse = "";
//		
//		for(int i=str.length()-1;i>=0;i--) {
//			char ch = str.charAt(i);
//			
//			if(i%2==0) {
//				reverse=reverse+ch;
//			}
//		}
//		System.out.println(reverse);

		// EVEN WORDS REVERSE USING SCANNER
//		Scanner sc = new Scanner(System.in);
//
//		System.out.println("Enter the sentence, it will give you the reverse of even words: ");
//		String str = sc.nextLine();
//
//		String[] words = str.split(" ");
//		StringBuilder reverse = new StringBuilder();
//
//		for (int i = words.length - 1; i >= 0; i--) {
//			if (i % 2 == 0) {
//				reverse.append(reverseWord(words[i])).append(" ");
//			} else {
//				reverse.append(words[i]).append(" ");
//			}
//		}
//
//		System.out.println("Reversed odd words: " + reverse.toString().trim());
//		sc.close();
//	}
//
//	private static String reverseWord(String words) {
//
//		return new StringBuilder(words).reverse().toString();
//
//	}

//		int A[] = { 55, 35, 96, 56, 45 };
//		int B[] = { 55, 35, 87, 56, 78 };
//		for (int i = 0; i < A.length; i++) {
//
//			for (int j = 0; j < B.length; j++) {
//
//				if (A[i] == B[j]) {
//					System.out.println("Common element: " + A[i]);
//				}
//			}
//		}

		// PRIME NUMBER PROGRAM
//		int a = 3;
//		int count = 0;
//		int flag = 0;
//		count = a / 2;
//		if (a == 0 || a == 1) {
//			System.out.println(a + "is not a prime number");
//		} else {
//			for (int i = 2; i <= count; i++) {
//				if (a % i == 0) {
//					System.out.println(a + " not prime number");
//					flag = 1;
//					break;
//
//				}
//			}
//		}
//		if (flag == 0) {
//			System.out.println(a + " is a prime number");
//		}

//		Write a program to find the second highest number in an array in Java.

//		int a1[] = { 100, 106, 110, 150, 198, 194, 200 };
//
//		int temp = 0;
//		for (int i = 0; i < a1.length; i++) {
//			for (int j = 1 + i; j < a1.length; j++) {
//				if (a1[i] > a1[j]&&a1[i] < a1[j]) {
//					temp = a1[i];
//					a1[i] = a1[j];
//					a1[j] = temp;
//				}
//			}
//		System.out.println(a1[i]);
//		}
//
////		for(int i=0;i<a1.length;i++) {
////			System.out.println("Ascending Order: "+a1[i]);
////		}
//		
//
//		System.out.println("maximum number: " + a1[a1.length-1]);
		
		
		
//		 Write a program to check if two strings are anagrams in Java.
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter your first anagran word: ");
//		
//		String fristanagaram = sc.nextLine();
//		
//		System.out.println("Enter your second anagram: ");
//		
//		String secondanagram = sc.nextLine(); 
//		
//		if (checkAnagram(fristanagaram,secondanagram)) {
//			System.out.println(fristanagaram + " and " + secondanagram + " are Anagrams");
//		}
//		else {
//			System.out.println(fristanagaram + " and " + secondanagram + " are NOT Anagrams");
//		
//		
//	}
//		sc.close();
//	}
//		
//		public static boolean checkAnagram(String fristanagaram, String secondanagram) {
//		
//		fristanagaram = fristanagaram.replaceAll("\\s", "").toLowerCase();
//		secondanagram = secondanagram.replaceAll("\\s", "").toLowerCase();
//		
//		if(fristanagaram.length()!=secondanagram.length()) {
//			return false;
//		}
//		
//		else {
//		for(int i=0;i<fristanagaram.length();i++) {
//			
//			for(int j=0;j<secondanagram.length();j++) {
//				
//				if(fristanagaram.charAt(i)==secondanagram.charAt(j)) {
//					secondanagram = secondanagram.substring(0, j) + secondanagram.substring(j + 1);
//					break;
//				}
//				
//			}
//			
//		}
//		
//
//	}
//		if (secondanagram.length() == 0)
//		{
//			return true;
//		} else
//		{
//			return false;
//		}
		
		
//		Find the minimum and maximum element in an array using minimum comparisons	
		
		WorkOutProblems w1 = new WorkOutProblems();
        w1.findMinAndMax();

}
	public void findMinAndMax() {
		int a2[] = { 120, 106, 110, 150, 198, 194, 200 ,600};
		int max=a2[0];
		int min=a2[0];
		
		for(int i=0;i<a2.length;i++) {
			if(a2[i]<min) {
				min=a2[i];
			}else if(a2[i]>max) {
				max=a2[i];
			}
		}
		System.out.println("minimum num: "+min);
		System.out.println("maximum num: "+max);
	}
	
}

