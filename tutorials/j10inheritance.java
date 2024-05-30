class grandparent {
    String name = "grand";
    String surname = "sirname";
}

class parent extends grandparent {
    String name = "parent";
}

class child extends parent {
    String name = "child";
}



public class j10inheritance {
    public static void main(String[] args) {
        child ch = new child();
        System.out.println("hello");
        System.out.println(ch.name);
        System.out.println(ch.surname);
    }
}