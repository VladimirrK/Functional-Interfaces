import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.sql.SQLOutput;
import java.util.Date;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        Predicate<Integer> predicate1 = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                if (integer < 0) {
                    return false;
                }
                return true;
            }
        };

        Predicate<Integer> predicate2 = x -> x > 0;

        System.out.println(predicate1.test(-5));
        System.out.println(predicate1.test(5));


        Consumer<String> consumer1 = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("Привет " + s + "!");
            }
        };

        Consumer<String> consumer2 = s -> System.out.println("Привет " + s + "!");

        consumer2.accept("Владимир");
        consumer1.accept("Иван");


        Function<Double, Long> function1 = new Function<Double, Long>() {
            @Override
            public Long apply(Double aDouble) {
                return Math.round(aDouble);
            }
        };


        Function<Double, Long> function2 = Math::round;


        Supplier<Integer> supplier1 = new Supplier<Integer>() {
            @Override
            public Integer get() {
                return (int) Math.random() * 100;
            }
        };

        Supplier<Integer> supplier2 = () -> (int) Math.random() * 100;
    }
}