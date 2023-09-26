package theory;
//package test;
//abstract class Player_1 {
//    int number;
//    String name;
//
//    abstract void shoot() {   // 메서드 앞 추상화 => 미완성 메서드 이기 때문에 구현 부분이 없어야 한다
//										          // 자식들이 구현해야 하는 부분 ! 
////				System.out.println("기본 슈팅");
//    }
//
//    void pass() {
//
//    }
//
//}
//
//class Center_1 extends Player_1 {
//    @Override
//    void shoot() {
//        System.out.println("센터 슈팅");
//    }
//
//}
//
//class Forward_1 extends Player_1 //{  <-- abstract methods cannot have a body, must be implementated
//    @Override
//    
//    abstract void shoot() { 
////		System.out.println("기본 슈팅");
//	}
//    
//    void pass() {
//        super.pass();
//    }
//}
//
//class SJHoon extends Center_1 {
//    @Override
//    void shoot() {
//        System.out.println("서장훈 슈팅");
//    }
//}
//
//class Scratch {
//    public static void main(String[] args) {
////        Player p1 = new Player(); <-- cannot be instantiated
////        p1.shoot();
//
//        Player_1 p2 = new Center_1();
//        p2.shoot();
//
//    }
//}