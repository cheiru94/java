package theory;


//Singleton 

class R {
	
	static R myObj;  
	
	private R() { // 객체는 이렇게 찍지는 못 한다 !

	}
	
	static R getObject() {
		
		if(myObj == null)
			return myObj = new R();
		
		return myObj;
	}
	
	
}

public class test_Singleton {

	public static void main(String[] args) {

		//A obj = new A();
		
		R obj2 = R.getObject();
		
		R obj3 = R.getObject();
		
		System.out.println(obj2);
		System.out.println(obj3);
		
	}
}
