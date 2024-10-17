public class Q19 {
    public static void main(String[] args)throws low_bal {
        savingsaccont s1 = new savingsaccont();
        s1.depositamount(10000);
        s1.withdrawamount(7000);
        s1.withdrawamount(5000);
    }
}

class savingsaccont {
    int accountnumber;
    int balance;

    void depositamount(int amt){
        balance+= amt;
        System.out.println("amount deposited");
    }

    void withdrawamount(int amt)throws low_bal{
        try{
            if(balance < amt){
                throw new low_bal();
            }
            else{
                System.out.println("amount withdrawn.");
                balance -= amt;
            }
        }
        catch(low_bal e){
            System.out.println(e);
        }

    }
}

class low_bal extends Exception{
    low_bal(){
        super("not enought money to withdraw.");
    }
}