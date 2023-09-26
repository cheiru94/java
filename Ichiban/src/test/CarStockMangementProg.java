/* 중고차 재고관리 프로그램 */
package test;

import java.util.Scanner;


/* 1. interface Stock */

	//모든 자동차 객체를 관리
	interface Stock {
	
		// 차량의 ID 값 출력 => 차량이 리스트에 저장 될때 1씩 증가
		public abstract int getID();
	
		// SEDAN , SUV 구분
		public abstract String getType(String argType);
	
		// 제품명 리턴
		public abstract String getproductName(String argName);
	
		// 제품 가격 리턴
		public abstract String getProductPrice(int argPrice);
	
		// 제품 색상 값 리턴
		public abstract String getProductColor(String argColor);
	}	

	
/* 2. class Cars */

	class insertCar implements Stock {
		
		final int FOUR = 4;
		int id;
		String Type;
		String Name;
		String Price;
		String Color;
		
		
		// 차량의 ID 값 출력
		public int getID() {
			id = StockMngr.index ;
			return id ;
		}
	
		// SEDAN , SUV 구분
		public String getType(String argType) {
			Type = argType;
			return Type;
		}
	
		// 제품명 리턴
		public String getproductName(String argName) {
			Name = argName;
			return Name;
		}
	
		// 제품 가격 리턴
		public String getProductPrice(int argPrice) {
			Price = argPrice+"";
			return Price;
		}
	
		// 제품 색상 값 리턴
		public String getProductColor(String argColor) {
			Color = argColor;
			return Color;
		}
	
	}


/* 3. class StockMngr */

	// 저장 및 출력
	class StockMngr extends insertCar {
	
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
					stockList[index] = new insertCar();
					String letter = scan.toString();
					
					System.out.println("1. 자동차 입력");
					String getTypeLetter = scan.toString();
					this.getType(getTypeLetter);

					
				}
			// 2. 전체 자동차 목록 출력 : 입력 순서로 출력
				else if ( selectedNum == 2 ) {
					System.out.println("ID :"+stockList[index++].getID());
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

public class CarStockMangementProg {
	
	public static void main(String[] args) {

		StockMngr myStock = new StockMngr(10);

	}

}
