package hongong_Java;

public class TypeCasting___Primitive_Type_OR_String {

	public static void main(String[] args) {
		
//     1. String -> Primitive Type 으로 변경 時
		String letter = "777";
		
		int result = Integer.parseInt(letter);
		
		System.out.println( result + 1 );
		
		
//     2. Primitive Type -> String  으로 변경 時
		int number = 777;
		
		String str = String.valueOf(number);
		
		System.out.println( str + 1 );  // 검증
		
		

	}

}
