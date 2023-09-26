package playing;
// 2001483 이주현
import java.util.Scanner;

public class T4 {
    public static void main(String[] args) {
        GpaSystem gpa = new GpaSystem();

        gpa.run();
    }
}

class GpaSystem {
    boolean isEnded = false;
    final int NUM_OF_STUDENT = 10;

    double totalAvg;

    Scanner sc = new Scanner(System.in);

    Student[] students;

    public GpaSystem() {
        students = new Student[NUM_OF_STUDENT];
    }

    void run() {
        while (true) {
            if (isEnded) { return; }     // 종료 flag 세워져 있으면? 탈출

            printMenu();
            selectMenu();
        }
    }


    void calculateTotalAvg() {
        double total = 0;
        for (int i = 0; i < Student.seqNum; i++) {
            Student student = students[i];
            total += student.getAvg();
        }

        totalAvg = total / Student.seqNum;
    }


    void printMenu() {
        String msg = String.format("""
                ================================
                  1. 학생 성적 입력
                  2. 학생 목록 출력(입력 순)
                  3. 프로그램 종료
                 
                 현 입력데이터 갯수\t: %d
                 전체 학생 평균 값\t: %.2f
                ================================""", Student.seqNum, totalAvg);
        System.out.println(msg);
    }

    void selectMenu() {
        int choice = sc.nextInt();

        switch (choice) {
            case 1 -> addStudent();           // 새로운 학생정보 생성
            case 2 -> printAll();             // 모든 레코드 조회
            case 3 -> isEnded = true;
            default -> System.out.println("다시 입력하십시오.");    // 1, 2, 3 이외의 값이면
        }

    }

    void addStudent() {
        System.out.println("학번을 입력하세요.");
        int id = sc.nextInt();
        sc.nextLine();          // nextInt()로 인해 버퍼에 개행문자가 남아 있음으로 버퍼처리.

        System.out.println("이름을 입력하세요.");
        String name = sc.nextLine();

        System.out.println("국어 성적을 입력하세요.");
        int scoreKor = sc.nextInt();

        System.out.println("영어 성적을 입력하세요.");
        int scoreEng = sc.nextInt();

        System.out.println("수학 성적을 입력하세요.");
        int scoreMat = sc.nextInt();

        // 학생 생성
        Student std = new Student(id, name, scoreKor, scoreEng, scoreMat);

        students[Student.seqNum-1] = std;

        calculateTotalAvg();
    }

    void printAll() {
        for (int i = 0; i < Student.seqNum; i++){
            Student student = students[i];

            String msg = String.format(
                    "id: %d, name: %s, kor: %d, eng: %d, mat: %d, sum: %d, avg: %.2f",
                    student.id, student.name, student.scoreKor, student.scoreEng, student.scoreMat, student.getSum(), student.getAvg()
            );
            System.out.println(msg);
        }
    }

}
class Student {
    final int NUM_OF_SUBJECT = 3;

    /*
        추가만 하는 프로그램이면 상관이 없지만,
        학생 레코드를 삭제하는 기능이 들어가 있으면
        아래 변수를 이용하는 함수가 정상적으로 동작하지 않을 수 있다.
     */
    // 입력순서를 위해 static 변수로 선언
    static int seqNum;

    // 일단 각 학생마다 속성으로,
    // 이름, 학번, 국어, 영어, 수학, 총점, 평균, 입력순서가 있음으로
    // 다음과 같이 정의한다.
    int id;             // 학번
    String name;        // 이름
    int seq;            // 입력순서
    int scoreKor;       // 국어
    int scoreEng;       // 영어
    int scoreMat;       // 수학

    Student(int argId, String argName) {
        seqNum++;
        seq = seqNum;
        id = argId;
        name = argName;
    }

    Student(int argId, String argName, int argScoreKor, int argScoreEng, int argScoreMat) {
        this(argId, argName);
        scoreKor = argScoreKor;
        scoreEng = argScoreEng;
        scoreMat = argScoreMat;
    }

    int getSum() {
        return scoreKor + scoreEng + scoreMat;
    }

    double getAvg() {
        return (double) getSum() / NUM_OF_SUBJECT;
    }

}
