import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
//        String string="cHuNks95@Gupt@";
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the string");
        String string=scan.nextLine();
        double lowercase=0,uppercase=0,number=0,special=0;

        for(int i=0;i<string.length(); i++){
            if(string.charAt(i)>='a' && string.charAt(i)<='z'){
                lowercase++;
            }
            else if(string.charAt(i)>='A' && string.charAt(i)<='Z'){
                uppercase++;
            }
            else if(string.charAt(i)>='0' && string.charAt(i)<='9'){
                number++;
            }
            else
            {
                special++;
            }
        }

        System.out.println("lowercase = " + Math.round(lowercase*100/(string.length())));
        System.out.println("uppercase = " + Math.round(uppercase*100/(string.length())));
        System.out.println("number = " + Math.round(number*100/(string.length())));
        System.out.println("special = " + Math.round(special*100/(string.length())));

    }

}
