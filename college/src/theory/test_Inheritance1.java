package theory;

class Player {
    String name;
    int num;

    void shoot() {
        System.out.println("Player 슛");  // "Overridng" 의 적용 대상은 메소드
    }                                //부모로부터 물려받은 메소드를 내가 새롭게 재정의 하는 것
}

class SG extends Player {               // => 상속이 되어서 , name 과 num 을 상속받는다
    SG(String argName, int argNum) {
        name = argName;
        num = argNum;
    }
    void shoot() {
        System.out.println("SG슛");
    }
}

class PF extends Player {                // => 상속이 되어서 , name 과 num 을 상속받는다
    PF(String argName, int argNum) {
        name = argName;
        num = argNum;
    }

}
public class test_Inheritance1 {

	public static void main(String[] args) {
		(new SG("", 1)).shoot(); 
	    (new PF("", 1)).shoot(); 
	}

}
