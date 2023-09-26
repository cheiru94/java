package theory;

public class How_to_use_Arraytest2 {

	public static void main(String[] args) {

		// 방법 1 // 
		// h e l l o
		char bar[] = { 'h', 'e', 'l', 'l', 'o' };

		for (int i = 0; i < bar.length; i++) {
			System.out.println(bar[i]);
		}

		// 방법 2 //
		// h e l l o
		char mii[] = new char[] { 'h', 'e', 'l', 'l', 'o' };

		for (int i = 0; i < mii.length; i++) {
			System.out.println(mii[i]);
		}

	}

}
