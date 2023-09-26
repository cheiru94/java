package playing;

import java.util.*;

//학생 정보 객체
class StdInfo{
   int id;
   String name;
   int scoreKor;
   int scoreEng;
   int scoreMeth;
   int sum;
   float avg;
   static int count;
   static int NUM_OF_STUDENT;
   
   StdInfo(){
      count++;
      NUM_OF_STUDENT = 3;
   }
   
   void setId(int argId) {
      id = argId;
   }
   void setName(String argName) {
      name = argName;
   }
   void setKor(int argKor) {
      scoreKor = argKor;
      sum += argKor;
   }
   void setEng(int argEng) {
      scoreEng = argEng;
      sum += argEng;
   }
   void setMeth(int argMeth) {
      scoreMeth = argMeth;
      sum += argMeth;
   }
   void set() {
      avg = sum / NUM_OF_STUDENT;
      
   }
}

class StdManage{
   final int Std_memser_num;
   StdInfo[] stdMember;
   Scanner scn;
   float allAvg;
   
   StdManage() {
      Std_memser_num = 10;
      scn = new Scanner(System.in);
      stdMember = new StdInfo[Std_memser_num];
   }
   
   
   //실행 매서드
   void run() {
      
      while(true) {
         print_manu();
         int inputNum = scn.nextInt();
         if(inputNum == 1) {
            inputStd();
         }
         else if(inputNum == 2) {
            printStdInfo();
         }
         else if(inputNum == 3) {
            end_text();
            break;
         }
      }
   }
   
   //매뉴 문구
   void print_manu() {
      System.out.println("=========================");
      System.out.println(" 1. 학생 성적 입력");
      System.out.println(" 2. 학생 목록 출력(입력 순)");
      System.out.println(" 3. 프로그램 종료\n");
      System.out.println("현 입력데이터 갯수 : " + StdInfo.count);
      System.out.println("전체 학생 평균 값 : " + allAvg);
      System.out.println("=========================");
   }
   
   //학생 정보 입력
   void inputStd() {
      StdInfo setStdInfo = new StdInfo();
      System.out.println("학번을 입력하세요.");
         setStdInfo.setId(scn.nextInt());
      System.out.println("이름을 입력하세요.");
         setStdInfo.setName(scn.next());
      System.out.println("국어 성적을 입력하세요.");
         setStdInfo.setKor(scn.nextInt());
      System.out.println("영어 성적을 입력하세요.");
         setStdInfo.setEng(scn.nextInt());
      System.out.println("수학 성적을 입력하세요.");
         setStdInfo.setMeth(scn.nextInt());
      setStdInfo.set();
      allAvg += setStdInfo.avg / StdInfo.count;
      
      stdMember[StdInfo.count-1] = setStdInfo;
   }
   
   //학생 목록 출력
   void printStdInfo() {
      for(int i = 0; i < StdInfo.count ; i++) {
         System.out.println("id : " + stdMember[i].id 
               + " name : "+ stdMember[i].name 
               + " kor : " + + stdMember[i].scoreKor 
               + " Eng : " + + stdMember[i].scoreEng 
               + " math : " + + stdMember[i].scoreMeth 
               +  " sum : " + + stdMember[i].sum 
               + " avg : " + + stdMember[i].avg);
      }
   }
   
   
   // 종료 문구
   void end_text() {
      System.out.println("프로그램 종료");
   }
}




//
public class T2 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
         StdManage std = new StdManage();
         std.run();
   }

}