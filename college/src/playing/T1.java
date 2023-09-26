package playing;
// 제작 : 1-J1 2201363 석진석
import java.util.Scanner;

class StudentInfo{
   // 학생 정보를 "저장"하는 클래스
   static int seqNum; // 입력 순서
   //----------------------- 1번 메소드
   int id; // 학번
   String name; // 학생의 이름
   //----------------------- 2번 메소드
   int scoreKor;     // 국어 성적
   int scoreEng;     // 영어 성적
   int scoreMath;   // 수학 성적
   int sum;         // 합계
   float avg;         // 평균
   
   StudentInfo(int argId, String argName){ // 학생의 학번과 이름을 저장하겠다
      id = argId;
      name = argName;
   }
   
   void setScore(int argKor, int argMath, int argEng) { 
      // 점수를 지정
      scoreKor = argKor;
      scoreMath = argMath;
      scoreEng = argEng;
      sum =   scoreKor + scoreMath + scoreEng; // 합계를 구함
      avg = sum / (float)GpaManager.NUM_OF_SUBJECT; // 평균을 구함
   }
}

class GpaManager{ // 학생 정보를 "가공"
   Scanner scn = new Scanner(System.in);
   static final int NUM_OF_SUBJECT= 3; // 과목의 수
   float allStdAvg = 0.0f;
   int allStdSum = 0;
   final int NUM_OF_STUDENT= 10;
   boolean play = true;
   //-------------------------------------------------
   StudentInfo stdList[];  // 주소값을 저장하는 배열
   
   GpaManager() {
      
      stdList = new StudentInfo[NUM_OF_STUDENT];
      // Student 클래스 객체를 가리키는 참조변수 10개
      // 참조 변수를 10개를 찍으므로 각각의 stdList를 만들어야한다
   }
   
   void run() {  // 프로그램이 시작된다. 라는 것을 명시합니다.
      while(play) {   // 언제 이 프로그램이 끝날지 모르니, while을 쓰도록 합시다
         printMenu();
         int playNum = scn.nextInt();
         InputValueProcess(playNum); // 입력값에 따른 실행문
      }
   }


   void printMenu() { // 메뉴판 출력
      System.out.println("=================================");
      System.out.println("1. 학생 성적 입력");
      System.out.println("2. 학생 목록 출력(입력 순)");
      System.out.println("3. 프로그램 종료");
      System.out.println("=================================");
      System.out.println("");
      System.out.println("현 입력데이터 갯수 : " + StudentInfo.seqNum);
      // 현재 입력하고 있는 학생의 SeqNum, indexNum을 의미한다
      System.out.println("전체 학생 평균 값 : " + allStdAvg);
   }
   
   void InputValueProcess(int argNum){
      // 입력값을 토대로 실행되는 문장
      switch(argNum) {
         case 1:
            InsertStdInfo();
            break;
         case 2:
            ShowStdInfo();
            break;
         case 3:
            play = false;
            break;
      }
   }
   
   void InsertStdInfo() {
      System.out.println("학번을 입력하세요 : ");
      int StdNum = scn.nextInt();
      System.out.println("이름을 입력하세요 : ");
      String StdName = scn.next();
      
      stdList[StudentInfo.seqNum] = new StudentInfo(StdNum, StdName);
      // n번째 stdList에 학번과 이름을 저장한다
      
      System.out.println("국어 성적을 입력하세요 : ");
      int StdKor = scn.nextInt();
      System.out.println("영어 성적을 입력하세요 : ");
      int StdEng = scn.nextInt();
      System.out.println("수학 성적을 입력하세요 : ");
      int StdMath = scn.nextInt();
      
      stdList[StudentInfo.seqNum].setScore(StdKor, StdEng, StdMath);
      // n번째 StudentInfo에 들어있는 변수에 값을 저장하고 sum과 avg 마저 계산한다
      
      allStdSum = allStdSum + stdList[StudentInfo.seqNum].sum;
      allStdAvg = allStdSum / (NUM_OF_SUBJECT * (StudentInfo.seqNum+1));
      // 전체 평균은 전체 학생의 성적 / (과목수 * 학생수) 이므로 해당 구문과 같이 구현한다
      
      StudentInfo.seqNum++;  // 학생 입력 순서 값 증가
   }

   void ShowStdInfo() {
      for(int i = 0; i < StudentInfo.seqNum; i++) {
         // 0번째부터 seqNum번째, 즉 입력한 갯수만큼 출력하게 돕는 구문이다.
         System.out.println("[ id : "+stdList[i].id+" name : "
      + stdList[i].name+" kor : "+stdList[i].scoreKor+" math : "+stdList[i].scoreMath+
      " eng : "+stdList[i].scoreEng + " sum : "+stdList[i].sum + " avg : " + stdList[i].avg+" ]");
      }
   }
}

public class T1 {
   public static void main(String[] args) {
      new GpaManager().run();        // 발사대 역할, 실행만 넣기
      System.out.println("프로그램 종료");
   }
}