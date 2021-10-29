package operators;

public class OperatorsMain {
    public static void main(String[] args) {

        System.out.println(Integer.toBinaryString(8));
        Operators operators = new Operators();

        System.out.println(operators.isEven(5));
        System.out.println(operators.isEven(6));

        System.out.println(operators.getResultOfDivision(16,3));

        System.out.println(operators.isNull("null"));
        System.out.println(operators.isNull(null));

        System.out.println(operators.isEmpty(null));
        System.out.println(operators.isEmpty(""));
        System.out.println(operators.isEmpty("aaa"));


    }
}
