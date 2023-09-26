package theory;

public class How_to_use_Random_not_duplicated {

	public static void main(String[] args) {
		
		
		int random[] = new int[3];

		int randomValue = (int) (Math.random() * 9 + 1);
		
		// 중심이 되는 반복문 
		for (int i = 0; i < random.length; i++) {

			// 범위를 이렇게 함으로써 비교 범위를 서서히 늘림
			for (int j = 0; j < i; j++) {

				if (random[j] == randomValue) {

					randomValue = (int) (Math.random() * 9 + 1);
					j = -1;  // 후위 형 이기 때문에 디폴트 값으로 지정 해줘야 한다	
				}
			}
			random[i] = randomValue;
		}
	}

}
