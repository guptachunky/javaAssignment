public class Question5 {
    public static void main(String[] args) {
        int[] array1={4,7,3,9,2};
        int[] array2={3,2,12,9,40,32,4};
        for(int i=0;i<array1.length;i++){
            for(int j=0;j<array2.length;j++){
                if(array1[i]==array2[j]){
                    System.out.println(array1[i]);
                }
            }
        }

    }
}
