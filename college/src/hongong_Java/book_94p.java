package hongong_Java;

public class book_94p {

	public static void main(String[] args)throws Exception {
		int code;
		
		while (true) {
			code = System.in.read();
			System.out.println("code: " + code);
			
			//사용자가 q 를 입력 했을 때 반복이 중지되게 
			if (code == 113) {
				break;
			}
		}
		System.out.println("프로그램 종료");
	}

}
