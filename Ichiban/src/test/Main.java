package test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int base = 0;
		int height = 0;
		float area = 0.0f;

		Scanner scn = new Scanner(System.in);

		try {  // Happy Scenraio 들어가는 부분
			base = scn.nextInt();
			
			if(base <= 0) 
				throw new Exception("밑변 0 이하");
			
			height = scn.nextInt();
			
			if(height <= 0) 
				throw new Exception("높이 0 이하");
		} 

		catch (Exception e) { // 반드시 매개변수가 들어가야 한다 => 매개변수의 자료형은 예외
			System.out.println("예외 발생, MSG : " + e.getMessage());
		}

		// 면적 출력
		area = base * height / 2;
		System.out.println(area);	}
}
