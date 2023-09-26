package theory;

import java.util.Scanner;

//  public class 명은 무조건 파일이름!!! 
public class How_to_use_Class {

	// 안에는 메인메소드가 들어가야한다 !! (반드시는 아님xxx)
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		Student stdList[] = new Student[2];

		for (int i = 0; i < stdList.length; i++) {
			stdList[i] = new Student(scn.next(), scn.nextInt(), scn.nextInt());
		}

		for (int i = 0; i < stdList.length; i++)
			System.out.println(stdList[i]);
	}

}

// Student Class를 선언
class Student {
	// <<-- Member variable
	String stdName;

	int subKorean;
	int subMath;

	int sum; // -->>

	// Constructor : 생성자
	Student(String argName, int argKorean, int argMath) {
		stdName = argName;
		subKorean = argKorean;
		subMath = argMath;
	}	

	// Member method
	int getSum() {
		return subKorean + subMath;
	}

	// 내부적으로 만들어져 있는 것을 고쳐 쓴다
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return stdName + "\t" + sum;
	}
}
