package scanner;

import java.util.Scanner;

public class Main02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자열입력 1 : ");
		String s1 = sc.nextLine();
		System.out.println(s1);
		
		System.out.println("문자열입력 2 : ");
		String s2 = sc.next();
		System.out.println(s2);
		
		sc.close();
	}

}
