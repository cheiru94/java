package theory;

interface Engine_2 {
	public abstract void startEngine();
	public abstract void stopEngine();
}

	class Car_2 implements Engine_2 {
		public void startEngine() {
			System.out.println("카 엔진 스타트");
		}
		
		public void stopEngine() {
			System.out.println("카 엔진 스톱");
		}
	}
	
	class Bike implements Engine_2 {
		public void startEngine() {
			System.out.println("바이크 엔진 스타트");
		}
		
		public void stopEngine() {
			System.out.println("바이크 엔진 스톱");
		}
	}


public class Interface_2 {

	public static void main(String[] args) {
		
		Engine_2 obj1 = new Car_2();    // 다형성 적용?
		Engine_2 obj2 = new Bike();		
		obj1.startEngine();
		obj1.stopEngine();
		obj2.startEngine();
		obj2.stopEngine();
	}

}
