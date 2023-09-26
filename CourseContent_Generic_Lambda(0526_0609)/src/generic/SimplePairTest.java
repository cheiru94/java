package generic;


// 🟢 제네릭 클래스
class SimplePair<T> {
  private T data1;
  private T data2;

  public SimplePair (T data1,T data2){
    this.data1 = data1;
    this.data2 = data2;
  }
  public T getFirst(){ return data1;}
  public T getSecond(){ return data2;}

  public void setFirst(T data1){ this.data1 = data1;}
  public void setSecond(T data2){this.data1 = data2;}
}


public class SimplePairTest {
  public static void main(String[] args) {
    SimplePair<String> pair = new SimplePair<String>("ICHIBAN","BETTY");
    System.out.println(pair.getFirst());
    System.out.println(pair.getSecond());
  }
}
