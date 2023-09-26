package theory;

public class How_to_use_Arraytest1 {

	public static void main(String[] args) {

		// array 연습

		int bar[] = new int[4]; // 0으로 초기 값이 다들어 간다

		for (int i = 0, j = 5; i < bar.length; i++, j--) {

			bar[i] = j;
		}
		int foo[];

		foo = bar;

//				bar = foo;

		foo[0] = 10;

		System.out.println(bar[0]);

	}

}
