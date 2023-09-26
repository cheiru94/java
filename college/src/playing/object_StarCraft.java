package playing;

class Starcraft {
	
	String species;
	String unit;
	int hp;
	
	// 생성자는 무조건 .java 파일의 이름과 동일해야 한다!! 
	Starcraft( String argunit,String argspecies,int arghp ) {
		
		species = argspecies;
		unit = argunit;
		hp = arghp;
	}
	
	void print() {
		System.out.println("'"+unit + "'가 생성되었습니다.");
		System.out.println("유닛 : " + unit);
		System.out.println("종족 : " + species);
		System.out.println("HP : " + hp ); 
	}
	
}
	

public class object_StarCraft {

	public static void main(String[] args) {

		Starcraft zerg = new Starcraft ("ultra", "zerg" , 100); // 객체 1개 생성 
		Starcraft protos = new Starcraft ("carrier" , "protos", 100); // 객체 1개 생성 
		Starcraft terran = new Starcraft ("battlecruser" ,"terran", 100); // 객체 1개 생성 
		
		// 이와 같이 메인 메소드에서 print 형식으로 출력하려면 하나하나 다 쳐야해서 개노가다....
//		System.out.println("종족 : " + zerg.species);
//		System.out.println("유닛 : " + zerg.unit);
//		System.out.println("체력" + zerg.hp ); 
		
		zerg.print();   // 생성자 불러오기 ( 해당 객체안의 알고리즘 내용 실행 )
		
		protos.print();   // 생성자 불러오기 ( 해당 객체안의 알고리즘 내용 실행 )
	
		terran.print();   // 생성자 불러오기 ( 해당 객체안의 알고리즘 내용 실행 )
	}

}
