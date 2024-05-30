import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class j12filemanagement {
    public static void main(String[] args) throws Exception {
        System.out.println("file handling in java");
        File file = new File("tutorials/abc.txt");// location from respective of terminal
        // if terminal in tutorial than abc.txt but here terminal in java so
        // tutorial/acb.txt
        if (!file.exists()) {// check file exists or not
            try {
                file.createNewFile();
                System.out.println("file created");
            } catch (Exception e) {
                System.out.println("error: " + e);

            }
        } else {
            file.canRead();// only check that can we do or not but even true can not read or write
            // that/s why we need

            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Hi this is line from buffer write");
            bw.close();

            // fw.write("new line added");bw close no need for fw close
            // if
            // fw.close();// no close no data add

            FileReader fr = new FileReader(file);// if not try catch than in main throws exception
            BufferedReader br = new BufferedReader(fr);

            System.out.println(br.readLine());
            System.out.println(fr.read());// give -1

            br.close();
            // if bufferreader close than also fr close so error below
            // System.out.println(fr.read());// give error

        }
    }
}
