import java.util.Scanner;
public class Question1 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the string");
        String string=scan.nextLine();
        System.out.println("Enter the String to replace");
        String replaceString=scan.nextLine();
        System.out.println("Enter the String to replace with ");
        String replacedString=scan.nextLine();
        System.out.println(string.replace(replaceString,replacedString));

    }
}
