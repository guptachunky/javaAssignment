public class Question8 {
    public static void main(String[] args) {
        StringBuffer string= new StringBuffer("chunks gupta");
        string.reverse();
        System.out.println(string.substring(0,4)+string.substring(9,string.length()));

    }
}
