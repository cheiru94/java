package theory;

import java.util.Scanner;

public class How_to_use_Scanner {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int bar1 = scan.nextInt(); // int 정수

		long bar2 = scan.nextLong(); // long 정수

		String msg = scan.next(); // 문자열

		float fTemp = scan.nextFloat(); // float 실수

		double dTemp = scan.nextDouble(); // double 실수

		System.out.println("betty");
		
		scan.close();

	}

}
