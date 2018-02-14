public class Question3 {
    public static void main(String[] args) {
        String string="tothenew";
        char ch='t';
        int length=string.length();
        int newLength=string.replace(ch+"","").length();
        System.out.println("occurrence = "+(length-newLength));
    }
}
