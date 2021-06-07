import java.util.stream.IntStream;

public class IntStreamExample {
    public static void main(String[] args) {
        IntStream.range(0,1000)
                .filter(i->i%7==0).limit(3).forEach(e->System.out.println("I am" + e));
    }
}
