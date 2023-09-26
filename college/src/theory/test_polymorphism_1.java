package theory;


class Terran {
    void prtSMode() {}
}



class Scv1 extends Terran {
    int mineral = 20;
		void prtSMode() {
        System.out.println(mineral);
		}

}

class Marine extends Terran {
    boolean sPack = false;
		void prtSMode() {
        System.out.println(sPack);
		}
}

public class test_polymorphism_1 {

	public static void main(String[] args) {
	
		Terran [] unitList = new Terran [200];

		unitList[0] = new Scv1();      //  다형성 적용  =>    부모 class  <- 자식 class
		unitList[1] = new Marine();   //  다형성 적용  =>    부모 class  <- 자식 class
		
		unitList[0].prtSMode();   //     unitList[0]에서 동적 바인딩 실행
		unitList[1].prtSMode();   //     unitList[0]에서 동적 바인딩 실행 

	}

}
