package theory;

public class test_switch_1 {

	public static void main(String[] args) {
		// 조건 1, 2, 3 개
		System.out.println("ランクを選んでください。 ");
		String choose = "notbed"; // 입력 변수
		String mozi = "kanpai";

		// switch 문
		switch (choose) {
		case "good":
			System.out.println("a");
			
		case "soso":
			System.out.println("b");
			
		case "notbed":
			System.out.println("c");
			
		case "bed":
			System.out.println("d");
			if (mozi == "kanpai") {
				System.out.println("七転び八起き");
				
			}
			break;
		case "what the ?":
			System.out.println("e");

		default:
			System.out.println("f");

		}

	}

}
