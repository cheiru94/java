package theory;

interface Engine {
	public abstract void startEngine();
	public abstract void stopEngine();
}

// implements : 구현하다 
class Car1 implements Engine_2{   // 추상메서드는 구현부가 없어서 implements 를 사용
	public void startEngine() {
		System.out.println("엔진 스타트");
	}
	
	public void stopEngine() {
		System.out.println("엔진 stop");
	}
}


public class Interface_1 {

	public static void main(String[] args) {
		
		Car1 obj1= new Car1();
		
		obj1.startEngine();
		obj1.stopEngine();
		
	}

}