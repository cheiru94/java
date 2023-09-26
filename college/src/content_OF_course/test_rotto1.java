package content_OF_course;

public class test_rotto1 {
	public static void main(String[] args) {
		// 로또 번호 생성 프로그램 작성
		// 1 ~ 45 중복되지 않는 정수 6개 랜덤으로 선택
		// 정수 6개는 배열에 저장.

		// 배열 생성
		int rotto[] = new int[6];

		// for_1 - 총 인덱스 6개에를 하나씩 => [0] [1] [2] [3] [4] [5] = 6개
	/* 1 */ for (int index = 0; index < rotto.length; index++) {

			// 랜덤 생성
			int ransu = (int) (Math.random() * 10) + 1 + 35; // 0 ~ 1 미만 0.999999

			// 1) 첫 번재 난수 값  rotto[0] 에 바로 대입
			if (index == 0) {
				rotto[0] = ransu;
			}
/*******************************************************************************/
			// 2) index >= 1 이면   // index 1부터 시작 
			else {
				// for_2 - for_1 보다 작은 범위까지 돌려서 안의 내용 확인
		/* 2 */ for (int inner = 0; inner < index; inner++) {

					// 1. 값 중복
					if (rotto[inner] == ransu) {
						index -= 1; // 임의로 index 값 조정
						break;

						// 2. 값 중복 안함
					} else {
						rotto[index] = ransu;
					}
				}
			}
		}

		// 출력
		System.out.println("나눔\nLotto 6/45 \n"+ "대박나세요~!");
		System.out.println("------------------------------------------");
		for (int i = 0; i < rotto.length; i++) {
			System.out.print(rotto[i]+"\t");
		}

		
//---------------------------------------------------------------------------------------
	}
}
