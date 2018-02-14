class Bank{

    public void getDetails(){
        System.out.println("Details");
    }
}


class SBI extends Bank{
    int rateOfInterest= 8 ;
    int loanRate = 10;
    public void getDetails(){
        System.out.println("SBI Rate Of Interest = "+rateOfInterest);
        System.out.println("SBI Loan Rate = "+loanRate);
    }
}

class BOI extends Bank{
    int rateOfInterest= 7 ;
    int loanRate = 12;
    public void getDetails(){
        System.out.println("BOI Rate Of Interest = "+rateOfInterest);
        System.out.println("BOI Loan Rate = "+loanRate);
    }
}

class ICICI extends Bank{
    int rateOfInterest= 9 ;
    int loanRate = 15;
    public void getDetails(){
        System.out.println("ICICI Rate Of Interest = "+rateOfInterest);
        System.out.println("ICICI Loan Rate = "+loanRate);
    }
}


public class Question12 {
    public static void main(String[] args) {

        new SBI().getDetails();
        new BOI().getDetails();
        new ICICI().getDetails();
    }
}
