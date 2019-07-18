package July17;
import july10.Account;
import july10.Workable;
import july17.Clerk;
import july17.Manager;

public class AccountsMain {
        public static void main(String[] args) throws Exception {
            Employee michael = new Manager("michael", 1, 1000);
            Employee dwight = new Clerk("dwight", 2, 100);


            Account moMoney = new Account(200,0,"mick");
            Account dMoney = new Account(200,20,"Andrew");

            michael.work(10, moMoney);
            dwight.work(10, dMoney);

            System.out.println(moMoney.getBalance());
            System.out.println(dMoney.getBalance());
        }
    }

