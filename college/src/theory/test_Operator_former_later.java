package theory;

public class test_Operator_former_later {
    public test_Operator_former_later() {
        int param = 20;
        int result = 0;

        result = --param;
        System.out.println("result: " + result + ", param: " + param);

        result = param--;
        System.out.println("result: " + result + ", param: " + param);
    }
}
