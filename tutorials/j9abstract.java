public class j9abstract {
    public static void main(String[] args) {

    }
}
// no object for interface

// abstract and inr=terface for abstraction
// but abstraction 100% in interface
abstract class bank {
    String name;

    abstract void read();// (){}error

    abstract void write();

}

class admin extends bank {
    @Override
    void read() {
    }

    @Override
    void write() {
    }
}

interface mybank {
    void read();// (){}error
}

class admin2 implements mybank {
    @Override
    public void read() {
    }// no pubic error for reducing visiblity

}