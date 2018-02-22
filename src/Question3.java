import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
//        String string="tothenew";
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string");
        String string = scan.nextLine();
        char ch = 't';
        int length = string.length();
        int newLength = string.replace(ch + "", "").length();
        System.out.println("occurrence = " + (length - newLength));
    }
}
