import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

class MyException extends Exception {
    MyException(String message) {
        super(message);
    }
}

class pappu {
    static void daru(boolean isdaru) throws Exception {// throws jaruri nakar em ke ke unhandeled exception
        if (isdaru) {
            throw new MyException("drunk papu");
        }
    }
}

public class j7exception {

    public static void main(String[] args) {
        try {
            // System.out.println(1 / 0);
            pappu.daru(true);
        } catch (Exception e) {
            System.out.println("this is error" + e);
        }

        int[] arr = { 1, 2, 3 };

        // try {
        // // System.out.println(1 / 0);
        // // System.out.println(arr[3]);
        // FileReader fr = new FileReader("abc.txt");
        // BufferedReader br = new BufferedReader(fr);
        // String line;
        // while ((line = br.readLine()) != null) {
        // System.out.println(line);
        // }
        // }
        try (
                FileReader fr = new FileReader("tutorials/abc.txt"); // currently terminal is in java folder so need to
                                                                     // add tutorial other vise if terminal in tutorial
                                                                     // than direct
                BufferedReader br = new BufferedReader(fr);) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }

        catch (ArithmeticException ae) {// if fist exception e than no other sfter but it can be last

        } catch (NullPointerException npe) {

        } catch (ArrayIndexOutOfBoundsException | FileNotFoundException i) {
            System.out.println(i);
        } catch (Exception e) {
            System.out.println(e);
            // }catch(RuntimeException e){} //once met exception e than no tother e
        }
    }

}
