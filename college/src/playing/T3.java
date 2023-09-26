package playing;
// 2201413 정훈희

import java.util.Scanner;

class Student_Info {
    // 인스턴스 멤버 변수
    int stdNum;
    String stdName;
    int stdKor;
    int stdEng;
    int stdMath;
    int stdSum;
    float stdAvg;

    // 생성자
    // 입력 값 : 학번, 이름, 국어, 영어, 수학 에 대해서 매개변수로 받음
    Student_Info(int argNum, String argName, int argKor, int argEng, int argMath) {
        stdNum = argNum;
        stdName = argName;
        stdKor = argKor;
        stdEng = argEng;
        stdMath = argMath;
    }

    // 인스턴스 멤버 메서드
    int getStdSum() {
        stdSum = stdKor + stdEng + stdMath;
        return stdSum; // 입력 값에 대해 합계 리턴
    }

    float getStdAvg() {
        stdAvg = getStdSum() / (float) Manager.NUM_OF_SUBJECT;
        return stdAvg; // 클래스 멤버 변수에 접근하여 평균 리턴
    }
}

class Manager {
    Scanner scan;
    // 클래스 멤버 변수
    static final int NUM_OF_SUBJECT = 3;
    // 인스턴스 멤버 변수
    final int NUM_OF_STUDENT = 10;
    int menuNum;
    Student_Info[] stdArray; // 각 객체의 참조 변수를 저장할 배열 선언
    int seqNum;
    int allStdSum;
    float allStdAvg;
    boolean flag;

    // 생성자
    Manager() {
        scan = new Scanner(System.in);
        menuNum = 0;
        stdArray = new Student_Info[NUM_OF_STUDENT];
        seqNum = 0;
        allStdSum = 0;
        allStdAvg = 0;
        flag = true;
    }

    // 인스턴스 멤버 메서드
    void run() {
        while (flag) {
            prtMenu();
            chooseMenu();
        }
    }

    void prtMenu() {
        System.out.println("===========================");
        System.out.println("1. 학생 성적 입력");
        System.out.println("2. 학생 목록 출력");
        System.out.println("3. 프로그램 종료");

        System.out.println();
        System.out.println("입력 데이터 개수 : " + seqNum);
        System.out.println("전체 학생 평균 값 : " + allStdAvg);
        System.out.println("===========================");

        menuNum = scan.nextInt();
    }

    void chooseMenu() {
        switch (menuNum) {
            case 1 :
                insertValue();
                break;
            case 2 :
                showValue();
                break;
            case 3 :
                terminatePrg();
                break;
        }
    }

    void insertValue() {
        // 지역 변수
        System.out.println("학번을 입력하세요");
        int inputNum = scan.nextInt();
        System.out.println("이름을 입력하세요");
        String inputName = scan.next();
        System.out.println("국어 성적을 입력하세요");
        int inputKor = scan.nextInt();
        System.out.println("영어 성적을 입력하세요");
        int inputEng = scan.nextInt();
        System.out.println("수학 성적을 입력하세요");
        int inputMath = scan.nextInt();

        stdArray[seqNum] = new Student_Info(inputNum, inputName, inputKor, inputEng, inputMath); // 입력 받은 값을 인자로 가짐
        seqNum++;
        allStdSum += (inputKor + inputEng + inputMath);
        allStdAvg = allStdSum / (float) (NUM_OF_SUBJECT * seqNum);
    }

    void showValue() {
        for (int index = 0 ; index < seqNum ; index++) {
            System.out.println("[ id : " + stdArray[index].stdNum +
                    " name : " + stdArray[index].stdName +
                    " Kor : " + stdArray[index].stdKor +
                    " Eng : " + stdArray[index].stdEng +
                    " Math : " + stdArray[index].stdMath +
                    " Sum : " + stdArray[index].getStdSum() +
                    " Avg : " + stdArray[index].getStdAvg() + " ]"
            );
        }
    }

    void terminatePrg() {
        System.out.println("프로그램 종료");
        flag = false;
    }
}

public class T3 {
    public static void main(String args[]) {
        (new Manager()).run();
    }
}