package content_OF_course;

import java.util.Scanner;

public class test_cahr_choose {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// <문제1>
		// 콘솔로부터 문자열 입력 받기
		String words = scan.next();

		// 입력 받은 문자열에서 첫 번째 들자를 반환 -> (0번째)
		char word = words.charAt(0);

		// 입력받은 알파벳이 "d" 이며 "참 아니면 "거짓"을 출력하는 코드 작성
		System.out.println(word == 'd' ? "true" : "false");

/*	
		// <문제1>
		//입력받은 알파벳이 "d" 이며 "참 아니면 "거짓"을 출력하는 코드 작성
		
		// 사용자로 부터 알파벳 입력 받기 
		Scanner scan= new Scanner(System.in);
		
		//출력문 
		System.out.println("アルファベットをご記入ください。");
		String words = scan.nextLine();
		
		//문자 -> 문자열 
		char word = words.charAt(0);
		
		//결과 출력
		System.out.println(word =='d' ? "真" :"偽");
*/		
		
		
		System.out.println("---------------------------------");
		// <문제2>
		// 입력받은 값이 f, t, u, k 일 경우 해당 값 출력
		// 그외 값 아무것도 출력하지 않음
		// 예) a -> x ( 잘못된 입력 값)

		//※ 조건식 : 입력 값이 f, t, u, k 인 경우에만 출력
		//word = f, t, u, k 이면 출력
		if (word == 'f' || word == 't' || word == 'u' || word == 'k') {
			System.out.println(word);
		} else {
			System.out.println("間違いであります。");
		}

		scan.close();

	}

}
