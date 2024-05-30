public class j4_method {

    static void voidmethod() {
        System.out.println("void method");
    }

    static void para(int a) {
        System.out.println("parameter: " + a);
    }

    static String returnt() {
        return "hello";
    }

    public static void main(String[] args) {
        voidmethod();
        j4_method.voidmethod();

        para(2);

        System.out.println(returnt());
    }
}