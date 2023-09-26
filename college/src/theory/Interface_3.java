package theory;

// 공통적인 INERFACE (Bracket)
interface EngineBracket {
	public abstract void startEngine();

	public abstract void stopEngine();
}

class BenzEngine implements EngineBracket {
	public void startEngine() {
		System.out.println("벤츠 엔진 스타트");
	}

	public void stopEngine() {
		System.out.println("벤츠 엔진 스톱");
	}
}

class G90 {
	EngineBracket myEngine; // 참조변수 공간을 선언만 한 것

	G90(EngineBracket argEngine) {
		myEngine = argEngine;
	}

	void start() {
		myEngine.startEngine();
	}

	void stop() {
		myEngine.stopEngine();
	}
}

public class Interface_3 {

	public static void main(String[] args) {

		G90 myCar = new G90(new BenzEngine());

		myCar.start();
		myCar.stop();

	}

}
