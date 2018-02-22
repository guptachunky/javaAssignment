import java.lang.invoke.LambdaConversionException;

interface table{
    void operation(int a);
}

class test{
    public String getName() {
        return name;
    }

    private String name ="chunks";
    private void pr(){
        System.out.println("hwvhken,w");
    }

}


//    MathOperation addittion=(int a,int b) -> a+b;
//=>
//      class addtion implements MathOperation{
//     int operation(int a,int b){
// return a+b;
// }
//
//
// }
//


public class check {


    public static void main(String[] args) {
        test obj=new test();
        System.out.println(obj.getName());
        table compute=(int a) -> {
            System.out.println(a +" *  1 = "+a*1);
            System.out.println(a +" *  2 = "+a*2);
            System.out.println(a +" *  3 = "+a*3);
            System.out.println(a +" *  4 = "+a*4);
            System.out.println(a +" *  5 = "+a*5);
            System.out.println(a +" *  6 = "+a*6);
            System.out.println(a +" *  7 = "+a*7);
            System.out.println(a +" *  8 = "+a*8);
            System.out.println(a +" *  9 = "+a*9);
            System.out.println(a +" *  10 = "+a*10);
        };
        compute.operation(66);

    }
}
