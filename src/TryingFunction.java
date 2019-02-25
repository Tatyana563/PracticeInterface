import java.util.function.Function;

public class TryingFunction {
    // Function which takes in a number and
    // returns half of it

    public static void main(String[] args) {
Function<Integer, Double> modify = (m->m/2.0);
        // Now treble the output of half function
modify = modify.andThen(m->m*3);
        System.out.println(modify.apply(10));
    }
}
