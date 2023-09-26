package content_OF_course;

import java.util.Scanner;

public class test_Counting_Character {

	public static void main(String[] args) {
		// 'h' , 't' , 'p' -> 文字ごとに発生する頻度を出力すること
		// hhtttpppabc ->
		// その他 3個

		// 1. 条件の 'h' , 't' , 'p' をわきまえる
		// 2. その後、当たる文字がある場合には変数を1づつ増加させる

		/* h , t , p 카운트 변수 */
		int h_char = 0;
		int t_char = 0;
		int p_char = 0;
		String rest_char = "";

		// 사용자로 부터 단어 입력 받기
		Scanner scan = new Scanner(System.in);

		System.out.println("単語をご記入下さい。");
		String Inputchar = scan.next();

		for (int i = 0; i <= Inputchar.length() - 1; i++) {

			char character = Inputchar.charAt(i);
			// ※※※※※※※※※※ 조건문 ※※※※※※※※※※

			// 場合 h
			if (character == 'h') {
				h_char++;
			}

			// 場合 t
			else if (character == 't') {
				t_char++;
			}

			// 場合 p
			else if (character == 'p') {
				p_char++;
			}

			else {
				rest_char += character;
			}
		}
		System.out.println("hの数 : " + h_char);
		System.out.println("tの数 : " + t_char);
		System.out.println("pの数 : " + p_char);
		System.out.println("その他  : " + rest_char);
		
		scan.close();
	}

}
