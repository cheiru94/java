package theory;

class ichiban {
	
	String strichibanName;
	String strichibanAge;
	String strichibanCollege;
	
	
	void printBetty() {
		System.out.println(strichibanName);
		System.out.println(strichibanAge);
		System.out.println(strichibanCollege);
	}
}

public class How_to_use_Constructor_using {

	public static void main(String[] args) {

		ichiban cheiru = new ichiban ();

		cheiru.strichibanName = "이재일"; // 값을 넣기만 넣은 것
		cheiru.strichibanAge = "30살"; // 값을 넣기만 넣은 것
		cheiru.strichibanCollege = "영진전문대"; // 값을 넣기만 넣은 것
		
		cheiru.printBetty(); // 생성자 안의 내용을 실행 시키는 것
	}

}
