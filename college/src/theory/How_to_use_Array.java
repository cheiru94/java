package theory;

public class How_to_use_Array {

	public static void main(String[] args) {

		// 초기값 10

		int foo[] = new int[3];
		

		foo[0] = 10;
		foo[1] = 7;
		foo[2] = 3;

		// 배열을 생성하면서 초기 값까지 넣을 수 있는 방법
		int bar[] = { 10, 7, 3 }; // 블레이쓰에 묶여 있으면 자동적으로 배열 생성 , 콤마개수 + 1 = 원소의 개수

		
		
		for (int i = 0; i < bar.length; i++) {
			System.out.println(foo[i]);
		}
		System.out.println();
		for (int i = 0; i < bar.length; i++) {
			System.out.println(bar[i]);
		}

	}

}
