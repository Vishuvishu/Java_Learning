import java.util.*;
//scanning method\

//gui
//cmd
//scanner class
//buffer reader class
//gui

//imp
// scan.next().charAt(0)
//scan.nextLine() //string
//scan.next till space
public class j3_scann {
    public static void main(String[] args) {
        // int a = 2;
        // System.out.println(args[1]);
        // to tun java hello3.java 12 13 14
        // if java hello3.java 12,13 14 than 0 -> 12,13 ,1->14

        Scanner scan = new Scanner(System.in);
        System.out.println("enter value");
        int b = scan.nextInt();
        System.out.println(b);
        // after int for scanning other var we need to scan nextline
        scan.nextLine();
        // if onyl scan.next than scan hello world hello in next and world in nextline
        String str = scan.nextLine();
        System.out.println(str);

        char c = scan.next().charAt(0);
        System.out.println(c);

        // imp//imp//imp//imp//imp//imp//imp//imp//imp//imp//
        System.out.printf("%d", "2");
        int a12 = (1 == 1) ? 2 : 3;
        System.out.println(a12);
    }
}
