import java.util.Arrays;
import java.util.function.BiConsumer;

public class TryingBiConsumer {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,7};
        int[] arr2 = {1,2,3,4,5};
        BiConsumer<int[], int[]> equals =
                (m1,m2)->{
            if(m1.length!=m2.length){
                System.out.println("Different length"); }
                else {
                    for(int i=0;i<m1.length;i++){
                        if(m1[i]!=m2[i]){
                            System.out.println("Different elements");
                            return;
                        }
                    }
                System.out.println("The same elements");
                System.out.println(Arrays.toString(m1));
            }

                };
        equals.accept(arr1,arr2);

                }
    }

