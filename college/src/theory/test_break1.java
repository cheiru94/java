package theory;

public class test_break1 {

	public static void main(String[] args) {

		// 11.16
		
		for (;;) {
			int foo = 0;
			int bar = 2;
			while (true) {
				if (foo > 2)
					break; // 탈출
				for (;;) {
					if (bar > 4)
						break; // 탈출

					bar++;
					System.out.println(1);
				}

				foo++;
				System.out.println(2);
			}
			System.out.println(3);
		}

	}

}
