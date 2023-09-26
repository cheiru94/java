package theory;

public class How_to_use_Random {

	public static void main(String[] args) {
		// 문제 풀기

		// 난수 발생

		// Math.random( ) // -> 0 이상 1 미만의 실수 값.

		// 1 ~ 10
		int randomNum = (int) (Math.random() * 10) + 1 + 35;// 0 ~ 9.99999999....

		System.out.println(randomNum);

		///////////////////////////////////////////////////////////////

		System.out.println(Math.random()); // 0.23279967568276427
		System.out.println(Math.random() * 10); // 2.3279967568276427 (0.xxx... ~ 9.xxx 까지의 값 반환)
		System.out.println((int) Math.random() * 10); // 2 ( 0부터~9까지의 값 반환 )
		System.out.println((int) Math.random() * 10 + 1); // 3 ( 1부터~10까지의 값 반환 )

	}

}
