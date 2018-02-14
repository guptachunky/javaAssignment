public class Question6 {
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 5, 4, 2, 3, 1, 4};
        int count=0;
        for (int i = 0; i < array.length; i++) {
            count=0;
            if (array[i] != -1) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] == array[j]) {
                        array[j] = -1;
                        count++;
                        break;
                    }
                }
                if(count==0){
                    System.out.println(array[i]);
                    break;
                }
            }


        }
    }
}
