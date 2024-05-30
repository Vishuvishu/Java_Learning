//naming convetion
//Clas and Inteface first char CAPITAL
//variable name first character small
// Methodname first charater small
// PAkcage name first character small -> java, jakarta, spring
// Contantas shpuld be upper case  -> PIE, CONST

//type casting
//down cating (data losee) double->float->int->char->short0->byte
//up cating (nodata loss) vyte->short->char->int->float->double

import java.text.SimpleDateFormat;
import java.util.Date;

class j2datatype {

    public static void main(String Args[]) {

        System.out.println(new Date());
        SimpleDateFormat ft = new SimpleDateFormat("dd-MM-yyyy");// make sure that mm is CAPITAL
        String str = ft.format(new Date());
        System.out.println("formatted date is " + str);
        int c12 = 2;

        int arr[] = { 1, 2, 3, 4 };
        int[] arr1 = { 1, 2 };
        int arr3[] = new int[3];
        arr3[0] = 1;
        arr3[1] = 2;

        // print(chararr)->print as spring
        // print(intarr)->print address or not print

        int arr2[][] = { { 1, 2 }, { 1, 2 } };
        System.out.println(arr);

        for (int e : arr) {
            System.out.println(e);
        }

        switch (c12) {
            case 1:
                System.out.println("hello");
                break;
            case 2:
                System.out.println("hello");
                break;
            case 3:
                System.out.println("hello");
                break;

        }

        float f1 = 12.12f;
        double f2 = f1;
        System.out.println(f2);// 12.11999999524

        int a = 2;
        String b = String.valueOf(a);
        // System.out.println(a + a);
        System.out.println(b + b);

        String a1 = "10";
        int b1 = Integer.parseInt(a1);
        System.out.println(b1 + b1);

        float a2 = Float.parseFloat(a1);
    }
}
