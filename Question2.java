public class Question2 {
    public static void main(String[] args) {

        String string="welcome to java session session java session";
        String[] array=string.split(" ");

        for(int i=0;i<array.length;i++){
            int count=1;
            if(array[i]!=""){
                for(int j=i+1;j<array.length;j++){
                    if(array[i].equals(array[j])){
                        count++;
                        array[j]="";
                    }
                }
            }

           if(count>1){
               System.out.println(array[i] +" occurrence = "+count);
           }
        }
    }
}
