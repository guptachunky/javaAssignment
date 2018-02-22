class Operations {
    public int add(int number1, int number2) {
        return number1 + number2;
    }

    public double add(double number1, double number2) {
        return number1 + number2;
    }

    public float multiply(float number1, float number2) {
        return number1 * number2;
    }

    public int multiply(int number1, int number2) {
        return number1 * number2;
    }

    public String concate(String string1, String string2) {
        return string1 + string2;
    }

    public String concate(String string1, String string2, String string3) {
        return string1 + string2 + string3;
    }
}


public class Question11 {

    public static void main(String[] args) {

        Operations object = new Operations();
        int number1 = 12;
        int number2 = 25;
        float number3 = 26;
        float number4 = 56;
        double number5 = 58.0;
        double number6 = 98.5;
        String string1="to ";
        String string2="the ";
        String string3="new ";
        System.out.println("Integer addition of  "+number1 +" and  "+ number2+ "= "+object.add(number1,number2));
        System.out.println("double addition  of  "+number5 +" and  "+ number6+ "= "+object.add(number5,number6));
        System.out.println("float multipliction of  "+number3 +" and  "+ number4+ "= "+object.multiply(number3,number4));
        System.out.println("Integer multipliction  of  "+number1 +" and  "+ number2+ "= "+object.multiply(number1,number2));
        System.out.println("2 string concatenation  of  "+string1 +" and  "+ string2+ "= "+object.concate(string1,string2));
        System.out.println("3 string concatenation  of  "+string1 +" and  "+ string2 +" and  "+ string3 + "= "+object.concate(string1,string2,string3));
    }
}
