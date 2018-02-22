enum house {
    house1, house2, house3, house4;


    int price1 = 100;
    int price2 = 200;
    int price3 = 300;
    int price4 = 400;



    public int getPrice(house h) {
        switch (h) {
            case house1:
                return price1;
            case house2:
                return price2;
            case house3:
                return price3;
            case house4:
                return price4;
            default:
                return -1;
        }
    }
}


public class Question10 {

    public static void main(String[] args) {

        house c1 = house.house1;
        house c2 = house.house2;
        house c3 = house.house3;
        house c4 = house.house4;
        System.out.println("house 1 "+c1.getPrice(c1));
        System.out.println("house 2 "+c1.getPrice(c2));
        System.out.println("house 3 "+c1.getPrice(c3));
        System.out.println("house 4 "+c1.getPrice(c4));

    }
}
