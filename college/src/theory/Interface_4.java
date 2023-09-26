package theory;

interface EngineBracket1{
	public void  enginStart();
	public void  enginStop();
}

class BmwEngine implements EngineBracket1 {
	public void enginStart(){
		System.out.println("bmw 엔진 start");
	}
	public void enginStop(){
		System.out.println("bmw 엔진 stop");
	}
}

class Nissan {
	
	EngineBracket1 myengine;
	
	Nissan (EngineBracket1 arg ){
		myengine = arg ;
	}
	void star() {
		myengine.enginStart();
	}
	public void stop(){
		myengine.enginStop();
	}
}

public class Interface_4 {

	public static void main(String[] args) {

		Nissan n1 = new Nissan(new BmwEngine());
		n1.star();
	
	}

}
