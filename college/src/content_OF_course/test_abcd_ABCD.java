package content_OF_course;

public class test_abcd_ABCD {

	public static void main(String[] args) {

		// a = 97
		char letter = 97;

		// 반복문 작성
		// 97에서 3을 더하면 출력 하지 마라
		for (char index = letter; index <= 122; index += 3) {

			System.out.print(index);
		}

		for (char index = 'a'; index <= 'z'; index += 3) {

			System.out.print(index);
		}

		// A = 65 ~ Z = 90

		char big = 90;
		for (char indexa = 'Z'; indexa >= 'A'; indexa -= 1) {
			System.out.print(indexa);
		}

	}

}
