import java.util.function.BinaryOperator;
//BinaryOperator represents an operation upon two operands
// of the same type, producing a result of the same type.

public class TryingBinaryOperator {
    public static void main(String[] args) {
        BinaryOperator<Integer> op
                = BinaryOperator.minBy((a,b)->(a>b?1:(a==b)?0:-1));
        System.out.println(op.apply(2,5));

        BinaryOperator <Integer> op2 = ((c,d)->c*d);
        System.out.println(op2.apply(2,5));

        BinaryOperator<String> op3 = ((d,f)->d.toUpperCase().concat(f.toUpperCase()));
        System.out.println(op3.apply("cat","dog"));

    }

}
