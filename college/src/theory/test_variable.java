package theory;

class Hydra {
	String name;
	int    hp; // 맴버변수
	
	void prtSomething (int argA /*매개변수*/) {
		
		int sum /*지역변수*/= argA + hp;
		
		System.out.println(sum);
	}
	
	
}	


public class test_variable {

	public static void main(String[] args) {

		
		Hydra s1 = new Hydra();  // 여기서 객체는 참조가 되지 않아서 삭제된다 
		s1.hp = 100;
	
		Hydra s2 = new Hydra();
		s2.hp = 200;
		
		System.out.println(s1.hp + " : " + s2.hp);
		
		s1 = null;
//		System.out.println(s1.hp + " : " + s2.hp);
		
		
	}

}
