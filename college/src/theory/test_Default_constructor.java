package theory;

class Marin {
	String name;
	int    hp;
	
	//default constructor
	Marin() {
		
	}
	Marin(String argName){
		name = argName;
	}
	Marin(String argName , int argHp){
		name = argName;
		hp = argHp;
		
	}
}

public class test_Default_constructor {

	public static void main(String[] args) {
		
		Marin s1 = new Marin();    // 자바는 전처리 과정을 거쳐 생성자가 없으면 디폴트 생성자를 만들어 넣는다 
		s1.name = "Scv 1";
		s1.hp = 20;
		
		Marin s2 = new Marin("Scv 2");
		Marin s3 = new Marin("Scv 2",20);

//		Scv s4 = new Scv (2.0f);
		
	}

}
