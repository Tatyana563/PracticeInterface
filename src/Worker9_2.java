import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Worker9_2 {
    String name;
    int age;

    public Worker9_2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Worker9_2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        List<Worker9_2> list = new ArrayList<>();
        Worker9_2 w1 = new Worker9_2("Tom",20);
        Worker9_2 w2 = new Worker9_2("Jack",25);
        Worker9_2 w3 = new Worker9_2("Mary",28);
        Worker9_2 w4 = new Worker9_2("Kira",27);
        Collections.addAll(list,w1,w2,w3,w4);
        Filter filter1 = new Filter(25,"M");
       w1.FilterPredicate(filter1,list);

    }
    public  List<Worker9_2> FilterPredicate(Predicate<Worker9_2> pr, Collection<Worker9_2> c){
List<Worker9_2> result = new ArrayList<>();
        for(Worker9_2 temp:c){
    if(pr.test(temp)==true){
     result.add(temp);
    }
        }
        System.out.println(result);
        return result;
    }
}
class Filter implements Predicate<Worker9_2>{
    List<Worker9_2> result = new ArrayList<>();
    int number;
    String letter;

    public Filter(int number, String letter) {
        this.number = number;
        this.letter = letter;
    }

    @Override
    public boolean test(Worker9_2 worker9_2) {
        return worker9_2.name.startsWith(letter.toUpperCase())||(worker9_2.name.startsWith(letter.toLowerCase())
                &&(worker9_2.age>number));
    }
}