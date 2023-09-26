package theory;


class Ketty {
	// 반환형 메소드 이름 (매개변수) {
    // }
	
	static StdInfo doSomething() {
		
		
		return new StdInfo(2,"hello");
	}
}

class StdInfo {
	
	int id ;
	String name;
	
	StdInfo(int argId , String argName ){
		id = argId ;
		name = argName;
	}
	
}


public class Return_method {
	
	// test2 클래스는 실행 시키지 않는다 !! 
	public static void main(String[] args) {
		

	}
}
