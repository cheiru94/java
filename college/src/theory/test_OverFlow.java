package theory;

public class test_OverFlow {

	public static void main(String[] args) {
		int foo = 2147483647;		// int로 표현할 수 있는 최대치
									// 2의 보수 때문에 양의정수에서 하나를 줄여 0을 표현
		System.out.println(foo);

		foo = foo + 1;				// -2147483648 최대치를 넘어가서 기존의 결과값과 다름
										// '오버플로우' 라고 함
		System.out.println(foo);	// '오버플로우' 는 오류를 일으키지 않음
										// 문제가 될 수 있다. -> 논리적 오류

	}

}
