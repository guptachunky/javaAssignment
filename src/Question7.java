class StaticOperations {
    static String string = "GUPTA";


    public static void method() {
        int age = 22;
        System.out.println("SURNAME = "+string);
        System.out.println("AGE = "+age);
    }

    static {
        System.out.println("name = CHUNKS");
    }
}

public class Question7 {

    public static void main(String[] args) {

        StaticOperations obj = new StaticOperations();
        StaticOperations.method();


    }
}
