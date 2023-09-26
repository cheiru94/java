package college_Quize;

public class Quiz3_1_Guusuu_KUKU {

	public static void main(String[] args) {
		// 偶数の九九
		
		// 繰り返し - for文
		for (int dan = 2; dan <=9; dan++) {
			for (int index = 1; index <=9; index++) {
				
				// 偶数のみ出力
				if (dan%2==0) {
					System.out.print(dan + " X " + index+"= "+dan*index+"\t");
					
					// 3の倍数の場合、改行
					if (index%3==0 ) {
						System.out.print("\n");
					}
					
					// ９の倍数の場合、改行
					if (index==9) {
						System.out.print("\n");
					}
				}
			} /*for_2*/
		}	  /*for_1*/
//---------------------------------------		
	}
}
