package content_OF_course;

public class test_rotto2 {

	public static void main(String[] args) {

		/* 2201392_이재일 */

		// 로또 번호 생성 프로그램 작성
		// 1 ~ 45 중복되지 않는 정수 6개 랜덤으로 선택
		// 정수 6개는 배열에 저장.

		// 배열 생성
		int rotto[] = new int[6];

// 1) for_1 - 총 인덱스 6개에를 하나씩 => [0] [1] [2] [3] [4] [5] = 6개
		/* 1 */ for (int index_1 = 0; index_1 < rotto.length; index_1++) {

			// 랜덤 생성
			int ransu = (int) (Math.random() * 45) + 1; // 0 ~ 1 미만 0.999999

			// 1.1) rotto[0]인 경우
			if (index_1 == 0) {
				rotto[0] = ransu;
			}

			// 1.2) rotto[1]이상 인 경우
			else {

// 2) for_2 - for_1 보다 작은 범위까지 돌려서 안의 내용 확인
				/* 2 */ for (int index_2 = 0; index_2 < index_1; index_2++) {

					// 2.1) 값 중복
					if (rotto[index_2] == ransu) {
						index_1 -= 1; // 임의로 index 값 조정
						break;
					}

					// 2.2) 값 중복 안함
					rotto[index_1] = ransu;
				}
			}
		}

		// ※ 출력 ※
		System.out.println("나눔\nLotto 6/45 \n" + "대박나세요~!");
		System.out.println("------------------------------------------");
		for (int i = 0; i < rotto.length; i++) {
			System.out.print(rotto[i] + "\t");
		}

	}

}
