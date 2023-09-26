/* 중고차 재고관리 프로그램 */
package test2;

import java.util.Scanner;


/* 1. interface Stock */

	//모든 자동차 객체를 관리
	interface Stock {
	
		// 차량의 ID 값 출력 => 차량이 리스트에 저장 될때 1씩 증가
		public abstract int getID();
	
		// SEDAN , SUV 구분
		public abstract String getType();
	
		// 제품명 리턴
		public abstract String getproductName();
	
		// 제품 가격 리턴
		public abstract int getProductPrice();
	
		// 제품 색상 값 리턴
		public abstract String getProductColor();
		
	}	

	
/* 2. class Cars */

	class Car implements Stock {
		
		final int FOUR = 4;
		int id;
		String Type;
		String Name;
		int Price;
		String Color;
		
		public Car(int argId, String argType, String argName, String argColor, int argPrice) {
			id = argId;
			Type = argType;
			Name = argName;
			Price = argPrice; 
			Color = argColor;
		}
		
		// 차량의 ID 값 출력
		public int getID() {
			return this.id;
		}
	
		// SEDAN , SUV 구분
		public String getType() {
			return this.Type;
		}
	
		// 제품명 리턴
		public String getproductName() {
			return this.Name;
		}
	
		// 제품 가격 리턴
		public int getProductPrice() {
			return this.Price;
		}
	
		// 제품 색상 값 리턴
		public String getProductColor() {
			return this.Color;
		}
		
		
	
	}


/* 3. class StockMngr */

	// 저장 및 출력
	class StockMngr {
	
		// 중고차 저장 리스트
		Stock[] stockList;
	
		// 배열의 index
		static int index;
	
		//스캐너
		Scanner scan = new Scanner(System.in);
		
		// 초기화 블록
		{
			System.out.println("1. 자동차 입력");
			System.out.println("2. 전체 자동차 목록 출력 : 입력 순서로 출력");
			System.out.println("3. SUV 자동차 목록 출력");
			System.out.println("4. Sedan 자동차 목록 출력");
			System.out.println("5. 프로그램 종료");
		}

	
		// 배열 생성 ( 생성자 )
		public StockMngr(int argStockBucketSize) {

			// 중고차 저장 리스트                                            ※ argStockBucketSize = 10                   
			stockList = new Stock[argStockBucketSize]; // 	StockMngr myStock = new StockMngr(10);
			
			
		// 무한 반복 
			while (true) {
				
			// ※ 사용자로 부터 메뉴 선택 받기 ※
				int selectedNum = scan.nextInt();
				
//			// 새로운 객체 생성
//				Stock obj = new insertCar();
	
			
			// 1. 자동차 입력
				if ( selectedNum == 1 ) {
					
					// 새로운 객체 생성 - 생성된 객체를 배열에 저장	
					stockList[index] = new Car(index, "SUV", "GV80", "BLUE", 10_000);
					
					

					// ★★★★★★★★★ 각각의 값들 입력 받기 ★★★★★★★★★★
//					for (int i = 0; i < FOUR; i++) {
//						
//					}
//					String letter = scan.toString();
					
				
					
					
					stockList[index++].getID();

					
				}
			// 2. 전체 자동차 목록 출력 : 입력 순서로 출력
				else if ( selectedNum == 2 ) {
					System.out.println(stockList[0].getID());
					System.out.println(stockList[0].getType());
					System.out.println(stockList[0].getproductName());
					System.out.println(stockList[0].getProductColor());
					System.out.println(stockList[0].getProductPrice());
				}
			// 3. SUV 자동차 목록 출력
				else if ( selectedNum == 3 ) {
					
				}
			// 4. Sedan 자동차 목록 출력
				else if ( selectedNum == 4 ) {
					
				}
			// 5. 프로그램 종료
				else if ( selectedNum == 5 ) {
				System.out.println("※ 프로그램 종료 ※");
					return ; // 종료
			// 6. 예외 처리		
				}else {
					System.out.println("1 ~ 5 사이의 숫자를 입력하세요");
				}
				
			}		
			
		} /*생성자 끝*/
	
	// 중고차 리스트에 저장, 반환값은 현재 저장된 중고차 대수 >> 자료형 : 리스트
		int insertStock(Stock argStock) {
			return 0;
		}
	
	// 차량 리스트 출력 : 아래 양식으로 출력
		void printStockList() {
			// 1. ID : 1 차종 : SUV, 차명 : SORENTO, 가격 : 20,000, 색깔 :BLUE
			// 2. ID : 2 차종 : SEDAN, 차명 : G90, 가격 : 70,000, 색깔 :YELLOW
		}
	
	// 조건에 맞는 차량 리스트 출력
		void printStockList(String argType) {
			// argType은 SUV 또는 SEDAN -> SUV일 경우 SUV만 출력
		}
	}

public class CarStockMangementProg2 {
	
	public static void main(String[] args) {

		StockMngr myStock = new StockMngr(10);

	}

}
