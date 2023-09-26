package playing;

// 클래스. 1
class ChunganLee {
	
	// 멤버 변수
	String family = "청안";
	/*static*/ String firstName = "이";  /*static을 붙이니 전부 박씨가 되어버립니다... ;;; */
	String name;
	int num ;
	String num_char = "대손 (장손)";
	
	
	// 멤버 메소드
	String info_of_lee() {
		return family +" " +firstName + name +" "+ num +num_char;
	}
}

//클래스. 2      -> 클래스 1참조
class Sangyeul extends ChunganLee {
	
//	초기화 블록 
	{	
		
		name= "상열";
		num = 23 ;
	}

	// 멤버 메소드 
	static String lastName() {
		String lastName="상열";
		return lastName;
	}
	
}

//클래스. 3      -> 클래스 2참조
class Eunyong extends Sangyeul {
	
//	　firstName ;
//	초기화 블록 
	{	
		firstName ="박";
		family ="밀양";
		name= "은영";
		num_char ="처";
	}
	
	// 멤버 메소드 
	static String husband() {
		String last_Name="상열";
		return last_Name;
	}
	
	String info_of_lee() {
		return family +" " +firstName + name +" "+  "/ 夫 :"+firstName+husband();
	}
	
}

//클래스. 4      -> 클래스 2참조
class Jaeil extends Sangyeul {
	
	// 멤버 변수
	String father ; 
	
	// 초기화 블록
	{
		 name= "재일";
		 num = 24 ;
		 father = Sangyeul.lastName();
	}
	
	// 멤버 메소드 
		static String last_Name() {
			String last_Name="재일";
			return last_Name;
		}
	
	// 멤버 메소드 
	String info_of_lee() {
		return family +" " +firstName + name +" "+ num +num_char+ "/ 父 :"+firstName+father;      
	}
}

//클래스. 5      -> 클래스 2참조
class Jaesung extends Sangyeul {
	
	// 멤버 변수
	String father ; 
	String brother ; 
	
	
	// 초기화 블록
	{
		 name= "재성";
		 brother = Jaeil.last_Name();
		 num_char = "";
		 father = Sangyeul.lastName();
	}
	
	// 멤버 메소드 
	String info_of_lee() {
		return family +" " +firstName + name +" "+"/ 父 :"+firstName+father +"/ 兄 :" +firstName+brother;      
	}
	
}


public class Pedigree_Of_Lee {

	public static void main(String[] args) {

		
		Sangyeul tsitsi = new Sangyeul();
		System.out.println(tsitsi.info_of_lee()); 

		Eunyong haha = new Eunyong();
		System.out.println(haha.info_of_lee()); 
		
		
		Jaeil ore = new Jaeil();
		System.out.println(ore.info_of_lee()); 
		
		Jaesung otouto = new Jaesung();
		System.out.println(otouto.info_of_lee()); 
	}

}
