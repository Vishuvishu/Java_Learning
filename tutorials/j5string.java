import java.util.*;

public class j5string {

    public static void main(String[] args) {

        // why strings are immutable
        

        

        char str1[] = { '1', '2', '3' };
        String str2 = "123";
        String str4 = new String("123");

        System.out.println(str4 == str2); // false
        System.out.println(str4.equals(str2)); // true

        StringBuffer sbfr = new StringBuffer("hello world");
        StringBuilder str5 = new StringBuilder("shiv");
        System.out.println(sbfr);
        sbfr.append(123);
        System.out.println(sbfr);
        sbfr.delete(0, 2);// 0 to 2 -> 0,1
        System.out.println(sbfr);
        sbfr.insert(1, 'a');
        System.out.println(sbfr);
        StringBuffer sbfr1 = new StringBuffer("lalo world123");

        System.out.println(sbfr1.equals(sbfr));

    }

}
