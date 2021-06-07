import java.util.ArrayList;
import java.util.List;

public class Exe0406 {
    public static void main(String[] arg) {


        int max = 1000; int divisor = 7; int limit = 3;
        int a = max; int b = 0;
        int i = limit;
        String printNum = null;
        int c = 1;
    while (a > 0 & i > 0) {
        b = a%divisor;
        if (b==0) {
            printNum = "I am " + (a + 2);
            System.out.println(printNum);
            i--;
        }
        a--;
        }
    }
}
