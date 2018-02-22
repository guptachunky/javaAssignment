import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        StringBuffer string= new StringBuffer();
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the string");
        string.append(scan.nextLine());
        string.reverse();
        System.out.println(string.substring(0,4)+string.substring(9,string.length()));

    }
}
