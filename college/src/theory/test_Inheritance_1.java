package theory;

// 상속 
class Car {
	int velocity = 0;
	void IncAcel() {++velocity;}
	void DecAcel() {--velocity;}
	
	int getVelocity () {return velocity;}
}


public class test_Inheritance_1 {

	public static void main(String[] args) {

		Car obj = new Car();
		obj.IncAcel();
		obj.IncAcel();
		System.out.println(obj.getVelocity());
		
		obj.DecAcel();
		System.out.println(obj.getVelocity());
		
		obj.velocity = 100;
		System.out.println(obj.getVelocity());
		
	}
}
